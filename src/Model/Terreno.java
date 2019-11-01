package Model;

import Interfaces.IAcao;

public abstract class Terreno implements IAcao{
	private String descricao;
	private Localizacao localizacao;
	private int indice;
	
	public Terreno(){
	}
	
	public Localizacao getLocalizacao() {
		return localizacao;
	}
	public void setLocalizacao(Localizacao localizacao) {
		this.localizacao = localizacao;
	}
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getIndice() {
		return indice;
	}

	public void setIndice(int indice) {
		this.indice = indice;
	}
	
}
