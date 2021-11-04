
public class Zähler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] reihe = getArray(50000);
		
		System.out.printf("Iterativ:\n%s", getIterativeSuche(reihe, 45231));
		System.out.printf("Binär:\n%s", getBinäreSuche(reihe, 0, reihe.length, 45231));
		
		System.currentTimeMillis();

	}
	
	public static String getIterativeSuche(int[] arr, int g) {
		long start = System.currentTimeMillis();
		int zähler = 0;
		for(int i = 0; i < arr.length; i++) {
			zähler++;
			if(arr[i] == g) {
				long stop = System.currentTimeMillis() - start;
				return "Index:" + i + "\nSchritte:" + zähler + "\nZeit:" + stop + "\n\n";
			}
		}
		return "fehler";
	}
	
	
	public static String getBinäreSuche(int[] arr, int u, int o, int g) {
		int zähler = 0;
		int index = -1;
		long stop = 0;
		long start = System.currentTimeMillis();
		
		while(u <= o) {
			zähler++;
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
		return "Index:" + index + "\nSchritte:" + zähler + "\nZeit:" + stop + "\n\n";
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
