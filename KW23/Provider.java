class Provider {
  
  static int[] nums;
  static Smartphone[] phones;
  static int max = 10;
  static int anzahl = 0;
  
  public static void main (String[] args) {
    nums = new int[max];
    phones = new Smartphone[max];

    Smartphone w = new WindowsPhone();
    Smartphone a = new AndroidPhone();
    Smartphone i = new IPhone();
    // Smartphone s = new Smartphone(); // Ist nicht erlaubt, da abstract

    registriereNummer (123, w);
    registriereNummer (234, a);
    registriereNummer (345, i);

    a.sms(345, "Hallo iPhone!");   // Android sendet SMS an iPhone
    i.sms(123, "Hallo Windows!");  // iPhone sendet SMS an Windows
    w.sms(234, "Hallo Android!");  // Windows sendet SMS an Android
  }

  /**
   * Registriert ein neues Smartphone, sodass es von anderen registrierten
   * Smartphones erreichbar ist.
   * @param nr Telefonnummer
   * @param s Smartphone
   */
  public static void registriereNummer (int nr, Smartphone s) {
    s.registriereNummer (nr);
    nums[anzahl] = nr;
    phones[anzahl++] = s;
  }

  /**
   * Wird von der Methode sms der Klasse Smartphone aufgerufen.
   * @param nr Telefonnummer, an die die SMS gehen soll
   * @param txt SMS-Inhalt
   */
  public static void sendeSms(int nr, String txt) {
    for (int i = 0; i < max; i++) {
      if (nr == nums[i]) {
        phones[i].smsEmpfangen(txt);
        return;
      }
    }
  }
}