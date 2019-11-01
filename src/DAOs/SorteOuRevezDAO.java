package DAOs;

import java.util.ArrayList;

import Instaciators.InstanciadoraDeSorteOuRevez;
import Model.SorteOuRevez;

public class SorteOuRevezDAO {
	private ArrayList<SorteOuRevez> listaSorteOuRevez;
	
	private static SorteOuRevezDAO sorteOuRevezDAO;
	
	private SorteOuRevezDAO() {
		listaSorteOuRevez = InstanciadoraDeSorteOuRevez.getInstance().instancias();
	}
	
	public static SorteOuRevezDAO getInstance(){
		if(sorteOuRevezDAO == null){
			sorteOuRevezDAO = new SorteOuRevezDAO();
		}
		return sorteOuRevezDAO;
	}
	
	public ArrayList<SorteOuRevez> getListaSorteOuRevez() {
		return listaSorteOuRevez;
	}
	
}
