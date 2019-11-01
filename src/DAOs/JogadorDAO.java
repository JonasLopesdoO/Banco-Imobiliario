package DAOs;

import java.util.ArrayList;
import java.util.List;

import Model.Jogador;

public class JogadorDAO {
private ArrayList<Jogador> listaJogadores;
	
	private static JogadorDAO jogadorDAO;
	
	private JogadorDAO() {
		listaJogadores = new ArrayList<Jogador>();
	}
	
	public static JogadorDAO getInstance(){
		if(jogadorDAO == null){
			jogadorDAO = new JogadorDAO();
		}
		return jogadorDAO;
	}
	
	public ArrayList<Jogador> getListaJogadores() {
		return listaJogadores;
	}
	
	public ArrayList<Jogador> getJogadoresAtivos(){
		ArrayList<Jogador> jog = new ArrayList<Jogador>();
		for(Jogador j : listaJogadores){
			if(j.ativo()){
				jog.add(j);
			}
		}
		return jog;
	}
	
	
	public void addJogador(Jogador j){
		listaJogadores.add(j);
	} 
	
}
