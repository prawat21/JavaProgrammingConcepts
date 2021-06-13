package JavaOOPsConcepts;

public class FinalKeywordExample {

	final void m1()
	{
		System.out.println("Final Method");
	}
	public static void main(String[] args) {
		//final int i = 10;
		//i = i + 20;
		//System.out.println(i);

	}
	
	class B extends FinalKeywordExample
	{
		//void m1()
		{
			System.out.println("Method of class B");
		}
	}

}
