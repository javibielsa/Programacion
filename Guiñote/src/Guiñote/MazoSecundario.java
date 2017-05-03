package Guiñote;

import java.util.List;
import java.util.ArrayList;

public class MazoSecundario {
	List<Carta> mazo;
	public static final int POSICIONX = 110;
	public static final int POSICIONY= 110;
	
	public MazoSecundario(){
		mazo = new ArrayList<Carta>();
	}
	
	public void anadir(Carta carta){
		mazo.add(carta);
	}
	
	public Carta extraer(){
		return mazo.get(mazo.size()-1);
	}
	
	public void recolocar(){
		for (int i = 0; i < mazo.size(); i++) {
			
		}
	}

}
