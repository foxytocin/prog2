class Programm {
    public static void main (String[] args) {
        Person max = new Person();
        System.out.println (max.gruesse("Hallo"));

        Person bob = new Person (10, "Bob");
        System.out.println (bob.gruesse("Hallo"));
    }
}
