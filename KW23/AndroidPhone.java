class AndroidPhone extends Smartphone {
  public AndroidPhone() {
    this.typ = "AndroidPhone";
  }

  @Override
  public void smsEmpfangen(String text) {
    System.out.println("<<" + text);
    System.out.println(this.typ + " äüßööäüöäßäüöäülüöläüß...\n");
  }
}