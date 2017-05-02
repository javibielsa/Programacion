package Guiñote;

import java.applet.Applet;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

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
	List<Carta> cartasExtraidas;
	
	public void init() {
		imagenes = new Image[NUM_CARTAS];
		imgReverso = getImage(getCodeBase(),"Cartas/reverso.png");
		for(int i=0; i<4; i++)
			for(int j=0;j<13;j++)
				imagenes[(i*CPP)+j]= getImage(getCodeBase(),"cartas/"+(j+1)+nombres[i]);
		baraja = new Baraja(imagenes);
		reverso = new Rectangle(20, 20, 70,120);
		baraja.barajar();
		cartasExtraidas = new ArrayList<Carta>();
	}

	public void paint(Graphics g){
		g.setColor(Color.green);
		g.fillRect(0, 0, 700, 700);
		g.drawImage(imgReverso, 20, 20, Carta.ANCHURA, Carta.ALTURA, this);
		for (int i = 0; i < cartasExtraidas.size(); i++) {
			cartasExtraidas.get(i).dibujar(g, this);
		}
		
	}
	
	public boolean mouseDown(Event e, int x, int y){
		if(reverso.contains(x,y)){
			cartasExtraidas.add(baraja.sacar());
			cartasExtraidas.get(cartasExtraidas.size()-1).setPosx(110);
			cartasExtraidas.get(cartasExtraidas.size()-1).setPosx(20);
		}
		for (int i = 0; i < cartasExtraidas.size(); i++) {
			if(cartasExtraidas.get(i).contains(x,y)){
				cartasExtraidas.get(i).setPosx(110);
				cartasExtraidas.get(i).setPosx(20);
			}
		}
		repaint();
		return true;
	}
}
