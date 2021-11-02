
public class Rechner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(iterativeSumme(5));
		System.out.println(iterativesProdukt(5));
		System.out.println(iterativePotenz(5,25));
		System.out.println(rekursiveSumme(5));
		System.out.println(rekursivesProdukt(5));
		System.out.println(rekursivePotenz(5,25));
	}


	public static long iterativeSumme(long anz) {
		long result = 1;
		
		while(anz > 1) {
			result += anz;
			anz--;
		}
		return result;
	}
	
	public static long iterativesProdukt(long anz) {
		long result = 1;
		
		while(anz > 1) {
			result *= anz;
			anz--;
		}
		return result;
	}
	
	public static long iterativePotenz(long anz, long hoch) {

		long result = anz;
		
		while(hoch > 1) {
			result *= anz;
			hoch--;
		}
		return result;
	}

	
	public static long rekursiveSumme(long anz) {
		if(anz <= 1) {
			return 1;
		}else {
			return anz + rekursiveSumme(anz - 1);
		}
	}
	
	public static long rekursivesProdukt(long anz) {
		if(anz <= 1) {
			return 1;
		}else {
			return anz * rekursivesProdukt(anz - 1);
		}
	}

	public static long rekursivePotenz(long anz, long hoch) {
		if(hoch <= 1) {
			return anz;
		}else {
			return anz * rekursivePotenz(anz, hoch - 1);
		}
	}
}
