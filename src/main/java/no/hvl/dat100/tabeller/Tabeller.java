package no.hvl.dat100.tabeller;

import org.assertj.core.internal.Arrays;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {
		int [] timeTable = {8,8,7,7,8};
		int antTimer = timeTable [2];
		System.out.println(antTimer);
	}

	// b)
	public static String tilStreng(int[] tabell) {
		String utskrift = ""; 
		int [] tabell1 = {42, 67, 89};;
		System.out.println(tabell1);
	}

	// c)
	public static int summer(int[] tabell) {
		int sum = 0;
		for (int tall : tabell) {
			sum += tall;
		}
		return sum;	

		// TODO
		
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {
		int i = 0;
		while (i < tabell.length) {
			if (tabell[i] == tall) {
				return true;}
				else { 
					return false;
			}		
		}
		// TODO
		throw new UnsupportedOperationException("Metoden finnesTall ikke implementert");

	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {
		int [] tabell1 = {tall, -1, 89};
		int i = 1;
		int posisjonTall = tabell1[i];
		System.out.println(posisjonTall);

		// TODO
		throw new UnsupportedOperationException("Metoden posisjonTall ikke implementert");
	}

	// f)
	public static int[] reverser(int[] tabell) {
		int [] reversert = new int [tabell.length];
		for (int i = 0; i < tabell.length; i++) {
			reversert[i] = tabell[tabell.length -1 -i];
		}
		return reversert;

		// TODO
		throw new UnsupportedOperationException("Metoden reverser ikke implementert");
	}

	// g)
	public static boolean erSortert(int[] tabell) {
		int [] tabell1 = {1,2,3,4,5};
		Arrays.sort(tabell1);
		System.out.println(Arrays.toString(tabell1));

		// TODO
		throw new UnsupportedOperationException("Metoden erSortert ikke implementert");
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {
		int nyLengde = tabell1.length + tabell2.length;
		int [] nyTab = new int [nyLengde];
		for (int i = 0; i < tabell1.length; i++) {
			nyTab[i] = tabell1[i];
		}
		for (int j = 0; j < tabell2.length; j++) {
			nyTab[tabell1.length + j] = tabell2[j];
		}
		return nyTab;

		// TODO
		throw new UnsupportedOperationException("Metoden settSammen ikke implementert");

	}
}
