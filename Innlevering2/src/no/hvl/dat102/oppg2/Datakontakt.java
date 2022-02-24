package no.hvl.dat102.oppg2;

import no.hvl.dat102.mengde.adt.MengdeADT;
import no.hvl.dat102.mengde.tabell.TabellMengde;

public class Datakontakt {
		
	private TabellMengde<Medlem> medlemmene;

	public Datakontakt(int antall) {
		medlemmene = new TabellMengde<>(antall);
    }


    public void leggTilMedlem(Medlem person) {
    	medlemmene.leggTil(person);
    }

    public int finnMedlemsIndeks(String medlemsnavn) {
        int i = 0;
        for (Medlem m : medlemmene) {
            if (m.getNavn().contains(medlemsnavn)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public int finnPartnerFor(Medlem medlem) {

        int medlemIndeks = -1;

        for (Medlem i : medlemmene) {
            if (i.passerTil(medlem)) {
                int indeks = (finnMedlemsIndeks(i.getNavn()));
                medlemIndeks = (finnMedlemsIndeks(medlem.getNavn()));

                i.setStatusIndeks(medlemIndeks);
                medlem.setStatusIndeks(indeks);
            }
        }
        return medlemIndeks;
    }

    public void tilbakestillStatusIndeks(String medlemsnavn) {
       
    	int nr1 = finnMedlemsIndeks(medlemsnavn);
        if (nr1 != -1) {
            int nr2 = medlemmene.getElement(nr1).getStatusIndeks();
            medlemmene.getElement(nr1).setStatusIndeks(-1);
            medlemmene.getElement(nr2).setStatusIndeks(-1);
        }
    }

    public TabellMengde<Medlem> getMedlemmer() {
        return medlemmene;
    }

    @Override
    public String toString() {
        return medlemmene.toString();
    }
}
