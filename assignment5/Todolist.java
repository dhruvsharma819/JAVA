import java.util.ArrayList;

public class Todolist {
    public static void main(String[] args) {
        ArrayList<String> tasks = new ArrayList<>();

        tasks.add("Going to collage");
        tasks.add("Washing Cloths");
        tasks.add("Study Java");
        tasks.add("Take a nap");

        

        tasks.remove("Take a nap");

        StringBuffer sb = new StringBuffer();
        sb.append("To Do List:\n");
        for (int i = 0; i < tasks.size(); i++) {
            sb.append(tasks.get(i)).append("\n");
        }

        System.out.println(sb);
    }
}