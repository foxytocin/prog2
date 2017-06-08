class IPhone extends Smartphone {
  public IPhone() {
    this.typ = "iPhone";
  }

  @Override
  public void smsEmpfangen(String text) {
    super.smsEmpfangen(text);
    System.out.println(this.typ + " speichert die empfangene SMS in die iCloud...");
  }
}