package Model;


public abstract class TerrenoComercializavel extends Terreno{

	private Jogador proprietario;
	private boolean hipotecada;
	private int valorHipoteca;
	
	public Jogador getProprietario() {
		return proprietario;
	}

	public void setProprietario(Jogador proprietario) {
		this.proprietario = proprietario;
	}
	
	public void comprar(Jogador proprietario){
		this.proprietario = proprietario;
	}
	
	public void hipotecar() {
		setHipotecada(true);
		getProprietario().receberTaxa(valorHipoteca());
	}
	
	public void vender(){
		this.proprietario = null;
	}
//	
//	public void hipotecar() {
//		setHipotecada(true);
//		getProprietario().receberTaxa(valorHipoteca());
//		ViewMessages.getInstance().mensagemHipotecar(this.descricao, this.valorHipoteca);
//	}
	
	
	public boolean getHipotecada() {
		return hipotecada;
	}
	

	public void setHipotecada(boolean hipotecada) {
		this.hipotecada = hipotecada;
	}

	public int valorHipoteca() {
		return valorHipoteca;
	}

	public void setValorHipoteca(int valorHipoteca) {
		this.valorHipoteca = valorHipoteca;
	}

}
