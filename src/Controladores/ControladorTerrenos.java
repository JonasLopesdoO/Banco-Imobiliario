package Controladores;

import java.util.ArrayList;

import DAOs.TerrenoDAO;
import Model.CONSTANTES;
import Model.Localizacao;
import Model.Terreno;

public class ControladorTerrenos {
	private static ControladorTerrenos controlTerrenos;
	
	private ControladorTerrenos() {
		// TODO Auto-generated constructor stub
	}
	
	public static ControladorTerrenos getInstance(){
		if(controlTerrenos == null){
			controlTerrenos = new ControladorTerrenos();
		}
		return controlTerrenos;
	}
	
	public ArrayList<Terreno> getTerrenos(){
		return TerrenoDAO.getInstance().getListaTerrenos();
	}
	public Terreno getPrisao(){
		return TerrenoDAO.getInstance().getPrisao();
	}
	
	public Localizacao prisao(){
		return TerrenoDAO.getInstance().prisao();
	}
	
	public Terreno obterTerreno(int indice){
		if(indice < qtdTerrenos()){
			return TerrenoDAO.getInstance().obterTerreno(indice);
		}else{
			return TerrenoDAO.getInstance().obterTerreno(indice % qtdTerrenos());	
		}
	}
	
	public int qtdTerrenos(){
		return TerrenoDAO.getInstance().getListaTerrenos().size();
	}
	
}
