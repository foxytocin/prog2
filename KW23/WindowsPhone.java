class WindowsPhone extends Smartphone {
  
  public WindowsPhone() {
    this.typ = "WindowsPhone";
  }

  @Override
  public void smsEmpfangen(String text) {
    System.out.println(this.typ + " verabschiedet sich mit einem BlueScreen\n");
  }
}