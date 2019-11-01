package Terreno.Lose;

import Model.Jogador;
import Model.Localizacao;
import Model.Terreno;
import View.ViewMessages;

public class TerrenoGiftExpense extends Terreno{
	public TerrenoGiftExpense() {
		Localizacao localizacao = new Localizacao(710,560);  
		setLocalizacao(localizacao);
		setDescricao("Gift Expense");
		setIndice(38);
	}

	public void efeito(Jogador jogador) {
		jogador.pagarTaxa(100);
		ViewMessages.getInstance().MensagemTerrenoaGiftExpensive(jogador);
	}

}
