class Person {
	int alter;
	String name;
	public static String typ = "Person";

	// Konstruktor: Erzeugt eine Person mit Name und Alter
	public Person (String name, int alter) {
		this.name = name;
		this.alter = alter;
	}

	// Konstruktor: Erzeugt eine Person mit Name
	public Person (String name) {
		this.name = name;
		this.alter = 0; // Standardwert 0
	}

	// Konstruktor: Erzeugt eine Person mit Standardwerten
	public Person () {
		alter = 0;      // Standardwert 0
		name = "Max";   // Standardwert "Max"
	}

	public String gruesse (String text) {
		return text + " " + Person.typ + " " + name;
	}
}