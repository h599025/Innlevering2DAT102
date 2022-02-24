package no.hvl.dat102.oppg3Innlevering2;

import no.hvl.dat102.adt.StabelADT;
import no.hvl.dat102.tabell.TabellStabel;

public class ParantessjekkerMain implements Parantessjekker {

	public ParantessjekkerMain() {
		
	}

	@Override
	public boolean erVenstreparentes(char p) {
		if (p == '(' || p == '[' || p == '{') {
			return true;
		} else {
		return false;
		}
	}

	@Override
	public boolean erHogreparentes(char p) {
		if (p == ')'|| p == ']' ||  p == '}') {
			return true;
		} else {
		return false;
		}
	}

	@Override
	public boolean erParentes(char p) {
		if (erHogreparentes(p) || erVenstreparentes(p)) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean erPar(char venstre, char hogre) {
		if(venstre == '('&& hogre ==')') {
			 return true;
			 
		 } else if(venstre == '['&& hogre ==']') {
			 return true;
			 
		 } else if(venstre == '{'&& hogre =='}') {
			 return true;
		 }
		return false;
	}

	@Override
	public boolean erBalansert(String s) {
		StabelADT<Character> stabel = new TabellStabel<>();
		
		 
		 for (int i=0; i<s.length(); i++) 
		 {
			 char StringToChar = s.charAt(i);
			if(erVenstreparentes(StringToChar)) 
			{
				stabel.push(StringToChar);
			}else if(erHogreparentes(StringToChar))
			{
				if(stabel.erTom() || !erPar(stabel.pop(), StringToChar)) {
					return false;
				}
			}
				
		 }
		 
		 if(!stabel.erTom()) {
			 
			 return false;
		 }
			 return true;
			 
		 }
		
	
	public static void main (String [] args) {
		ParantessjekkerMain main = new ParantessjekkerMain();
		String hei = "(heihei)";
		System.out.println(main.erBalansert(hei));
		
		String heiFeil = "(heihei(";
		System.out.println(main.erBalansert(heiFeil));
		
		String parantes = "({[]})";
		System.out.println(main.erBalansert(parantes));
	}
}
