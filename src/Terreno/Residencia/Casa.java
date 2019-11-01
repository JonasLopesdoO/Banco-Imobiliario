package Terreno.Residencia;

import Interfaces.ICasa;
import Model.TerrenoComercializavel;

public abstract class Casa extends TerrenoComercializavel implements ICasa{
	
	private int qtdContruCasa;
	
	public Casa() {
		this.qtdContruCasa = 0;
		
	}

	public boolean construir(){
		if(qtdContruCasa < 5){
			qtdContruCasa++;
			return true;
		}
		
		return false;
	}
	
	public int valorAluguel(){
		if(qtdContruCasa == 0){
			return valorAluguelNoCasa();
		}else if(qtdContruCasa == 1){
			return valorAluguel1Casas();
		}else if(qtdContruCasa == 2){
			return valorAluguel2Casas();
		}else if(qtdContruCasa == 3){
			return valorAluguel3Casas();
		}else if(qtdContruCasa == 4){
			return valorAluguel4Casas();
		}
		return valorAluguelPredio();
	}
	
	public int getQtdContruCasa() {
		return qtdContruCasa;
	}

	public void setQtdContruCasa(int qtdContruCasa) {
		this.qtdContruCasa = qtdContruCasa;
	}
}

