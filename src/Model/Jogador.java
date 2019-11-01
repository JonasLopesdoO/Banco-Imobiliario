package Model;

import java.util.ArrayList;
import java.util.List;

public class Jogador{
	
	private String nome;
	private int saldo;
	private int indiceAtual;
	private Pino pino;
	private int qtdVezesNaPrisao;
	private ArrayList<TerrenoComercializavel> meuPatrimonio;
	private boolean ativo;
	
	public Jogador(String nome, Pino pino) {
		this.indiceAtual = CONSTANTES.INDICE_INICIO;
		this.saldo = CONSTANTES.SALDO_INICIAL;
		this.pino = pino;
		this.nome = nome;
		this.qtdVezesNaPrisao = 0;
		this.meuPatrimonio = new ArrayList<TerrenoComercializavel>();
		this.ativo = true;
	}
	
	public void moverPino(int x, int y){
		pino.mover(x, y);
	}

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	public int getIndiceAtual() {
		return indiceAtual;
	}

	public void setIndiceAtual(int indiceAtual) {
		this.indiceAtual = indiceAtual;
	}

	public String getNome() {
		return nome;
	}

	public Pino getPino() {
		return pino;
	}

	public ArrayList<TerrenoComercializavel> getMeuPatrimonio() {
		return meuPatrimonio;
	}

	public int getQtdVezesNaPrisao() {
		return qtdVezesNaPrisao;
	}
	
	public void estadiaNaPrisao(){
		this.qtdVezesNaPrisao++;
	}
	
	public void pedagio(Jogador proprietario, int taxa){
		pagarTaxa(taxa);
		proprietario.receberTaxa(taxa);
	}
	
	public boolean jogadorPossuiTerrenos(){
		if(getTerrenos().size() != 0){
			return true;
		}
		return false;
	}
	
	public List<TerrenoComercializavel> getTerrenos(){
		List<TerrenoComercializavel> ter = new ArrayList<TerrenoComercializavel>();
		
		for(TerrenoComercializavel t : meuPatrimonio){
			if(t.getHipotecada() == false){
				ter.add(t);
			}
		}
		return ter;
	}

	public void zerarRodadasPrisao(){
		this.qtdVezesNaPrisao = 0;
	}
	
	public boolean removerTerrenoDoPatrimonio(TerrenoComercializavel t){
		if(meuPatrimonio.contains(t)){
			t.vender();
			meuPatrimonio.remove(t);
			return true;
		}
		return false;
	}
	
	public void addTerrenoAoPatrimonio(TerrenoComercializavel t){
		if(!meuPatrimonio.contains(t)){
			t.comprar(this);
			meuPatrimonio.add(t);
		}else{
			System.out.println();
		}
	}
	public void fimDeJogo(){
		this.ativo = false; 
	}
	
	public boolean ativo(){
		return ativo;
	}
	
	public void receberTaxa(int taxa){
		this.saldo += taxa;
	}
	
	public void pagarTaxa(int taxa){
		this.saldo -= taxa;
	}
	public void setEstouNaPrisao(int estouNaPrisao) {
		this.qtdVezesNaPrisao = estouNaPrisao;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
		
}
