package no.hvl.dat102.exceptions;

public class EmptyCollectionException extends RuntimeException{
	   /**
		 * 
		 */
		
	/******************************************************************
	     Setter opp dette unntaket med passende melding.
	   ******************************************************************/
	   public EmptyCollectionException (String collection){
	      super (" Denne " + collection + " er tom.");
	   }

}
