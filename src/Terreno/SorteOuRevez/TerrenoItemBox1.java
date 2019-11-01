	package Terreno.SorteOuRevez;

import java.util.ArrayList;
import java.util.Random;

import Controladores.ControladorSorteOuRevez;
import Model.Jogador;
import Model.Localizacao;
import Model.SorteOuRevez;
import Model.Terreno;
import View.ViewMessages;

public class TerrenoItemBox1 extends Terreno{
	public TerrenoItemBox1(){
		Localizacao localizacao = new Localizacao(560,700);  
		setLocalizacao(localizacao);
		setDescricao("ItemBox");
		setIndice(2);
		
	}
	public void efeito(Jogador jogador) {
		Random random = new Random();
		ArrayList<SorteOuRevez> listaSR = ControladorSorteOuRevez.getInstance().getSorteOuReves();
		int x = random.nextInt(listaSR.size());
		listaSR.get(x).efeito(jogador);
		ViewMessages.getInstance().MensagemSorteOuRevez(listaSR.get(x), jogador);
	}


}
