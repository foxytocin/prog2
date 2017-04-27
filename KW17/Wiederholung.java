import java.util.Scanner;

public class Wiederholung {
    public static void main (String[] args) {

        // Variablen und Typen wie
        // int, String, char,...
        int zahl;
        zahl = 1;

        int zahl2 = 2;

        String text = "Hallo Welt";

        char zeichen = 'A';

        boolean wahrheitswert = true;

        // Ausgaben auf der Konsole machen
        System.out.print("Ausgabe ohne Umbruch");
        System.out.println("Ausgabe mit Zeilenumbruch");

        // Scanner ist auch ein Typ, muss aber vorher
        // importiert werden (siehe Zeile 1)
        Scanner scanner = new Scanner(System.in);

        // Eingaben von der Konsole einlesen und in
        // einer dafür vorgesehenen Variable speichern
        System.out.println("Bite irgendwas eingeben...");
        text = scanner.next();
        System.out.println("Bite Zahl eingeben...");
        zahl = scanner.nextInt();
        System.out.println("Bite Wahrheitswert eingeben...");
        wahrheitswert = scanner.nextBoolean();

        // Rechenoperationen und Konkatenationen
        zahl = 4 + 3 * 2 / 1;
        zahl2 = zahl % 3;

        String text2 = "Hallo " + "Welt";
        text2 = text + text2;
        text2 = text + zeichen + zahl;

        // Kontrollstrukturen
        if (zahl == 23) {
            System.out.println("Deine Zahl ist " + zahl);
        } 
        else { 
            
            // Eine verschachtelte Kontrollstruktur 
            if (wahrheitswert) {
                System.out.println("Der wahrheitswert ist true");
            } 
            else {
                
                if (wahrheitswert || true) {
                    System.out.println("Irgendwas ODER true ist immer true");
                }
            }
        }

        // Schleifen
        int i = 0;
        while (i < 10) {
            System.out.println("i = " + i);
            i++; // oder auch: i = i + 1;   oder auch: i += 1;
        }

        wahrheitswert = true;
        while (wahrheitswert) {
            System.out.println("Soll die Schleife weiterlaufen?");
            wahrheitswert = scanner.nextBoolean();

            // Eine Schleife innerhalb einer Schleife (Verschachtelung)
            int j = 10;
            while (j > 0) {
                System.out.print(j + " ");
                j = j - 2; // oder auch j -= 2;
            }
        }
    }
}