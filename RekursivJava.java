package no.hvl.dat102.rekursiv;

public class RekursivJava {

		public static int sum (int n){
			int resultat = 0;
				if (n == 1){
					resultat = 1;
				} else {
					resultat = n + sum(n-1);
				} 
				return resultat;
		}

		public static int sumA (int n) {
			int resultat = 0;
			
			if (n == 0) {
				resultat = 2;
			} else if (n == 1) {
				resultat = 5;
			} else if (n > 1) {
				resultat = 5*sumA(n - 1) - 6*sumA(n-2) + 2;
			}
		return resultat;
	}
		
		public static int Fibonacci (int n) {
			if (n==0 || n==1) {
				return n;
			} else {
				return Fibonacci(n-1) + Fibonacci(n-2);
			}
		}
		
		
		public static int FibonacciIkkerekursiv (int n) {
			int s1 = 0;
			int s2 = 1;
			
			
			if (n == 0 ) {
				return n;
			}
			for (int i = 2; i <= n; i++) {
				s2 = s1 + s2;
				s1 = s2 - s1;
			}
			return s2;
		}
		
		
		
	    public static void main ( String [] args) {
	    System.out.println(sum(100));
	    
	    	
	    for (int i = 0; i < 10; i++) {
	    	System.out.println (sumA(i));
	    }
	    

	    System.out.println(Fibonacci(10));
	    System.out.println(Fibonacci(25));
	    System.out.println(Fibonacci(33));
	   
	   
	    System.out.println(FibonacciIkkerekursiv(10));
	    	
	    	
	    }
}
