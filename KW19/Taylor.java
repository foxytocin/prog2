/**
 * Stellt Mathematische Funktionen bereit.
 */
public class Taylor {
  /**
   * Berechnet die n-te Potenz von x.
   * @param x basis
   * @param n Potenz
   * @return x^n
   */
  public float potenziere(float x, int n) {
    float acc = 1.0f ;
    for (int i = 0; i < n; i++) {
      acc *= x;
    }
    return acc ;
  }

  /**
   * Berechnet die Fakultaet rekursiv (Stack nicht beachtet).
   * @param x Wert
   * @return fak(x)
   */
  public float berechneFak(float x) {
    return (x <= 1.0f) ? 1.0f : x * berechneFak(x - 1.0f);
  }

  /**
   * Berechnet den Cosinus wie in der Aufgabenstellung definiert.
   * @param x Wert
   * @param ordnung Genauigkeit
   * @return cos(x)
   */
  public float berechneCosinus(float x, int ordnung) {
    float acc = 0.0f;
    float k = 0;
    for (float n = 0; n < ordnung; n++) {
      k = n % 2 == 0 && n % 4 == 0 ? 1 : n % 2 == 0 && n % 4 != 0 ? -1 : 0;
      acc += k / berechneFak(n) * potenziere(x, (int)n);
    }
    return acc;
  }
}
