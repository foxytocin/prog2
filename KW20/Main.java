class Main {
	/** 
	* Vertauscht 3 Arrays zyklisch.
	* @param arrayA erstes Array
	* @param arrayB zweiter Array
	* @param arrayC drittes Array
	* @return true wenn moeglich, sonst false
	*/
	boolean tauscheDurch(float[] arrayA, float[] arrayB, float [] arrayC) {
		if (arrayA == arrayB || arrayA == arrayC || arrayB == arrayC) {
			return false;
		}
		if (arrayA.length != arrayB.length || arrayA.length != arrayC.length) {
			return false;
		}
		float tmp;
		for (int i = 0; i < arrayA.length; i++) {
			tmp = arrayC[i];
			arrayC[i] = arrayB[i];
			arrayB[i] = arrayA[i];
			arrayA[i] = tmp;
		}
		return true ;
	}

	/**
	 * Diese Methode soll unveraendert bleiben.
	 * @param value Wert
	 */
	public void aendereWert (int value) {
		value = 0 ;
	}

	/**
	 * Aendert das erste Element des Arrays zu 0.
	 * @param arr Integer Array
	 */
	public void aendereWertFunktioniert(int[] arr) {
		if (arr.length > 0)
			arr[0] = 0;
	}

	/**
	* Ersetzt alle 2 durch 0. Seiteneffekt: Gibt gleich auf der Konsole aus
	* falls der String nicht veraendert wurde.
	* @param s String, dessen 2 durch 0 ersetzt werden sollen
	* @return neuen String falls veraendert, sonst alten
	*/
	String einfachesErsetzen(String s) {
		String newS = s.replace("2", "0");
		if (newS == s) {
			System.out.println("gleich");
		}
		return newS;
	}

	/**
	* Ersetzt alle Woerter durch WORT. Seiteneffekt: Gibt gleich auf der 
	* Konsole aus falls der String nicht veraendert wurde.
	* @param s String, welcher ersetzt werden soll
	* @return neuen String falls veraendert, sonst alten
	*/
	String replaceInString(String s) {
		String newS = s.replaceAll("[a-zA-Z]+", "WORT");
		if (newS == s) {
			System.out.println("gleich");
		}
		return newS;
	}
}