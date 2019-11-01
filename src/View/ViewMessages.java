package View;

import javax.swing.JOptionPane;

import Model.CONSTANTES;
import Model.Jogador;
import Model.SorteOuRevez;
import Model.TerrenoComercializavel;
import Terreno.Residencia.Casa;
import Terreno.Transporte.Transporte;

public class ViewMessages {
	
	private static ViewMessages viewerMessagens;
	
	private ViewMessages() {
		// TODO Auto-generated constructor stub
	}
	
	public static ViewMessages getInstance(){
		if(viewerMessagens == null){
			viewerMessagens = new ViewMessages();
		}
		return viewerMessagens;
	}
	
	public void MensagemTerrenoInicio(Jogador jogador){
		JOptionPane.showMessageDialog(null, "Jogador "+jogador.getNome()+" pisou no terreno Inicial e ganhou 200 reais"
											+"\nSeu saldo agora é de: " + jogador.getSaldo());
		
		System.out.println("Jogador "+jogador.getNome()+" pisou no terreno Inicial e ganhou 200 reais");
		System.out.println("Seu saldo agora é de: " + jogador.getSaldo());
	}
	
	
	public void MensagemTerrenoaEggMen(Jogador jogador){
		JOptionPane.showMessageDialog(null, "Jogador "+jogador.getNome()+" pisou no terreno EggMen e perdeu 200 reais"
				+"\nSeu saldo agora é de: " + jogador.getSaldo());
		
		System.out.println("Jogador "+jogador.getNome()+"  pisou no terreno EggMen e perdeu 200 reais");
		System.out.println("Seu saldo agora é de: " + jogador.getSaldo());
	}
	
	public void MensagemTerrenoaGiftExpensive(Jogador jogador){
		JOptionPane.showMessageDialog(null, "Jogador "+jogador.getNome()+" pisou no terreno Gift Expensive e perdeu 100 reais"
				+"\nSeu saldo agora é de: " + jogador.getSaldo());
		
		System.out.println("Jogador "+jogador.getNome()+" pisou no terreno Gift Expensive e perdeu 100 reais");
		System.out.println("Seu saldo agora é de: " + jogador.getSaldo());
	}

	public void MensagemTerrenoaTeamBabylon(Jogador jogador){
		JOptionPane.showMessageDialog(null, "Jogador "+jogador.getNome()+" pisou no terreno Team Babylon e perdeu 100 reais"
									+"\nSeu saldo agora é de: " + jogador.getSaldo());
		
		System.out.println("Jogador "+jogador.getNome()+" pisou no terreno Team Babylon e perdeu 100 reais");
		System.out.println("Seu saldo agora é de: " + jogador.getSaldo());
	}
	
	public void MensagemTerrenoaTeamChaotic(Jogador jogador){
		JOptionPane.showMessageDialog(null, "Jogador "+jogador.getNome()+" pisou no terreno Team Chaotic e perdeu 100 reais"
				+"\nSeu saldo agora é de: " + jogador.getSaldo());
		
		System.out.println("Jogador "+jogador.getNome()+"  pisou no terreno Team Chaotic e perdeu 100 reais");
		System.out.println("Seu saldo agora é de: " + jogador.getSaldo());
	}
	
	public int MensagemComprarPropriedadeCasa(Casa casa, Jogador j){
		return JOptionPane.showConfirmDialog(null, 
						j.getNome()+" você deseja comprar essa casa?",
					                             "COMPRAR CASA "+ casa.getDescricao(), 
					                             JOptionPane.YES_NO_OPTION);

	}
	public int MensagemComprarPropriedadeTransporte(Transporte trans, Jogador j){
		return JOptionPane.showConfirmDialog(null, 
						j.getNome()+" você deseja comprar esse transporte?",
					                             "COMPRAR TRANSPORTE "+trans.getDescricao(), 
					                             JOptionPane.YES_NO_OPTION);

	}
	public void MensagemPagarAluguel(Casa casa,Jogador jogador){
		JOptionPane.showMessageDialog(null, "Jogador caiu na casa "+casa.getDescricao()+
									", do proprietario "+ casa.getProprietario().getNome()+
									"\n"+jogador.getNome()+" pague "+ casa.valorAluguelNoCasa()+
											" ao jogador "+ casa.getProprietario().getNome()+
											"\nSeu saldo agora é de: " + jogador.getSaldo());
		
		System.out.println("Jogador "+jogador.getNome()+" pagou "+ casa.valorAluguelNoCasa()+
							" ao jogador "+ casa.getProprietario().getNome());
		System.out.println("Seu saldo agora é de: " + jogador.getSaldo());
	}
	public void MensagemPagarAluguelTransporte(Transporte trans,Jogador jogador){
		JOptionPane.showMessageDialog(null, "Jogador "+jogador.getNome()+" pagou "+ trans.getValorAluguel1Transporte()+
										" ao jogador "+ trans.getProprietario().getNome()+
										"\nSeu saldo agora é de: " + jogador.getSaldo());
		
		System.out.println("Jogador "+jogador.getNome()+" pagou "+ trans.getValorAluguel1Transporte()+
							" ao jogador "+ trans.getProprietario().getNome());
		System.out.println("Seu saldo agora é de: " + jogador.getSaldo());
	}


