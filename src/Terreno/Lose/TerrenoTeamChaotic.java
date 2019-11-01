package Terreno.Lose;

import Model.Jogador;
import Model.Localizacao;
import Model.Terreno;
import View.ViewMessages;

public class TerrenoTeamChaotic extends Terreno{
	public TerrenoTeamChaotic() {
		Localizacao localizacao = new Localizacao(20,560);  
		setLocalizacao(localizacao);
		setDescricao("Team Chaotic");
		setIndice(12);
	}
	public void efeito(Jogador jogador) {
		jogador.pagarTaxa(100);
		ViewMessages.getInstance().MensagemTerrenoaTeamChaotic(jogador);
		
	}


}
