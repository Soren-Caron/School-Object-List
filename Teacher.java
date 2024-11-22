
// This class creates the object "teacher" that provides methods and variables (firstName, lastName, subject). The "get" methods return the current value
// while the "set" methods sets a value for a variable.
public class Teacher {
    private String firstName;
    private String lastName;
    private String subject;

    public Teacher(String firstName, String lastName, String subject){
        this.firstName = firstName;
        this.lastName = lastName;
        this.subject = subject;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void setSubject(String subject){
        this.subject = subject;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public String getSubject(){
        return subject;
    }

    // returns the object's (teacher) variables in terms of readable text
    public String toString(){
        return "\n" + "Name: " + firstName + " " + lastName + ", Subject: " + subject;
    }
}
