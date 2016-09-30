
/**
 * Write a description of class World here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class World
{

    /**
     * Constructor for objects of class World
     */
    public static void main(String[] args)
    {
        /*
        Person mrDoe = new Person("John", 20);
        mrDoe.printPersonalInfo();
        
        Person mrHurworth = new Person("Patrick", 42);
        mrHurworth.printPersonalInfo();
        */
       
        
        Student stephen = new Student("Stephen", 15, 1801);
        stephen.printStudentInfo();
        
        Student ethan = new Student("Ethan", 16, 11019);
        
        System.out.println("Ethan's age is: " + ethan.getAge()); 
        System.out.println("Ethan's student id is: " + ethan.getStudentId());
    }
}




