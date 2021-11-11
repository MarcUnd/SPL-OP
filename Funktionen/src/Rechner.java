
public class Rechner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		System.out.println(rekursiveSumme(5000));
		System.out.println(rekursivesProdukt(30));
		System.out.println(rekursivePotenz(50,5));
		System.out.println(endRekursiveSumme(5000));
		System.out.println(endRekursivesProdukt(30));
		System.out.println(endRekursivePotenz(50,5));
		
	}


	public static int iterativeSumme(int anz) {
		int result = 1;
		
		if(anz <= 0) {
			return -1;
		}
		
		while(anz > 1) {
			result += anz;
			anz--;
		}
		return result;
	}
	
	public static int iterativesProdukt(int anz) {
		int result = 1;
		
		if(anz <= 0) {
			return -1;
		}
		
		while(anz > 1) {
			result *= anz;
			anz--;
		}
		return result;
	}
	
	public static int iterativePotenz(int anz, int hoch) {

		int result = anz;
		
		if(anz <= 0) {
			return -1;
		}
		
		while(hoch > 1) {
			result *= anz;
			hoch--;
		}
		return result;
	}

	
	public static int rekursiveSumme(int anz) {
		long zeit = System.nanoTime();
		if(anz <= 0) {
			return -1;
		}
		if(anz <= 1) {
			System.out.println("Zeit ist:" + (System.nanoTime() - zeit));
			return 1;
		}
			return anz + rekursiveSumme(anz - 1);
		
	}
	
	public static int rekursivesProdukt(int anz) {
		long zeit = System.nanoTime();
		if(anz <= 0) {
			return -1;
		}
		if(anz <= 1) {
			System.out.println("Zeit ist:" + (System.nanoTime() - zeit));
			return 1;
		}
			return anz * rekursivesProdukt(anz - 1);
		
	}

	public static int rekursivePotenz(int anz, int hoch) {
		long zeit = System.nanoTime();
		if(anz <= 0) {
			return -1;
		}
		if(hoch <= 1) {
			System.out.println("Zeit ist:" + (System.nanoTime() - zeit));
			return anz;
		}
			return anz * rekursivePotenz(anz, hoch - 1);
	}

	
	public static int endRekursiveSumme(int anz) {
		if(anz < 0) {			
			return -1;
		}
		return rechenRekursiveSumme(0,anz);
	}
	
	public static int rechenRekursiveSumme(int start, int anz) {
		long zeit = System.nanoTime();
		if(anz == 0) {
			System.out.println("Zeit ist:" + (System.nanoTime() - zeit));
			return start;
		}	
		return rechenRekursiveSumme(start + anz, anz - 1);
	}

	public static int endRekursivesProdukt(int anz) {
		if(anz < 0) {
			return -1;
		}
		return rechenRekursivesProdukt(1,anz);
	}
	
	public static int rechenRekursivesProdukt(int start, int anz) {
		long zeit = System.nanoTime();
		if(anz == 0) {
			System.out.println("Zeit ist:" + (System.nanoTime() - zeit));
			return start;
		}	
		return rechenRekursivesProdukt(start * anz, anz - 1);
	}

	public static int endRekursivePotenz(int anz, int hoch) {
		if(hoch <= 0) {
			return 1;
		}
		return rechenRekursivePotenz(anz, anz, hoch);
	}
	
	public static int rechenRekursivePotenz(int anz, int hilfe, int hoch) {
		long zeit = System.nanoTime();
		if(hoch == 1) {
			System.out.println("Zeit ist:" + (System.nanoTime() - zeit));
			return anz;
		}
		return rechenRekursivePotenz(anz * hilfe, hilfe, hoch - 1);
	}
}
