import java.util.Scanner;

class LicenseException extends Exception {
    LicenseException(String message) {
        super(message);
    }
}

public class License {
    static void checkAge(int age) throws LicenseException {
        if (age < 18) {
            throw new LicenseException("You are not eligible for driving license");
        } else {
            System.out.println("You are eligible for driving license");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your age");
        int age = sc.nextInt();

        try {
            checkAge(age);
        } catch (LicenseException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        sc.close();
    }
}
