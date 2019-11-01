package View;

import Controladores.ControladorJogador;
import Controladores.ControladorTabuleiro;
import Model.CONSTANTES;
import Model.Dado;
import Model.Jogador;
import jplay.Scene;
import jplay.URL;
import jplay.Window;

public class TabuleiroViewer {
	private Window janela;
	private Scene cena;
	private static TabuleiroViewer tabuleiro;
	
	private TabuleiroViewer(Window window){
		
		janela = window;
		cena = new Scene();
		cena.loadFromFile(URL.scenario("Tabuleiro.scn"));
		cena.draw();
		
		drawPino();
	}
	
	public static TabuleiroViewer getInstance(){
		if(tabuleiro == null){
			tabuleiro = new TabuleiroViewer(new Window(CONSTANTES.RESOLUCAOINICIAL.getX(), CONSTANTES.RESOLUCAOINICIAL.getY()));
		}
		return tabuleiro;
	}
	
	public void drawPino(){
		for(Dado d : ControladorTabuleiro.getInstance().getDados()){
			d.run();	
		}
		
		for(Jogador j : ControladorJogador.getInstance().getJogadoresAtivos()){
			j.getPino().draw();
			
		}
		janela.update();
		cena.draw();
	}
	
	public Window getJanela(){
		return janela;
	}
	
}
