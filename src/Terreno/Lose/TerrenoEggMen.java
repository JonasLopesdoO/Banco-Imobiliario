package Terreno.Lose;

import Model.Jogador;
import Model.Localizacao;
import Model.Terreno;
import View.ViewMessages;

public class TerrenoEggMen extends Terreno{
	public TerrenoEggMen(){
		Localizacao localizacao = new Localizacao(430,700);  
		setLocalizacao(localizacao);
		setDescricao("Egg Men");
		setIndice(4);
	}
	public void efeito(Jogador jogador) {
		jogador.pagarTaxa(200);
		ViewMessages.getInstance().MensagemTerrenoaEggMen(jogador);
	}


}
