import java.util.ArrayList;

public class CourseReg {
    public static void main(String[] args) {
        ArrayList<String> courses = new ArrayList<>();

        courses.add("Programming With Java");
        courses.add("DBMS");
        courses.add("OS");
        courses.add("Data Structure");
        courses.add("Mathematics");


        courses.remove("Programing With Java");
        courses.remove("OS");

        StringBuffer sb = new StringBuffer();
        sb.append("Registered Courses:\n");
        for (int i = 0; i < courses.size(); i++) {
            sb.append(courses.get(i)).append("\n");
        }

        System.out.println(sb);
    }
}