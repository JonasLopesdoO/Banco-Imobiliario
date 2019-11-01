package Instaciators;

import java.util.ArrayList;

import Model.Terreno;
import Model.TerrenoComercializavel;
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
import Terreno.SorteOuRevez.TerrenoBadnik1;
import Terreno.SorteOuRevez.TerrenoBadnik2;
import Terreno.SorteOuRevez.TerrenoBadnik3;
import Terreno.SorteOuRevez.TerrenoItemBox1;
import Terreno.SorteOuRevez.TerrenoItemBox2;
import Terreno.SorteOuRevez.TerrenoItemBox3;
import Terreno.Transporte.Transporte1SpeedStar;
import Terreno.Transporte.Transporte2Tornado;
import Terreno.Transporte.Transporte3ExtremeGear;
import Terreno.Transporte.Transporte4EggMobile;

public class InstanciadoraDeTerrenos {
	private static InstanciadoraDeTerrenos fabricaTerrenos;
	
	private InstanciadoraDeTerrenos() {
		
	}
	
	public static InstanciadoraDeTerrenos getInstance(){
		if(fabricaTerrenos == null){
			fabricaTerrenos = new InstanciadoraDeTerrenos();
		}
		return fabricaTerrenos;
	}
	
	public ArrayList<Terreno> instancias(){
		ArrayList<Terreno> listaDeInstancias = new ArrayList<Terreno>();
		
		Terreno terrenoCadeia = new TerrenoCadeia();
		Terreno terrenoVaParaCadeia = new TerrenoVaParaCadeia();
		Terreno terrenoInicial = new TerrenoInicial();
		Terreno terrenoEggMen = new TerrenoEggMen();
		Terreno terrenoGiftExpense = new TerrenoGiftExpense();
		Terreno terrenoTeamBabylon = new TerrenoTeamBabylon();
		Terreno terrenoTeamChaotic = new TerrenoTeamChaotic();
		Terreno terrenoPasseLivre = new TerrenoPasseLivre();
		TerrenoComercializavel casaPumpkinHills = new Casa11PumpkinHills();
		TerrenoComercializavel casaMetalHarbor = new Casa12MetalHarbor();
		TerrenoComercializavel casaCityEscape = new Casa21CityEscape();
		TerrenoComercializavel casaMisticMansion = new Casa22MisticMansion();
		TerrenoComercializavel casaFrogForest = new Casa23FrogForest();
		TerrenoComercializavel casaRaidyHill = new Casa31RaidyHill();
		TerrenoComercializavel casaSpeedHighway = new Casa32SpeedHighway();
		TerrenoComercializavel casaSkySantuary = new Casa33SkySantuary();
		TerrenoComercializavel casaChemicalPlant = new Casa41ChemicalPlant();
		TerrenoComercializavel casaGreenHill = new Casa42GreenHill();
		TerrenoComercializavel casaBabylonGarden = new Casa43BabylonGarden();
		TerrenoComercializavel casaSandRuins = new Casa51SandRuins();
		TerrenoComercializavel casaMetalCity = new Casa52MetalCity();
		TerrenoComercializavel casaApotes = new Casa53Apotes();
		TerrenoComercializavel casaHoloska = new Casa61Holoska();
		TerrenoComercializavel casaEmpireCity = new Casa62EmpireCity();
		TerrenoComercializavel casaSweetMontain = new Casa63SweetMontain();
		TerrenoComercializavel casaTropicalResort = new Casa71TropicalResort();
		TerrenoComercializavel casaPlanetWisp = new Casa72PlanetWisp();
		TerrenoComercializavel casaSyevanaCastle = new Casa73SyevanaCastle();
		TerrenoComercializavel casaSplashHill = new Casa81SplashHill();
		TerrenoComercializavel casaMadGear = new Casa82MadGear();
		Terreno badnik1 = new TerrenoBadnik1();
		Terreno badnik2 = new TerrenoBadnik2();
		Terreno badnik3 = new TerrenoBadnik3();
		Terreno itemBox1 = new TerrenoItemBox1();
		Terreno itemBox2 = new TerrenoItemBox2();
		Terreno itemBox3 = new TerrenoItemBox3();
		TerrenoComercializavel speedStar = new Transporte1SpeedStar();
		TerrenoComercializavel tornado = new Transporte2Tornado();
		TerrenoComercializavel extremeGear = new Transporte3ExtremeGear();
		TerrenoComercializavel eggMobile = new Transporte4EggMobile();
		
		listaDeInstancias.add(terrenoInicial);			//0
		listaDeInstancias.add(casaPumpkinHills);		//1
		listaDeInstancias.add(itemBox1);				//2
		listaDeInstancias.add(casaMetalHarbor);			//3
		listaDeInstancias.add(terrenoEggMen);			//4
		listaDeInstancias.add(speedStar);				//5
		listaDeInstancias.add(casaCityEscape);			//6
		listaDeInstancias.add(badnik1);					//7
		listaDeInstancias.add(casaMisticMansion);		//8
		listaDeInstancias.add(casaFrogForest);			//9
		listaDeInstancias.add(terrenoCadeia);			//10
		listaDeInstancias.add(casaRaidyHill);			//11
		listaDeInstancias.add(terrenoTeamChaotic);		//12
		listaDeInstancias.add(casaSpeedHighway);		//13
		listaDeInstancias.add(casaSkySantuary);			//14
		listaDeInstancias.add(tornado);					//15
		listaDeInstancias.add(casaChemicalPlant);		//16
		listaDeInstancias.add(itemBox2);				//17
		listaDeInstancias.add(casaGreenHill);			//18
		listaDeInstancias.add(casaBabylonGarden);		//19
		listaDeInstancias.add(terrenoPasseLivre);		//20
		listaDeInstancias.add(casaSandRuins);			//21
		listaDeInstancias.add(badnik2);					//22
		listaDeInstancias.add(casaMetalCity);			//23
		listaDeInstancias.add(casaApotes);				//24
		listaDeInstancias.add(extremeGear);				//25
		listaDeInstancias.add(casaHoloska);				//26
		listaDeInstancias.add(casaEmpireCity);			//27
		listaDeInstancias.add(terrenoTeamBabylon);		//28
		listaDeInstancias.add(casaSweetMontain);		//29
		listaDeInstancias.add(terrenoVaParaCadeia);		//30
		listaDeInstancias.add(casaTropicalResort);		//31
		listaDeInstancias.add(casaPlanetWisp);			//32
		listaDeInstancias.add(itemBox3);				//33
		listaDeInstancias.add(casaSyevanaCastle);		//34
		listaDeInstancias.add(eggMobile);				//35
		listaDeInstancias.add(badnik3);					//36
		listaDeInstancias.add(casaSplashHill);			//37
		listaDeInstancias.add(terrenoGiftExpense);		//38
		listaDeInstancias.add(casaMadGear);				//39
		
		return listaDeInstancias;
	}
}
