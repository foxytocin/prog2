class AndroidPhone extends Smartphone {
  public AndroidPhone() {
    this.typ = "AndroidPhone";
  }

  @Override
  public void smsEmpfangen(String text) {
    super.smsEmpfangen(text);
    System.out.println(this.typ + " hatte eine Sicherheitslücke und wurde gehackt...");
  }
}