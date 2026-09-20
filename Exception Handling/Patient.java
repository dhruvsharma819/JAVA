import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Patient {
    public static void main(String[] args) {

        try {  // Store info of patient in file
            FileWriter writer = new FileWriter("patient.txt");

            writer.write("Name:Ram\n");
            writer.write("Patient no:4\n");
            writer.write("Age:19\n");
            writer.write("Disease:Fever\n");

            writer.close();

            // Read information from the file
            FileReader reader = new FileReader("patient.txt");
            StringBuilder patientData = new StringBuilder();

            int data;
            while ((data = reader.read()) != -1) {
                patientData.append((char) data);
            }

            System.out.println(patientData);

            reader.close();

        } catch (IOException e) {
            System.out.println("File Error: " + e.getMessage());
            System.out.println("Exception: "
                    + e.getClass().getSimpleName() + " occurred.");
        }
    }
}