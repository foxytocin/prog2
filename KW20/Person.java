class Person {
    int alter;
    String name;

    public Person (int alter, String name) {
        this.alter = alter;
        this.name = name;
    }

    public Person () {
        alter = 0;
        name = "Max Mustermann";
    }

    public String gruesse (String text) {
        return text + " " + name;
    }
}