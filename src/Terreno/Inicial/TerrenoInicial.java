package Terreno.Inicial;


import Model.Jogador;
import Model.Localizacao;
import Model.Terreno;
import View.ViewMessages;

public class TerrenoInicial extends Terreno{

	public TerrenoInicial() {
		Localizacao localizacao = new Localizacao(700,700);  
		setLocalizacao(localizacao);
		setDescricao("Casa de início");
		setIndice(0);
	}
	public void efeito(Jogador jogador) {
		jogador.receberTaxa(200);
		ViewMessages.getInstance().MensagemTerrenoInicio(jogador);
	}

}
