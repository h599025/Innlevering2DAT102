package no.hvl.dat102.junit.test;

import no.hvl.dat102.junit.adt.ADTtest;
import no.hvl.dat102.mengde.adt.MengdeADT;
import no.hvl.dat102.mengde.kjedet.KjedetMengde;

public class KjedetMengdeTest extends ADTtest {

	@Override
	protected MengdeADT<String> reset() {
		return new KjedetMengde<String>();
	}
}
