package Controladores;


import java.util.ArrayList;

import DAOs.JogadorDAO;
import Model.Jogador;

public class ControladorJogador {
	private static ControladorJogador controlJogador;
	
	private ControladorJogador() {
		// TODO Auto-generated constructor stub
	}
	
	public static ControladorJogador getInstance(){
		if(controlJogador == null){
			controlJogador = new ControladorJogador();
		}
		return controlJogador;
	}
	
	public void addJogador(Jogador j){
		JogadorDAO.getInstance().addJogador(j);
	} 
	
	public ArrayList<Jogador> getJogadores(){
		return JogadorDAO.getInstance().getListaJogadores();
	}
	
	public int getQuantJogadoresAtivos(){
		return JogadorDAO.getInstance().getJogadoresAtivos().size();
	}
	
	public ArrayList<Jogador> getJogadoresAtivos(){
		return JogadorDAO.getInstance().getJogadoresAtivos();
	}
}
