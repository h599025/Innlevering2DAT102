package no.hvl.dat102.junit.test;

import no.hvl.dat102.junit.adt.ADTtest;
import no.hvl.dat102.mengde.adt.MengdeADT;
import no.hvl.dat102.mengde.tabell.TabellMengde;

public class TabellMengdeTest extends ADTtest{

	@Override
	protected MengdeADT<String> reset() {
		return new TabellMengde<String>();
	}
}
