package Terreno.Transporte;

import Model.TerrenoComercializavel;

public abstract class Transporte extends TerrenoComercializavel{

	private int valorTerrenoTransporte;
	private int valorHipotecaTransporte;
	private int valorAluguel1Transporte;
	private int valorAluguel2Transporte;
	private int valorAluguel3Transporte;
	private int valorAluguel4Transporte;
	private int qtdTransportes;

	public Transporte() {
		// TODO Auto-generated constructor stub
		this.valorTerrenoTransporte = 200;
		this.valorHipotecaTransporte = 100;
		this.valorAluguel1Transporte = 25;
		this.valorAluguel2Transporte = 50;
		this.valorAluguel3Transporte = 100;
		this.valorAluguel4Transporte = 200;
		this.setQtdTransportes(0);
	}
	
	public int valorAluguel(){
		if(qtdTransportes == 0){
			return valorAluguel1Transporte;
		}else if(qtdTransportes == 1){
			return valorAluguel1Transporte;
		}else if(qtdTransportes == 2){
			return valorAluguel2Transporte;
		}else if(qtdTransportes == 3){
			return valorAluguel3Transporte;
		}
		return valorAluguel4Transporte;
		
	}
	
	public int getValorTerrenoTransporte() {
		return valorTerrenoTransporte;
	}
	public void setValorTerrenoTransporte(int valorTerrenoTransporte) {
		this.valorTerrenoTransporte = valorTerrenoTransporte;
	}
	public int getValorHipotecaTransporte() {
		return valorHipotecaTransporte;
	}
	public void setValorHipotecaTransporte(int valorHipotecaTransporte) {
		this.valorHipotecaTransporte = valorHipotecaTransporte;
	}
	public int getValorAluguel1Transporte() {
		return valorAluguel1Transporte;
	}
	public void setValorAluguel1Transporte(int valorAluguel1Transporte) {
		this.valorAluguel1Transporte = valorAluguel1Transporte;
	}
	public int getValorAluguel2Transporte() {
		return valorAluguel2Transporte;
	}
	public void setValorAluguel2Transporte(int valorAluguel2Transporte) {
		this.valorAluguel2Transporte = valorAluguel2Transporte;
	}
	public int getValorAluguel3Transporte() {
		return valorAluguel3Transporte;
	}
	public void setValorAluguel3Transporte(int valorAluguel3Transporte) {
		this.valorAluguel3Transporte = valorAluguel3Transporte;
	}
	public int getValorAluguel4Transporte() {
		return valorAluguel4Transporte;
	}
	public void setValorAluguel4Transporte(int valorAluguel4Transporte) {
		this.valorAluguel4Transporte = valorAluguel4Transporte;
	}

	public int getQtdTransportes() {
		return qtdTransportes;
	}

	public void setQtdTransportes(int qtdTransportes) {
		this.qtdTransportes = qtdTransportes;
	}
	

}
