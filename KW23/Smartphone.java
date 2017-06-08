abstract class Smartphone {
  int nr;
  String typ;

  /**
   * Erstellt ein neues Smartphone vom Typ Smartphone.
   */
  public Smartphone() {
    this.typ = "Smartphone";
  }

  /**
   * Aktiviert die Telefonnummer auf diesem Smartphone.
   * @param nr Telefonnummer
   */
  public void registriereNummer (int nr) {
    this.nr = nr;
  }

  /**
   * Sendet eien SMS an die gegebene Nummer.
   * @param nr Telefonnummer des Empfaengers.
   * @param text SMS Inhalt
   */
  public void sms(int nr, String text) {
    Provider.sendeSms (nr, text);
  }

  abstract public void smsEmpfangen(String text);
}