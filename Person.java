
/**
 * Write a description of class Person here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Person
{
    // instance variables - replace the example below with your own
    private String name = "John Doe";
    private int age = 12;

    /**
     * Constructor for objects of class Person
     */
    public Person(String theName, int theAge)
    {
        // initialise instance variables
        this.name = theName;
        this.age = theAge;
    }

    public String getName()
    {
        return this.name;
    }
    public void setName(String theName)
    {
        this.name = theName;
    }
    
    public int getAge()
    {
        return this.age;
    }
    
    public void setAge(int theAge)
    {
        this.age = theAge;
    }
    
    public void printPersonalInfo()
    {
        System.out.println(this.name + ": " + this.age +" year old");
    }
}
