package Guiñote;

import java.applet.Applet;
import java.awt.*;

public class Solitario extends Applet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static final int NUM_CARTAS = 52;
	public static final int CPP=13;
	String nombres[]={"_of_clubs.png","_of_diamonds.png","_of_hearts.png","_of_spades.png"};
	Image imagenes[];
	Baraja baraja;
	Image imgReverso;
	Rectangle reverso;
	int s = 0;
	
	public void init() {
		imagenes = new Image[NUM_CARTAS];
		imgReverso = getImage(getCodeBase(),"Cartas/reverso.png");
		for(int i=0; i<4; i++)
			for(int j=0;j<13;j++)
				imagenes[(i*CPP)+j]= imgReverso;
		baraja = new Baraja(imagenes);
		reverso = new Rectangle(20, 20, 70,120);
		baraja.barajar();
	}

	public void paint(Graphics g){
		g.setColor(Color.black);
		g.fillRect(0, 0, 700, 700);
		g.drawImage(imgReverso, 20, 20, 70, 120, this);
		
	}
	
	public boolean onClick(Event e, int x, int y){
		if(reverso.contains(x,y)){
			
		}
		return true;
	}
}
