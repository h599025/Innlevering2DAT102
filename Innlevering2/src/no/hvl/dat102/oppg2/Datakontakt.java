package no.hvl.dat102.oppg2;

import no.hvl.dat102.mengde.adt.MengdeADT;

public class Datakontakt {
	
	int antallMedlemmer = 0;
	Medlem[] tab;
	
	public Datakontakt(int startSize) {
		
		if(startSize > 0) {
			this.tab = new Medlem[startSize];
		}
	}
	
	private void grow() {
		Medlem[] tab2 = new Medlem[antallMedlemmer+10];
		for(int i = 0; i<=antallMedlemmer; i++) {
			tab2[i] = tab[i];
		}
	}
	
	public void leggTilMedlem(Medlem person) {
		if(antallMedlemmer > tab.length) {
			tab[antallMedlemmer] = person;
			antallMedlemmer++;
		}
	}
	
	public int finnMedlemsIndeks(String medlemsnavn) {
		for(int i = 0; i<antallMedlemmer; i++) {
			if(tab[i].getNavn() == medlemsnavn) {
				return tab[i].getStatusIndeks();
			}
		}
		return -1;
	}
	
	public int finnPartnerFor (String medlemsnavn) {
		
		for(int i = 0; i<antallMedlemmer; i++) {
			if(tab[i].getNavn() == medlemsnavn && tab[i].passerTil(tab[finnMedlemsIndeks(medlemsnavn)])) {
				tab[finnMedlemsIndeks(medlemsnavn)].setStatusIndeks(tab[i].getStatusIndeks());
				return tab[i].getStatusIndeks();
			}
		}
		return -1;
	}
	
	public void tilbakestillStatusIndeks(String medlemsnavn) {
		for(int i = 0; i<antallMedlemmer; i++) {
			if(tab[i].getStatusIndeks() != -1) {
				tab[finnMedlemsIndeks(medlemsnavn)].setStatusIndeks(-1);
				tab[finnMedlemsIndeks(tab[i].getNavn())].setStatusIndeks(-1);
			}
		}
	}
	
	public Medlem[] getMedlemmer() {
		return tab;
	}
	
	public String toString() {
		String s = "";
		for(int i = 0; i<antallMedlemmer; i++) {
			s += tab[i].getNavn() + " " + tab[i].getHobbyer() + " " + tab[i].getStatusIndeks() + "\t";
		}	
		return s;
	}
}
