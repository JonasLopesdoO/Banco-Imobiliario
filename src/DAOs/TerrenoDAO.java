package DAOs;

import java.util.ArrayList;

import Instaciators.InstanciadoraDeTerrenos;
import Model.CONSTANTES;
import Model.Localizacao;
import Model.Terreno;

public class TerrenoDAO {
	private ArrayList<Terreno> listaTerrenos;
	
	private static TerrenoDAO terrenosDAO;
	
	private TerrenoDAO() {
		listaTerrenos = InstanciadoraDeTerrenos.getInstance().instancias();
	}
	
	public static TerrenoDAO getInstance(){
		if(terrenosDAO == null){
			terrenosDAO = new TerrenoDAO();
		}
		return terrenosDAO;
	}
	
	public ArrayList<Terreno> getListaTerrenos() {
		return listaTerrenos;
	}
	
	public Localizacao prisao(){
		return listaTerrenos.get(CONSTANTES.INDICE_PRISAO).getLocalizacao();
	}
	
	public Terreno getPrisao(){
		return listaTerrenos.get(CONSTANTES.INDICE_PRISAO);
	}
	
	public Terreno obterTerreno(int indice){
		if(indice < qtdTerrenos()){
			return listaTerrenos.get(indice);	
		}else{
			return listaTerrenos.get(indice % listaTerrenos.size());	
		}
	}
	
	public int qtdTerrenos(){
		return listaTerrenos.size();
	}	
}
