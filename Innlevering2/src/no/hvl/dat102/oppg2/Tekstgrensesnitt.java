package no.hvl.dat102.oppg2;

import javax.swing.JOptionPane;

import no.hvl.dat102.mengde.adt.MengdeADT;
import no.hvl.dat102.mengde.kjedet.KjedetMengde;

public class Tekstgrensesnitt {
	
	public static Medlem lesMedlem() { 
		String navn = JOptionPane.showInputDialog("Navn: ");
		MengdeADT<Hobby> mengde = new KjedetMengde<>();
		String[] stringHobby = JOptionPane.showInputDialog("Hobby: ").split("\\W");
	
		
		for(String i : stringHobby) {
			Hobby hobby = new Hobby(i);
			mengde.leggTil(hobby);
			
		}
		return new Medlem(navn, mengde);
	}  

	
	public static void skrivHobbyListe(Medlem medlem) {
		System.out.println("Alle hobbyene");
		System.out.println(medlem.getHobbyer().toString()); 
	}
	
	public static void skrivParListe (Datakontakt arkiv) { 
		System.out.printf("%s %20s %n", "PARNAVN", "HOBBYER");
		Medlem[] medlemmer = arkiv.getMedlemmer();
		
		int i = 0, antallPar = 0;
		boolean[] skrevetUt = new boolean[arkiv.getMedlemmer().length];
		
		for(Medlem m : medlemmer) {
			
			if(m.getStatusIndeks() != -1 && !skrevetUt[i]) {
				System.out.printf("%s %18s %n", m.getNavn() + " og " + m.getNavn(), m.getHobbyer());
				skrevetUt[m.getStatusIndeks()] = true;
				antallPar++;
			}
			i++;
		}
		System.out.println("----------------------------------------------\n" + "Antall par funnet: " + antallPar);
	}
}