	public void MensagemVaParaCadeia(Jogador jogador) {
		 JOptionPane.showMessageDialog(null, "Você vai para a cadeia agora! " + jogador.getNome());
	}
	
	
	public void MensagemSorteOuRevez(SorteOuRevez SR, Jogador jogador) {
		JOptionPane.showMessageDialog(null, SR.getDescricao()+"\nSeu saldo agora é de: " + jogador.getSaldo());
		
		System.out.println(SR.getDescricao()+"Seu saldo agora é de: " + jogador.getSaldo());
	}

	public String mostrarInputNomeJogador(int i){
		return JOptionPane.showInputDialog(null, "Digite o nome do "+(i+1)+"º jogador: ", "Adicionar Jogador", JOptionPane.QUESTION_MESSAGE);
	}
	
	public void mostrarMensagemCampeao(Jogador j) {
		JOptionPane.showMessageDialog(null, j.getNome()+", VOCÊ VENCEU!!!",
				                      "CAMPEÃO", 
				                      JOptionPane.OK_OPTION);
	}
	
	public void mensagemInicioTurno(String nomeJogador){
		JOptionPane.showMessageDialog(null, 
				                      nomeJogador+" sua vez de jogar.",
				                      "NOVA JOGADA", 
				                      JOptionPane.INFORMATION_MESSAGE);
	}
	
	public TerrenoComercializavel mensagemSaldoInsuficiente(Object[] vetor){
		return (TerrenoComercializavel)JOptionPane.showInputDialog(null, "ATENÇÃO. Dinheiro insuficiente para pagar a taxa atual.\n"
									  + "Você vai ter que hipotecar algo\n\n"
									  + "Selecione o imovel que você deseja hipotecar", 
									  "HIPOTECAR",
									  JOptionPane.WARNING_MESSAGE,
									  null,
									  vetor,
									  null);
	}
	
	
	public void mensagemDadosIguais3X(){
		JOptionPane.showMessageDialog(null, "OS DADOS DERAM IGUAIS 3X CONSECUTIVAS. ISSO É MUITA SORTE, OU MUITO AZAR, VÁ PARA A PRISÃO AGORA!");
	}
	
	public int mensagemPagarSairPrisao(){
		return JOptionPane.showConfirmDialog(null, 
				                             "VOcê Deseja pagar R$ "+CONSTANTES.TAXA_PRISAO+" e sair da prisão agora?",
				                             "PAGAR PARA SAIR DA PRISÃO", 
				                             JOptionPane.YES_NO_OPTION);
	}
	public void mensagemSaldoInsuficienteComprarLogradouro() {
		JOptionPane.showMessageDialog(null,"Você não tem rings o suficiente para comprar essa propriedade", 
				                     "RINGS INSUFICIENTE", 
				                     JOptionPane.OK_OPTION);
		
	}
	
	public void mensagemSorte(String descricao, int valor){
		JOptionPane.showMessageDialog(null, descricao+"\nReceba R$ "+valor, "SORTE",
									 JOptionPane.INFORMATION_MESSAGE);			
	}
	
	public void mensagemReves(String descricao, int valor){
		JOptionPane.showMessageDialog(null, descricao+"\nPague R$ "+valor,"REVÉS",
									 JOptionPane.INFORMATION_MESSAGE);			
	}
	public void mensagemFimDeJogo(String nomeJogador) {
		JOptionPane.showMessageDialog(null, 
                					 nomeJogador+", Você acabou de falir o capitalismo é mesmo selvagem. saia do jogo", 
                					 "FALIU", 
                					 JOptionPane.OK_OPTION);
		
	}
}
