package JavaOOPsConcepts;

public class ParametrisedConstructors {

	int id;
	String name;

	// constructor would initialize data members with the values of passed arguments
	// while object of that class created.

	private ParametrisedConstructors(int id, String name) {
		this.id = id;
		this.name = name;

	}

	public static void main(String[] args) throws CloneNotSupportedException {

		ParametrisedConstructors pc = new ParametrisedConstructors(1001, "Puneet");
		System.out.println("ID: " + pc.id + "--" + " Name: " + pc.name);

		// creating clone of above object
		// ParametrisedConstructors pclone = (ParametrisedConstructors)pc.clone();
		// System.out.println("ID: " + pclone.id + "--" + " Name: " + pclone.name);
	}

}
