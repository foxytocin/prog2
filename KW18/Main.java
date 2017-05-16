/** Klasse zum Debuggen von Uebungsaufgaben */
public class Main {
    /** 
     * Programm unterstuezt keine Parameter 
     * @param args Werden nicht benutzt
     */
    public static void main (String[] args) {
        
        // Testen der letzten Aufgabe...
        sieb s = new sieb();
        int[] arr = s.erzeugeKandidaten(10);
        s.filtereKandidaten3(arr);
        s.druckeKandidaten(arr);
    }

    /** 
     * Erste Aufgabe.
     * @param z Zahl
     */
    int methode1 (int z) {
        // if (z!=3)
        //     return 0;
        // else return 1;

        return z != 3 ? 0 : 1;
    }

    /**
     * Zweite Aufgabe.
     * @param x String
     */
    String methode2 (String x) {
        // if (x.equals("hallo"))
        //     return "hallo!";
        // else 
        //     return "tschuess";
        
        return x.equals("hallo") ? "hallo" : "tschuess";
    }

    /**
     * Dritte Aufgabe mit Floats.
     * @param i Zahl
     */
    float komplizierteBedingung (float i) {
        // if(i<0.0f)
        //     return -1f ;
        // else if (i<3f)
        //     return i ;
        // else return 1f ;

        return i < 0.0f ? - 1f : i < 3f ? i : 1f;
    }

    /**
     * Vierte Aufgabe.
     * @param k Zahl
     */
    int correctThis (int k) {
    //void correctThis(int k) {
        // if (k>0) {
        //     int sum=0;
        //     for (int i=0; i<k; i++)
        //     sum += i;
        // } else
        //     sum=0 ;
        // return sum ;

        int sum=0;
        if (k > 0) {
            for (int i = 0; i<k; i++) {
                sum += i;
            }
        } else {
            sum=0 ;
        }
        return sum ;
    }

    /**
     * Fuenfte Aufgabe.
     * @param x Zahl
     */
    float correctThis2 (float x)
    {
        // float resultat = 1.0;
        if (x >= 0.0)
            // return resultat;
            return 1.0f;
        else
            return 0.0f ;
    }

    /**
     * Sechste Aufgabe: Druckt alle Elemente eines
     * Arrays auf der Konsole aus. Ausgabe wird beendet
     * wenn "end" ausgegeben wird.
     * @param strings Auszugebende Strings
     */
    void druckeStrings1 (String[] strings) {
        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
            if (strings[i].equals("end")) {
                break;
            }
        }
    }

    /**
     * Siebte Aufgabe: Liest Zeilen von der Konsole und
     * gibt diese aus, solange bis "end" eingegeben wurde.
     */
    void druckeStrings2 () {
        // ohne import java.util.Scanner;
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        String einString = "";
        do {
            einString = scanner.nextLine();
            System.out.println(einString);
        } while (!einString.equals("end"));
    }
}

/**
 * Stellt Funktionen bereit um Primzahlen herauszufiltern.
 */
class sieb {

    /**
     * Liefert ein Array gefuellt mit [0 - limit-1]
     * @param limit Zahl
     */
    public int [] erzeugeKandidaten (int limit) {
        int[] kandidaten = new int[limit];
        for (int i = 0; i < limit; i++)
            kandidaten[i] = i;
        return kandidaten;
    }

    /**
     * Sieb des Eratosthenes:
     * Filtert das uebergebene Array in dem alle 
     * Nicht-Primzahlen durch -1 ersetzt werden.
     */
    public void filtereKandidaten (int[] kandidaten) {
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
     * Eine allgemeine Loesung zu filtereKandidaten.
     * @param kandidaten Zahlenarray
     */
    public void filtereKandidaten2 (int[] kandidaten) 
    {
        for(int i = 0; i < kandidaten.length; i++) {
            if(kandidaten[i] < 2) {
                kandidaten[i] = -1;
            } else {
                for(int j = 2; j < kandidaten[i] / 2 + 1; j++) {
                    if(kandidaten[i] % j == 0)
                        kandidaten[i] = -1;
                }
            }
        }
    }

    /**
     * Gibt alle Elemente des uebergebenen Arrays 
     * untereinander auf der Konsole aus.
     */
    void druckeKandidaten(int[] kandidaten) {
      for(int i = 0; i < kandidaten.length; i++)
        if(kandidaten[i] != -1) System.out.println(kandidaten[i]);
    }
    
    /**
     * Komplett anderer Ansatz - Primzahlentest.
     * @param kandidaten Zahlenarray
     */
    public void filtereKandidaten3 (int[] kandidaten) {
        for(int i = 0; i < kandidaten.length; i++) {
            if(!test(kandidaten[i]))
                kandidaten[i] = -1;
        }
    }

    /**
     * Sagt aus ob die uebergebene Zahl eine Primzahl ist.
     * @param n Zahl
     * @return Primzahl ja/nein
     */
    public static boolean test(long n) {
        if (n <= 16)
            return (n == 2 || n == 3 || n == 5 || n == 7 || n == 11 || n == 13);
        if (n % 2 == 0 || n % 3 == 0 || n % 5 == 0 || n % 7 == 0)
            return false;
        long b = (long) Math.sqrt (n) + 1;
        for (long i = 10; i < b; i += 10) {
            if ((n % (i + 1) == 0) 
                || (n % (i + 3) == 0) 
                || (n % (i + 7) == 0) 
                || (n % (i + 9) == 0)) return false;
        }
        return true;
    }
}