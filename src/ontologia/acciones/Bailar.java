package ontologia.acciones;

import ontologia.Accion; import ontologia.conceptos.habilidades.*; import ontologia.conceptos.necesidades.*; import ontologia.conceptos.*;
import jadex.runtime.*;

public class Bailar extends Accion {

      	private Musica que;
	private Diversion diversion;
	private Energia energia;
	private Higiene higiene;
	private Hambre hambre;
	private Deporte fisico;

	public Bailar()
       	{;}
	
       	public Musica getMusica() {
           return que;
       	}
       	public void setMusica(Musica m) {
           que=m;
       	}
	  
    	public Diversion getDiversion() {
        	return diversion;
    	}
    	public void setDiversion(Diversion d) {
        	diversion=d;
    	}
	
	public Energia getEnergia() {
        	return energia;
    	}
    	public void setEnergia(Energia e) {
        	energia=e;
    	}
    
	public Hambre getHambre() {
        	return hambre;
    	}
    	public void setHambre(Hambre h) {
        	hambre=h;
    	}
    
	public Higiene getHigiene() {
        	return higiene;
    	}
    	public void setHigiene(Higiene h) {
        	higiene=h;
    	}
    
	public Deporte getDeporte() {
    		return fisico;
    	}
    	public void setDeporte(Deporte f) {
        	fisico=f;
    	}
}
