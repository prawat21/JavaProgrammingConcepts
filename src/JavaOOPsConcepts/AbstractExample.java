package JavaOOPsConcepts;

abstract class AbstractExample
{
	abstract void start();
	
	public static void main(String[] args)
	{
		
		//AbstractExample ae = new AbstractExample(); // cannot create the object of abstract class
		Car c = new Car();
		c.start();
	}
}

class Car extends AbstractExample
{
	void start()
	{
		System.out.println("Start with Key");
		System.out.println('j'+'a'+'v'+'a'); // 106+97+118+97=418
		System.out.println('A'+'Z'); //65+90=155
	}
}
