package Model;

import java.util.Random;

import jplay.GameImage;
import jplay.URL;

public class Dado{
	
	private Random random;
	private int valorDado;
	private GameImage animaDado;
	
	public Dado(int x, int y) {
		animaDado = new GameImage(URL.sprite("dado1.png"));
		animaDado.x = x;
		animaDado.y = y;
	}
	
	public void lancar() {
		random = new Random();
		this.valorDado = random.nextInt(6) + 1;
		animaDado.loadImage(URL.sprite("dado"+valorDado+".png"));	
		animaDado.draw();
	}
	
	public void draw(){
		animaDado.draw();
	}
	
	public GameImage getAnimaDado() {
		return animaDado;
	}
	
	public int getValorDado() {
		this.valorDado = random.nextInt(5) + 1;
		return valorDado;
	}
	
	public void run(){
		animaDado.draw();
	}

}
