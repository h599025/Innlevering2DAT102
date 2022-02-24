package no.hvl.dat102.oppg2;

import no.hvl.dat102.mengde.adt.MengdeADT;
import no.hvl.dat102.mengde.kjedet.KjedetMengde;
import no.hvl.dat102.mengde.tabell.TabellMengde;

public class DatakontaktMain {

	public static <T> void main(String[] args) {
		Datakontakt Dating = new Datakontakt(3);
		Hobby Volleyball = new Hobby("Volleyball");
		
		MengdeADT<Hobby> hobby = new TabellMengde<>();
		hobby.leggTil(Volleyball);
		
		Medlem Heidi = new Medlem("Heidi", null);
		Medlem Nils = new Medlem("Nils", null);
		
		Dating.leggTilMedlem(Nils);
		Dating.leggTilMedlem(Heidi);
		
		Heidi.setHobbyer(hobby);
		Nils.setHobbyer(hobby);
		
		System.out.println(Dating.finnMedlemsIndeks(Nils.toString()));
		System.out.println(Dating.finnPartnerFor(Nils.toString()));

		System.out.println(Dating.toString());
		Dating.tilbakestillStatusIndeks(Nils.toString());
		System.out.println(Dating);
	}

}
