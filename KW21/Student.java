class Student extends Person {
  
  int mtrkl;

  public Student (String name, int alter, int mtrkl) {
    super (name, alter);
    this.mtrkl = mtrkl;
  }

  /**
   * Ueberschreibt die Methode der obersten Klasse Object.
   */
  @Override
  public String toString() {
    return 
      "Matrikelnummer: " + this.mtrkl + 
      "\nName: " + this.name + 
      "\nAlter: " + this.alter;
  }
  
  /**
   * Ueberschreibt die Methode der Oberklasse Person.
   */
  @Override
  public String gruesse (String text) {
    return text + " Student " + name;
  }
}