package no.hvl.dat102.oppg2;

import java.util.Iterator;

import no.hvl.dat102.mengde.adt.MengdeADT;

public class Medlem {

	private String navn; 
	private MengdeADT<Hobby> hobbyer;  
	private int statusIndeks;
	
	
	public Medlem(String navn, MengdeADT<Hobby> hobbyer) {
		this.navn = navn;
		this.hobbyer = hobbyer;
		statusIndeks = -1;
	}
	
	public Medlem (String navn) {
	    this.navn = navn;
	    hobbyer = null;
	    statusIndeks = -1;
	}		

	public String getNavn() {
		return navn;
	}

	public void setNavn(String navn) {
		this.navn = navn;
	}

	public MengdeADT<Hobby> getHobbyer() {
		return hobbyer;
	}

	public void setHobbyer(MengdeADT<Hobby> hobbyer) {
		this.hobbyer = hobbyer;
	}

	public int getStatusIndeks() {
		return statusIndeks;
	}

	public void setStatusIndeks(int statusIndeks) {
		this.statusIndeks = statusIndeks;
	}
	
	@Override
	public String toString() {
		return "Medlem [navn=" + navn + ", hobbyer=" + hobbyer + ", statusIndeks=" + statusIndeks + "]";
	}

	public boolean passerTil(Medlem medlem2) {
    	
    	if (hobbyer.antall() != medlem2.hobbyer.antall() ||
    			(statusIndeks != -1 && medlem2.statusIndeks != -1)) {
    		return false;
    	}
    	
    	Iterator<Hobby> nr1 = hobbyer.iterator(), nr2 = medlem2.hobbyer.iterator();
    	
    	while (nr1.hasNext()) {
    		while (nr2.hasNext()) {
    			if (!nr1.next().equals(nr2.next()) ) {
    				return false;
    			}
    		}
    	}
    	return true;
    }
	
}
