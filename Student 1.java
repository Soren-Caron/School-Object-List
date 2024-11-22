// This class creates the object "student" that provides methods and variables (firstName, lastName, grade, studentNumber). The "get" methods return the current value
// while the "set" methods sets a value for a variable.
public class Student {
    private String firstName;
    private String lastName;
    private int grade;
    private int studentNumber;


    Student(String firstName, String lastName, int grade, int studentNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
        this.studentNumber = studentNumber;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void setGrade(int grade){
        this.grade = grade;
    }

    public void setStudentNumber(int studentNumber){
        this.studentNumber = studentNumber;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public int getGrade(){
        return grade;
    }

    public int getStudentNumber(){
        return studentNumber;
    }

    // returns the object's (student) variables in terms of readable text
    public String toString(){
        return "\n" + "Name: " + firstName + " " + lastName + ", Grade: " + grade;
    }
}