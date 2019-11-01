package Terreno.Cadeia;

import Model.Jogador;
import Model.Localizacao;
import Model.Terreno;

public class TerrenoCadeia extends Terreno {

	public TerrenoCadeia() {
		Localizacao localizacao = new Localizacao(30, 700);
		setLocalizacao(localizacao);
		setDescricao("Cadeia");
		setIndice(9);
	}



	public void efeito(Jogador jogador) {
		jogador.estadiaNaPrisao();
		
	}
	
	
	
	
}
