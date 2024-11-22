import java.util.ArrayList;

// This class creates the object "school" that provides methods and variables (arraylist of teachers and students, totalclasses, name, city). The "get" methods return the current value
// while the "set" methods sets a value for a variable.
public class School {
    ArrayList<Teacher> teachers = new ArrayList<>();

    ArrayList<Student> students = new ArrayList<>();

    private int totalClasses;

    private String name;

    private String city;

    //constructor that includes every variable besides teacher and student arraylist(it's not necessary)
    School(int totalClasses, String name, String city){
        this.totalClasses = totalClasses;
        this.name = name;
        this.city = city;
    }

    public int getTotalClasses() {

        return totalClasses;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public ArrayList<Student> getStudents() {

        return students;
    }

    public ArrayList<Teacher> getTeachers() {

        return teachers;
    }

    public void setTotalClasses(int totalClasses) {

        this.totalClasses = totalClasses;
    }

    public void setName(String name) {

        this.name = name;
    }

    public void setCity(String city) {

        this.city = city;
    }

    public void setStudents(ArrayList<Student> students) {

        this.students = students;
    }

    public void setTeachers(ArrayList<Teacher> teachers) {

        this.teachers = teachers;
    }

    // The following methods add or remove students or teachers
    public void addStudent(Student student) {
        students.add(student);
    }

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    public void removeStudent(int i) {
        students.remove(i);
    }

    public void removeTeacher(int i) {
        teachers.remove(i);
    }

    // the following methods show the list of students or teachers
    public void showStudents(){
        System.out.println(students.toString());
    }

    public void showTeacher(){
        System.out.println(teachers.toString());
    }
}
