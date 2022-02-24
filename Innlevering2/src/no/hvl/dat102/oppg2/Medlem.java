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

	public boolean passerTil (Medlem medlem2) {
		Iterator<Hobby> mengde = hobbyer.iterator();
		Iterator<Hobby> mengde2 = medlem2.hobbyer.iterator();
		
		while(mengde.hasNext()) {
			while(mengde2.hasNext()) {
				if(mengde.next() == mengde2.next()) {
					return true;
				}
			}
		}
		return false;
		
	}
	
}
