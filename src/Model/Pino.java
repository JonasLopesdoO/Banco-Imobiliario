package Model;


import jplay.Sprite;
import jplay.URL;

public class Pino extends Sprite{
	
	public Pino(int idJogador) {
		super(URL.sprite("personagem"+idJogador+".png"),1);
		this.x = CONSTANTES.TERRENO_INICIALX;
		this.y = CONSTANTES.TERRENO_INICIALY;
	}
	
	public void mover(int x, int y){ 
		this.x = x;
		this.y = y;
	}
	
}
