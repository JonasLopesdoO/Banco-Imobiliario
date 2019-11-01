package Controladores;


import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import Model.CONSTANTES;
import Model.Dado;
import Model.Jogador;
import Model.Localizacao;
import Model.Pino;
import Model.Terreno;
import View.TabuleiroViewer;
import View.ViewMessages;

public class ControladorTabuleiro {
	
	private int qtdDadosIguais;;
	private int somaDados;
	private static ControladorTabuleiro tabuleiro;
	private List<Dado> dados;
	int x,y;
	
	private ControladorTabuleiro() {
		dados = new ArrayList<Dado>();
		dados.add(new Dado(600,120));
		dados.add(new Dado(460,120));
		qtdDadosIguais = 0;
		somaDados = 0;
	}
	
	public static ControladorTabuleiro getInstance(){
		if(tabuleiro == null){
			tabuleiro = new ControladorTabuleiro();
		}
		return tabuleiro;
	}
	
	public void iniciarJogo(){
		addJogadores();
		fluxoJogo();
	}
	

	private void addJogadores(){
		for(int i=0; i<CONSTANTES.MAX_JOGADORES; i++){
			String nome = ViewMessages.getInstance().mostrarInputNomeJogador(i);
			
			Jogador j = new Jogador(nome, new Pino(i+1));
			ControladorJogador.getInstance().addJogador(j);
		}
	}
	
	public void fluxoJogo(){
		boolean continuar = true;
		while(continuar){
			if(verificarSeExisteCampeao()){
				continuar = false;
			}else{
				for(Jogador j : ControladorJogador.getInstance().getJogadoresAtivos()){			
					
					ViewMessages.getInstance().mensagemInicioTurno(j.getNome());
					TabuleiroViewer.getInstance().drawPino();
					jogada(j);
					TabuleiroViewer.getInstance().drawPino();
				}	
			}
		}
	}
	
	private boolean verificarSeExisteCampeao(){
		if(ControladorJogador.getInstance().getQuantJogadoresAtivos() == 1){
			ViewMessages.getInstance().mostrarMensagemCampeao(ControladorJogador.getInstance().
														getJogadoresAtivos().get(0));
			return true;
		}
		return false;
	}
	
	public void jogada(Jogador jogadorDaVez){
		arremessarDados(jogadorDaVez);
	}
	
	public void arremessarDados(Jogador jogadorDaVez){
			if((jogadorDaVez.getQtdVezesNaPrisao() >= 1) && (jogadorDaVez.getQtdVezesNaPrisao() <= 3)){
				
				if(ViewMessages.getInstance().mensagemPagarSairPrisao() == JOptionPane.YES_OPTION){
					jogadorDaVez.pagarTaxa(CONSTANTES.TAXA_PRISAO);
					jogadorDaVez.zerarRodadasPrisao();
				}else{
					for(int i=0;i<dados.size();i++){
						dados.get(i).lancar();
						somaDados += dados.get(i).getValorDado();
					}
					
					if(!verificaDadosIguais(dados)){
						jogadorDaVez.estadiaNaPrisao();
						somaDados = 0;
						return;
					}
				}
			}
			
			for(int i=0;i<dados.size();i++){
				dados.get(i).lancar();
				somaDados += dados.get(i).getValorDado();
			}
			
		
			if(verificaDadosIguais(dados) == false){
				qtdDadosIguais = 0;
				atualizarPosicao(jogadorDaVez, somaDados);
				somaDados = 0;
			}else{
				qtdDadosIguais++;
				if(qtdDadosIguais == 3){
					ViewMessages.getInstance().mensagemDadosIguais3X();
					enviaParaPrisao(jogadorDaVez);
					somaDados = 0;
					qtdDadosIguais = 0;
				}else{
					atualizarPosicao(jogadorDaVez, somaDados);
					somaDados = 0;
					jogada(jogadorDaVez);
				}
				
			}
	}
	
	private void atualizarPosicao(Jogador jogador, int somaDosDados) {
		int calcBonus = jogador.getIndiceAtual() + somaDosDados;
		int indice = (calcBonus)%40;
		Terreno localJogador = selecionaTerreno(indice);
		jogador.setIndiceAtual(indice);
		x = localJogador.getLocalizacao().getX();
		y = localJogador.getLocalizacao().getY();
		jogador.moverPino(x,y);
		TabuleiroViewer.getInstance().drawPino();
		localJogador.efeito(jogador);
		verificaPassouInicio(calcBonus, jogador);
		somaDados = 0;
	}

	private void enviaParaPrisao(Jogador jogador) {
		Localizacao localDestino = ControladorTerrenos.getInstance().prisao();
		x = localDestino.getX();
		y = localDestino.getY();
		jogador.moverPino(x, y);
		Terreno prisao = selecionaTerreno(CONSTANTES.INDICE_PRISAO);
		prisao.efeito(jogador);
		TabuleiroViewer.getInstance().drawPino();
	}

	private Terreno selecionaTerreno(int indice) {
		return ControladorTerrenos.getInstance().getTerrenos().get(indice);
	}

	private void verificaPassouInicio(int calcBonus,Jogador jogador) {
		if(calcBonus >= 40){
			ControladorTerrenos.getInstance().obterTerreno(CONSTANTES.INDICE_INICIO).efeito(jogador);
		}
	}

	public List<Dado> getDados(){
		return dados;
	}
	
	private boolean verificaDadosIguais(List<Dado> dados) {
		if(dados.get(0).getValorDado() == dados.get(0).getValorDado()){
			return true;
		}else{
			return false;
		}
	}
	
}
