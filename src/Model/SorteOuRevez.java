package Model;

import Interfaces.IAcao;


public abstract class SorteOuRevez implements IAcao{
	private String descricao;
	private int valor;
	
	public SorteOuRevez(String descricao, int valor) {
		this.descricao = descricao;
		this.valor = valor;
	}
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao, int valor) {
		this.descricao = descricao;
	}
	public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
}
