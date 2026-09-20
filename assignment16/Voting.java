import java.util.Scanner;

class AgeException extends Exception {
    AgeException(String message) {
        super(message);
    }
}

public class Voting {
    static void Age(int age) throws AgeException {
        if (age < 18) {
            throw new AgeException("You are not eligible for voting");
        } else {
            System.out.println("You are eligible for voting");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your age");
        int age = sc.nextInt();

        try {
            Age(age);
        } catch (AgeException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        sc.close();
    }
}
