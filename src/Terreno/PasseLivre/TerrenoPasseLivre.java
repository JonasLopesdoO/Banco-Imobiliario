package Terreno.PasseLivre;

import Model.Jogador;
import Model.Localizacao;
import Model.Terreno;

public class TerrenoPasseLivre extends Terreno{
	public TerrenoPasseLivre(){
		Localizacao localizacao = new Localizacao(20,20);  
		setLocalizacao(localizacao);
		setDescricao("Passe Livre");
		setIndice(20);
	}
	public void efeito(Jogador jogador) {
		//terreno que nao possui efeito
		
	}


}
