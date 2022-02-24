package no.hvl.dat102.oppg2;

import no.hvl.dat102.mengde.adt.MengdeADT;
import no.hvl.dat102.mengde.kjedet.KjedetMengde;
import no.hvl.dat102.mengde.tabell.TabellMengde;

public class DatakontaktMain {

	public static void main(String[] args) {
		Datakontakt Dating = new Datakontakt(5);
		
		Medlem Heidi = new Medlem("Heidi");
		Medlem Nils = new Medlem("Nils");
		Medlem Hans = new Medlem("Hans");
		Medlem Pål = new Medlem("Pål");
		
		Hobby Volleyball = new Hobby("Volleyball");
		Hobby Fotball = new Hobby("Fotball");
		
		MengdeADT<Hobby> hobby = new TabellMengde<>();
		MengdeADT<Hobby> hobby2 = new TabellMengde<>();
		hobby.leggTil(Volleyball);
		hobby2.leggTil(Fotball);
		
		Dating.leggTilMedlem(Nils);
		Dating.leggTilMedlem(Heidi);
		Dating.leggTilMedlem(Pål);
		Dating.leggTilMedlem(Hans);
		
		Heidi.setHobbyer(hobby);
		Nils.setHobbyer(hobby);
		Pål.setHobbyer(hobby2);
		Hans.setHobbyer(hobby2);
		
		System.out.println(Dating.finnPartnerFor(Nils));
		System.out.println();
		System.out.println(Dating.finnPartnerFor(Pål));
		
		System.out.println(Dating);
		
		Tekstgrensesnitt.skrivParListe(Dating);
	}

}
