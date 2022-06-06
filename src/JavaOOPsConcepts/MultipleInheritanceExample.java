package JavaOOPsConcepts;

interface one {
	boolean isMoveable();
}

interface two {
	boolean isRollable();
}

interface three extends one, two {
	boolean isPresent();

}

public class MultipleInheritanceExample implements three {

	public boolean isMoveable() {
		return true;
	}

	public boolean isRollable() {
		return true;
	}
	public boolean isPresent() {
		return false;
	}
	public static void main(String[] args) {
		MultipleInheritanceExample MIE = new MultipleInheritanceExample();
		System.out.println(MIE.isMoveable());
		System.out.println(MIE.isRollable());
		System.out.println(MIE.isPresent());

	}

}
