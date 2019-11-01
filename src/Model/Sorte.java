package Model;

import View.ViewMessages;

public class Sorte extends SorteOuRevez{
	
	
	public Sorte(String descricao, int valor) {
		super(descricao, valor);
		// TODO Auto-generated constructor stub
	}

	public void efeito(Jogador jogador) {
		ViewMessages.getInstance().mensagemSorte(this.getDescricao(), this.getValor());
		jogador.receberTaxa(getValor());
	}

}
