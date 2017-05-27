class Programm {
  public static void main (String[] args) {
    Person bob = new Person ("Bob", 10);
    Person kai = new Person ("Kai");
    Person max = new Person();
    Person ken = new Student("Ken", 20, 123456);

    System.out.println (bob.gruesse("Hallo"));
    System.out.println (kai.gruesse("Hallo"));
    System.out.println (max.gruesse("Hallo"));
    System.out.println (ken.gruesse("Hallo"));

    Person.typ = "Haustier";

    System.out.println (bob.gruesse("Hallo"));
    System.out.println (kai.gruesse("Hallo"));
    System.out.println (max.gruesse("Hallo"));
    System.out.println (ken.gruesse("Hallo"));
  }
}