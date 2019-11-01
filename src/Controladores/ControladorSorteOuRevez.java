package Controladores;

import java.util.ArrayList;

import DAOs.SorteOuRevezDAO;
import Model.SorteOuRevez;

public class ControladorSorteOuRevez {
private static ControladorSorteOuRevez controlSR;
	
	private ControladorSorteOuRevez() {
		// TODO Auto-generated constructor stub
	}
	
	public static ControladorSorteOuRevez getInstance(){
		if(controlSR == null){
			controlSR = new ControladorSorteOuRevez();
		}
		return controlSR;
	}
	
	public ArrayList<SorteOuRevez> getSorteOuReves(){
		return SorteOuRevezDAO.getInstance().getListaSorteOuRevez();
	}
}
