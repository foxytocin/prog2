/**
 * Diese Klasse stellt Methoden zur Verfuegung um
 * Zahlen in einem Array zu initialisieren, diese
 * Auf Primzahlen zu filtern, sowie auszugeben.
 */
public class Sieb {
  /**
   * Diese Methode erzeugt und initialisiert ein neues Array.
   * @param limit Arraygroesse
   * @return Initialisiertes Array
   */
  public int [] erzeugeKandidaten(int limit) {
    int[] kandidaten = new int[limit];
    for (int i = 0; i < limit; i++) {
      kandidaten[i] = i;
    }
    return kandidaten;
  }

  /**
   * Ersetzt alle Nicht-Primzahlen durch -1.
   * @param kandidaten Array mit Zahlen
   */
  public void filtereKandidaten(int [] kandidaten) {
    for (int p = 2; p < kandidaten.length; p++) {
      for (int f = 2; p * f < kandidaten.length; f++) {
        kandidaten[p * f] = - 1;
      }
    }
    if (kandidaten.length >= 2) {
      kandidaten[0] = -1;
      kandidaten[1] = -1;
    }
  }

  /**
   * Gibt alle Zahlen != -1 auf der Konsole aus.
   * @param kandidaten Array mit Zahlen
   */
  void druckeKandidaten(int[] kandidaten) {
    for (int i = 2; i < kandidaten.length; i++) {
      if (!(kandidaten[i] == -1)) {
        System.out.println(kandidaten[i]);
      }
    }
  }
}