//A3.3 Ausgabe angepasst
//A3.4 Ticketanzahl hinzugefügt
//A4.4 Ticketgrenze implementiert
//A6.2 Alle Methoden erstellt
//A6.3 Zusatzschleife implementiert


import java.util.Scanner;

class Fahrkartenautomat {
	public static void main(String[] args) {

		Scanner tastatur = new Scanner(System.in);

		double eingezahlterGesamtbetrag;
		double zuZahlenderBetrag;
		
		

		begruessung();
		
		zuZahlenderBetrag = fahrkartenbestellungErfassen(tastatur);
		eingezahlterGesamtbetrag = fahrkartenBezahlen(tastatur, zuZahlenderBetrag);
		fahrkartenAusgeben();
		rueckgeldAusgeben(zuZahlenderBetrag, eingezahlterGesamtbetrag);
		
		System.out.println("\nVergessen Sie nicht, den Fahrschein\n" + "vor Fahrtantritt entwerten zu lassen!\n"
				+ "Wir wünschen Ihnen eine gute Fahrt.");
	
		tastatur.close();
	}
	//Begrüßung Methode
	static void begruessung() {
		System.out.println("Herzlich Willkommen!");
	}
	//Kartenauswahl und Ticketanzahl
	public static double fahrkartenbestellungErfassen(Scanner tastatur) {
		double ticketpreis;
		int ticketanzahl = 0;
		double zuZahlenderBetrag;

		System.out.print("Ticketpreis (Euro): ");
		ticketpreis = tastatur.nextDouble();
		
		if(ticketpreis > 10 || ticketpreis < 1) {
			ticketpreis = 1;
			System.out.println("Falsche Eingabe! Ticketpreis wird auf 1 gesetzt!");
			
		}
		System.out.print("Anzahl der Tickets: ");
		ticketanzahl = tastatur.nextInt();
		
		zuZahlenderBetrag = ticketpreis * ticketanzahl;
		return zuZahlenderBetrag;
	}
	
	//Geldeinwurf
	public static double fahrkartenBezahlen(Scanner tastatur, double zuZahlenderBetrag) {
		double eingezahlterGesamtbetrag;
		double nochZuZahlen;
		double eingeworfeneMuenze;
		eingezahlterGesamtbetrag = 0.00;
		nochZuZahlen = 0.00;
		while (eingezahlterGesamtbetrag < zuZahlenderBetrag) {
			nochZuZahlen = zuZahlenderBetrag - eingezahlterGesamtbetrag;
			System.out.printf("Noch zu zahlen: %.2f Euro\n", nochZuZahlen);
			System.out.print("Eingabe (mind. 5 Cent, höchstens 2 Euro): ");
			eingeworfeneMuenze = tastatur.nextDouble();
			eingezahlterGesamtbetrag = eingezahlterGesamtbetrag + eingeworfeneMuenze;
		}
		return eingezahlterGesamtbetrag;
	}
	
	public static void fahrkartenAusgeben() {
		System.out.println("\nFahrschein wird ausgegeben");
		for (int i = 0; i < 8; i++) {
			System.out.print("=");
			try {
				Thread.sleep(200);
			} 
			catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("\n\n");
		
	}
	
	//Ausgabe von Rückgeld
	public static void rueckgeldAusgeben(double zuZahlenderBetrag, double eingezahlterGesamtbetrag) {
		
		
		double rueckgabebetrag = eingezahlterGesamtbetrag - zuZahlenderBetrag;
		if (rueckgabebetrag > 0.0) {
			System.out.printf("Der Rückgabebetrag in Höhe von %.2f Euro\n", rueckgabebetrag);
			System.out.println("wird in folgenden Münzen ausgezahlt:");
			
			rueckgabebetrag = muenzRueckgabe (rueckgabebetrag, 2.0, "2 Euro");
			rueckgabebetrag = muenzRueckgabe (rueckgabebetrag, 1.0, "1 Euro");
			rueckgabebetrag = muenzRueckgabe (rueckgabebetrag, 0.5, "50 Cent");
			rueckgabebetrag = muenzRueckgabe (rueckgabebetrag, 0.2, "20 Cent");
			rueckgabebetrag = muenzRueckgabe (rueckgabebetrag, 0.1, "10 Cent");
			rueckgabebetrag = muenzRueckgabe (rueckgabebetrag, 0.05, "5 Cent");
		}
		
	}
	
	public static double muenzRueckgabe(double rueckgabebetrag, double wert, String Aussage) {
		
		while (rueckgabebetrag >= wert) {
			System.out.println(Aussage);
			rueckgabebetrag = rueckgabebetrag - wert;
		}
		return rueckgabebetrag;
	}
	
}