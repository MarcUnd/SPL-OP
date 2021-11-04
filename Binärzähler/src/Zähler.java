
public class Z�hler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] reihe = getArray(50000);
		
		System.out.printf("Iterativ:\n%s", getIterativeSuche(reihe, 45231));
		System.out.printf("Bin�r:\n%s", getBin�reSuche(reihe, 0, reihe.length, 45231));
		
		System.currentTimeMillis();

	}
	
	public static String getIterativeSuche(int[] arr, int g) {
		long start = System.currentTimeMillis();
		int z�hler = 0;
		for(int i = 0; i < arr.length; i++) {
			z�hler++;
			if(arr[i] == g) {
				long stop = System.currentTimeMillis() - start;
				return "Index:" + i + "\nSchritte:" + z�hler + "\nZeit:" + stop + "\n\n";
			}
		}
		return "fehler";
	}
	
	
	public static String getBin�reSuche(int[] arr, int u, int o, int g) {
		int z�hler = 0;
		int index = -1;
		long stop = 0;
		long start = System.currentTimeMillis();
		
		while(u <= o) {
			z�hler++;
			int mid = u + ((o-u)/2);
			if(arr[mid] > g) {
				o = mid - 1;
			}else if(arr[mid] < g) {
				u = mid + 1;
			}else if(arr[mid] == g) {
				stop = System.currentTimeMillis() - start;
				index = mid;
				break;
			}
		}
		return "Index:" + index + "\nSchritte:" + z�hler + "\nZeit:" + stop + "\n\n";
	}
	
	public static int[] getArray(int x) {
		int[] arr = new int[x];
		for (int i = 0; i < arr.length; i++) 
        {
            arr[i] = i;
        }
		return arr;
	}
	
}
