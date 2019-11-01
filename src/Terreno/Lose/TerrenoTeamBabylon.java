package Terreno.Lose;

import Model.Jogador;
import Model.Localizacao;
import Model.Terreno;
import View.ViewMessages;

public class TerrenoTeamBabylon extends Terreno{

	public TerrenoTeamBabylon() {
		Localizacao localizacao = new Localizacao(560,20);  
		setLocalizacao(localizacao);
		setDescricao("Team Babylon");
		setIndice(28);
	}
	public void efeito(Jogador jogador) {
		jogador.pagarTaxa(100);
		ViewMessages.getInstance().MensagemTerrenoaTeamBabylon(jogador);
		
	}


}
