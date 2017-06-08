class IPhone extends Smartphone {
  public IPhone() {
    this.typ = "iPhone";
  }

  @Override
  public void smsEmpfangen(String text) {
    System.out.println("<<" + text);
    System.out.println(this.typ + " leitet die SMS an die NSA weiter...\n");
  }
}