class WindowsPhone extends Smartphone implements GuthabenAufladbar {
  
  public WindowsPhone() {
    this.typ = "WindowsPhone";
  }

  @Override
  public void smsEmpfangen(String text) {
    System.out.println(this.typ + " verabschiedet sich mit einem BlueScreen\n");
  }

  @Override
  public void aufladen(int guthaben) {
    System.out.println("Das " + typ + " laedt " + guthaben + "EUR auf...");
  }
}