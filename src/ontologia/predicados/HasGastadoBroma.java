package ontologia.predicados;

import ontologia.Predicado; import ontologia.conceptos.habilidades.*; import ontologia.conceptos.necesidades.*; import ontologia.conceptos.*;
import jadex.runtime.*;

public class HasGastadoBroma extends Predicado {
    
	private Energia energia;
	private Diversion diversion;
	private InteraccionSocial interaccion;
	private Carisma carisma;
      
	public HasGastadoBroma()
    {;}
	   
	public Energia getEnergia() {
        return energia;
    }
    public void setEnergia(Energia e) {
        energia=e;
    }
	
	public InteraccionSocial getInteraccionSocial() {
        return interaccion;
    }
    public void setInteraccionSocial(InteraccionSocial i) {
        interaccion=i;
    }
	
	public Diversion getDiversion() {
        return diversion;
    }
    public void setDiversion(Diversion d) {
        diversion=d;
    }
	
	public Carisma getCarisma() {
        return carisma;
    }
    public void setCarisma(Carisma c) {
        carisma=c;
    }
}