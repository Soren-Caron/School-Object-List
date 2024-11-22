
public class Main {
    public static void main(String[] args) {
        School school = new School(3, "Orwell", "Vancouver");

        // create 10 student objects and add it to the student list in school.java
        Student student1 = new Student("George", "Vinichenko", 11, 1234123);
        school.addStudent(student1);
        Student student2 = new Student("Edson", "Cheng", 11, 1238123);
        school.addStudent(student2);
        Student student3 = new Student("Richard", "Tang", 11, 6784365);
        school.addStudent(student3);
        Student student4 = new Student("Jonas", "Hart", 9, 3457896);
        school.addStudent(student4);
        Student student5 = new Student("Alex", "Smith", 8, 1536784);
        school.addStudent(student5);
        Student student6 = new Student("Steve", "Williams", 12, 8652391);
        school.addStudent(student6);
        Student student7 = new Student("Brian", "Hart", 12, 9283564);
        school.addStudent(student7);
        Student student8 = new Student("James", "Barlowe", 10, 1236843);
        school.addStudent(student8);
        Student student9 = new Student("Joe", "Caron", 9, 1634399);
        school.addStudent(student9);
        Student student10 = new Student("Haily", "Madden", 8, 9356783);
        school.addStudent(student10);

        // create 3 teacher objects and add it to the teacher list in school.java
        Teacher teacher1 = new Teacher("Paul", "Zaremba", "Programming");
        school.addTeacher(teacher1);
        Teacher teacher2 = new Teacher("Jonathan", "Wilkie", "Biology");
        school.addTeacher(teacher2);
        Teacher teacher3 = new Teacher("Benny", "Low", "Math");
        school.addTeacher(teacher3);

        school.showStudents();
        school.showTeacher();

        // remove 2 students and 1 teacher
        school.removeStudent(3);
        school.removeStudent(5);
        school.removeTeacher(2);

        school.showStudents();
        school.showTeacher();
    }
}
