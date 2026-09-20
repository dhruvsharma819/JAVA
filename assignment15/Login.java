import java.util.Scanner;

public class Login {

    static void login(String pass) throws Exception {
        if (pass!="dhruv19") {
            throw new Exception("Invalid Password!");
        }

        System.out.println("Login Successful!");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Password: ");
        String password = sc.nextLine();

        try {
            login(password);
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        } finally {
            System.out.println("Login process completed.");
            sc.close();
        }
    }
}
