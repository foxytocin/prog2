class Programm {
    public static void main (String[] args) {
        Person bob = new Person ("Bob", 10);
        Person kai = new Person ("Kai");
        Person max = new Person();

        System.out.println (bob.gruesse("Hallo"));
        System.out.println (kai.gruesse("Hallo"));
        System.out.println (max.gruesse("Hallo"));

        Person.typ = "Haustier";

        System.out.println (bob.gruesse("Hallo"));
        System.out.println (kai.gruesse("Hallo"));
        System.out.println (max.gruesse("Hallo"));
    }
}