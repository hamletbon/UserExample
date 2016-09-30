
public class Student extends Person
{
    // instance variables - replace the example below with your own
    private int studentId;

    /**
     * Constructor for objects of class Student
     */
    public Student(String theName, int theAge, int theStudentId)
    {
        // initialise instance variables
        super(theName, theAge);
        this.studentId = theStudentId;
    }

    public int getStudentId()
    {
        return this.studentId;
    }
    
    public void setStudentId(int theStudentId)
    {
        this.studentId = theStudentId;
    }
    
    public void printStudentInfo()
    {
        System.out.println(this.getName() + ": " + this.getAge() +" year old");
        System.out.println("Student id: "+this.getStudentId());
    }
}







