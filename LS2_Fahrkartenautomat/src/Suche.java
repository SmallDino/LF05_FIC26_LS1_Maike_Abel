
public class Suche {

	public static void main(String[] args) {
		
		int[] zahlenArray = { 1, 5, 5, 7, 3, 11, 22, 23, 27 };
		
		int wert = 27;
		int i;
		int counter = 0;
		
	
		
		for( i = 0; i<=zahlenArray.length -1; i++) {
			if (wert == zahlenArray[i]) {
				counter++;
			}
			
		}
		if(counter > 0) {
			System.out.print("wurde gefunden");
		}
		else {
			System.out.print("nicht gefunden");
		}
	}

}
