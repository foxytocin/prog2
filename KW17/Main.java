class Main {
    public static void main(String[] args) {

        System.out.println("Testen der letzten Aufgabe...");
        
        System.out.println(Hex2Int("0x32F") + " dec \t= " + "0x32F hex" );
        System.out.println(Hex2Int("0xA2E")  + " dec \t= " + "0xA2E hex" );
        System.out.println(Hex2Int("0x15") + " dec \t\t= " + "0x15 hex" );
        System.out.println(Hex2Int("0x0") + " dec \t\t= " + "0 hex" );
        System.out.println(Hex2Int("0x16") + " dec \t\t= " + "0x16 hex" );
    }

    /**
     * Bestimmt die Position eines Wertes in einem Array.
     */
    public int findeWertImArray (int [] array, int wert) {
        for (int i = 0; i < array.length; i++) {
            if(array[i] == wert) return i;
        }
        return -1;
    }

    /**
     * Initialisiert eine quadratische 2D-Matrix.
     */
    public int[][] qMatrix (int n, int init) {
        if (n <= 0) n = 1;
        int[][] qm = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                qm[i][j] = init;
        return qm;
    }

    /**
     * Ackermann Funktion - Implementierung nach der Definition von Péter.
     */
    public static int ackermann (int n, int m) {
         return (n == 0) ? m + 1 : (m == 0) ? ackermann(n - 1, 1) : ackermann(n - 1, ackermann(n, m - 1));
    }

    public int alpha (int a, int n){
        return n == 0 ? 0 : n == 1 ? 1 : a;
    }

    public int phi (int a, int b, int n) {
        return n == 0 ? a + b : n > 0 && b == 0 ? alpha(a, n - 1) : phi(a, phi(a, b - 1, n), n - 1);
    }

    /**
     * Wandelt eine Zahl zur Basis 16 in eine zur Basis 10 um.
     * Eine moegliche Loesung, mit Mitteln aus der prog1 Vorlesung.
     */
    public static int Hex2Int (String hex) {

        if (hex.length() < 2) return 0;
        
        hex = hex.toUpperCase();
        int sum = 0;
        int base = 1;
        char[] alphabet = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        
        for (int i = hex.length() - 1; i > 1 ; i--) {
            for (int j = 15; j >= 0; j--) {
                if(alphabet[j] == hex.charAt(i)) {
                    sum += j * base;
                    continue;
                }
            }
            base *= 16;
        }
        return sum;
    }
}