class WindowsPhone extends Smartphone {
  public WindowsPhone() {
    this.typ = "WindowsPhone";
  }

  @Override
  public void smsEmpfangen(String text) {
    System.out.println(this.typ + " braucht noch eine Weile die SMS zu empfangen...");
  }
}