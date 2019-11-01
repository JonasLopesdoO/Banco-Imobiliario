package Model;

import View.ViewMessages;

public class Revez extends SorteOuRevez{

	public Revez(String descricao, int valor) {
		super(descricao, valor);
		// TODO Auto-generated constructor stub
	}

	public void efeito(Jogador jogador) {
		ViewMessages.getInstance().mensagemReves(this.getDescricao(), this.getValor());
		jogador.pagarTaxa(getValor());
		
	}

}
