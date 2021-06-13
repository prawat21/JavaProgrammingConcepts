package JavaQuestions;

public class ThisDemo {

	int i;

	void setValue(int i) {
		// i = i; //0
		this.i = i; // 100
	}

	void show() {
		System.out.println(i);
	}

	public static void main(String[] args) {
		ThisDemo TD = new ThisDemo();
		TD.setValue(100);
		TD.show();
		// System.out.println; // println cannot be resolved or is not a field
		System.out.println('V' + 'A'); // 74 + 65
		System.out.println('J' + 'A' + 'V' + 'A'); // 74+65+86+65
		System.out.println(args.length); // 0
		// System.out.println(args.length()); // Cannot invoke length() on the array
		// type String[]
	}

}
