package JavaOOPsConcepts;

 public class EncapsulationConcept {
	
	// private variables declared can only be 
    // accessed by public methods of class
    private String geekName;
    private int geekRoll;
    private int geekAge;
 
    // get method for age to access private variable geekAge
    public int getAge() { return geekAge; }
 
    // get method for name to access private variable geekName
    public String getName() { return geekName; }
 
    // get method for roll to access private variable geekRoll
    public int getRoll() { return geekRoll; }
 
    // set method for age to access private variable geekage
    public void setAge(int newAge) { geekAge = newAge; }
 
    // set method for name to access private variable geekName
    public void setName(String newName) { geekName = newName; }
 
    // set method for roll to access private variable geekRoll
    public void setRoll(int newRoll) { geekRoll = newRoll; }
}
 
 class TestEncapsulation {
    public static void main(String[] args)
    {
    	EncapsulationConcept obj = new EncapsulationConcept();
 
        // setting values of the variables
        obj.setName("Ananya");
        obj.setAge(06);
        obj.setRoll(05);
 
        // Displaying values of the variables
        System.out.println("Name: " + obj.getName());
        System.out.println("Age: " + obj.getAge());
        System.out.println("Roll: " + obj.getRoll());
 
        // Direct access of Roll is not possible
        // due to encapsulation
        // System.out.println("Geek's roll: " +
        // obj.geekName);
    }
}
