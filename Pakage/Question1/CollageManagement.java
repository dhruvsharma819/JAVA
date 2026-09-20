import faculty.Faculty;
import student.Student;

public class CollageManagement {
    public static void main(String[] args) {

        Student s1 = new Student("Ram", 1, "CS");

        Faculty f1 = new Faculty("Proff Shyam", "OS", 11);

        s1.displayStudent();

        System.out.println();

        f1.displayFaculty();
    }
}