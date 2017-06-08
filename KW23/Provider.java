class Provider {
  
  static int[] nums;
  static Smartphone[] phones;
  static int max = 10;
  static int anzahl = 0;
  
  public static void main (String[] args) {
    nums = new int[max];
    phones = new Smartphone[max];

    Smartphone s = new Smartphone();
    Smartphone w = new WindowsPhone();
    Smartphone a = new AndroidPhone();
    Smartphone i = new IPhone();

    registriereNummer (1234, s);
    registriereNummer (4321, w);
    registriereNummer (1423, a);
    registriereNummer (4132, i);

    s.sms(1423, "Hallo Android, hier ist Smartphone!");   // Smartphone sendet SMS an Android
    a.sms(4132, "Hallo iPhone!, hier ist ");              // Android sendet SMS an iPhone
    i.sms(4321, "Hallo Windows!");                        // iPhone sendet SMS an Windows
    w.sms(1234, "Hallo Smartphone!");                     // Windows sendet SMS an Smarphone
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