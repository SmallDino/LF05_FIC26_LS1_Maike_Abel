public class ArrayUebung {

  public static void main(String args[]) {
	  
    // 1. Deklaration eines Arrays für ganze Zahlen.
	  int[]gZahlen;
    // 2. Initialisierung des Arrays mit 100 Elementen.
	  gZahlen = new int[100];
    // 3. Durchlaufen des gesamten Arrays und Ausgabe des Inhalts.
	  for(int i = 0;i < gZahlen.length-1; i++)
	  {
	  	System.out.println(gZahlen[i]);
	  }
    // 4. Das Array mit allen ganzen Zahlen von 1 bis 100 befüllen.
	  for(int i = 0; i < gZahlen.length-1; i++)
	  {
	  	gZahlen[i] = i+1;
	  }
    // 5. Geben Sie den Wert an der 89. Position des Arrays aus.          
	  System.out.println(gZahlen[88]);
    // 6. Ändern Sie den Wert des Arrayelements mit dem Index 49 zu 1060.
	  gZahlen[49] = 1060;
    // Außerdem ändern Sie den Wert an der ersten und der letzte Stelle des Arrays zu 2023.
	  gZahlen[0] = 2023;
	  gZahlen[99] = 2023;
    // 7. Erneutes Ausgeben des Arrayinhalts.  Darstellung: Index und zugehöriger Inhalt (z.B. Index 6 - Inhalt: 7)
	  for(int i = 0;i < gZahlen.length-1; i++)
	  {
	  	System.out.println("Index "+ i + " - Inhalt: "+ gZahlen[i]);
	  }
    // 8. Berechnung des Durchschnitts aller Arrayelemente
	  int summe = 0;
	  for(int i = 0; i < gZahlen.length-1; i++)
	  {
	  	summe += gZahlen[i];
	  }
	  
	  double ds = summe / gZahlen.length;
	  System.out.println(ds);
  }

}