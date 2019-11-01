package Terreno.Cadeia;

import Controladores.ControladorTerrenos;
import Model.Jogador;
import Model.Localizacao;
import Model.Terreno;
import View.ViewMessages;

public class TerrenoVaParaCadeia extends Terreno{

	public TerrenoVaParaCadeia() {
		Localizacao localizacao = new Localizacao(700, 30);
		setLocalizacao(localizacao);
		setDescricao("Envia para a cadeia");
		setIndice(30);
	}
	public void efeito(Jogador jogador) {
		ViewMessages.getInstance().MensagemVaParaCadeia(jogador);
		Localizacao prisao = ControladorTerrenos.getInstance().prisao();
		jogador.moverPino(prisao.getX(), prisao.getY());
		jogador.getPino().draw();
	}
}
