package Instaciators;

import java.util.ArrayList;

import Model.Revez;
import Model.Sorte;
import Model.SorteOuRevez;
import Terreno.Cadeia.TerrenoCadeia;
import Terreno.Cadeia.TerrenoVaParaCadeia;
import Terreno.Inicial.TerrenoInicial;
import Terreno.Lose.TerrenoEggMen;
import Terreno.Lose.TerrenoGiftExpense;
import Terreno.Lose.TerrenoTeamBabylon;
import Terreno.Lose.TerrenoTeamChaotic;
import Terreno.PasseLivre.TerrenoPasseLivre;
import Terreno.Residencia.Casa11PumpkinHills;
import Terreno.Residencia.Casa12MetalHarbor;
import Terreno.Residencia.Casa21CityEscape;
import Terreno.Residencia.Casa22MisticMansion;
import Terreno.Residencia.Casa23FrogForest;
import Terreno.Residencia.Casa31RaidyHill;
import Terreno.Residencia.Casa32SpeedHighway;
import Terreno.Residencia.Casa33SkySantuary;
import Terreno.Residencia.Casa41ChemicalPlant;
import Terreno.Residencia.Casa42GreenHill;
import Terreno.Residencia.Casa43BabylonGarden;
import Terreno.Residencia.Casa51SandRuins;
import Terreno.Residencia.Casa52MetalCity;
import Terreno.Residencia.Casa53Apotes;
import Terreno.Residencia.Casa61Holoska;
import Terreno.Residencia.Casa62EmpireCity;
import Terreno.Residencia.Casa63SweetMontain;
import Terreno.Residencia.Casa71TropicalResort;
import Terreno.Residencia.Casa72PlanetWisp;
import Terreno.Residencia.Casa73SyevanaCastle;
import Terreno.Residencia.Casa81SplashHill;
import Terreno.Residencia.Casa82MadGear;
import Terreno.Transporte.Transporte1SpeedStar;
import Terreno.Transporte.Transporte2Tornado;
import Terreno.Transporte.Transporte3ExtremeGear;
import Terreno.Transporte.Transporte4EggMobile;

public class InstanciadoraDeSorteOuRevez {
	
	private static InstanciadoraDeSorteOuRevez sorteOuRevez;
	
	private InstanciadoraDeSorteOuRevez() {
		
	}
	
	public static InstanciadoraDeSorteOuRevez getInstance(){
		if(sorteOuRevez == null){
			sorteOuRevez = new InstanciadoraDeSorteOuRevez();
		}
		return sorteOuRevez;
	}
	
	public ArrayList<SorteOuRevez> instancias(){
		ArrayList<SorteOuRevez> listaDeInstancias = new ArrayList<SorteOuRevez>();
		
		SorteOuRevez carta1 = new Sorte("Doutor EggMan viajou voce ganhou 50 rings",50);
		SorteOuRevez carta2 = new Revez("Tales está doente pague a taxa de 100 ao hospital rings ",100);
		SorteOuRevez carta3 = new Sorte("Doutor EggMan foi atingido, ganhe 100 rings",100);
		SorteOuRevez carta4 = new Revez("Chaos está vindo a sua cidade, reforce a barricada, 100 rings",100);
		SorteOuRevez carta5 = new Sorte("Knuckles encontrou o tesouro de rings, ganhe 150 rings",150);
		SorteOuRevez carta6 = new Revez("Knuckles foi preso, pague a fianca com 150 rings",150);
		SorteOuRevez carta7 = new Sorte("Shadow deixou um tesouro para voce, receba 50 rings",50);
		SorteOuRevez carta8 = new Revez("Hoje é dia de levar Amy para comer marshmallows, pague 50",50);
		SorteOuRevez carta9 = new Sorte("Rouge está de bom humor e vai compartilhar suas joias, receba 100 rings",100);
		SorteOuRevez carta10 = new Revez("Big the cat perdeu seu sapo denovo, ajude-o com 50 rings",50);
		SorteOuRevez carta11 = new Sorte("Charmy Bee te deu 50 moedas",50);
		SorteOuRevez carta12 = new Revez("Vector o crocodilo te roubou 100 rings quando voce dormia",100);
		SorteOuRevez carta13 = new Sorte("Blaze deixou cair rings, achado não é roubado, ganhe 100 rings",100);
		SorteOuRevez carta14 = new Revez("Jet danificou seu bracelete, ajude-o com 100 rings",100);
	
		listaDeInstancias.add(carta1);
		listaDeInstancias.add(carta2);
		listaDeInstancias.add(carta3);
		listaDeInstancias.add(carta4);
		listaDeInstancias.add(carta5);
		listaDeInstancias.add(carta6);
		listaDeInstancias.add(carta7);
		listaDeInstancias.add(carta8);
		listaDeInstancias.add(carta9);
		listaDeInstancias.add(carta10);
		listaDeInstancias.add(carta11);
		listaDeInstancias.add(carta12);
		listaDeInstancias.add(carta13);
		listaDeInstancias.add(carta14);
		
		return listaDeInstancias;
	}
}
