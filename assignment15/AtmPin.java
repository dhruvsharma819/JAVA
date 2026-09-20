import java.util.Scanner;

public class AtmPin {
    static void verify(int pin) throws Exception {
        if(pin!=19082007) {
            throw new Exception("invalid password");
        }
        else {
            System.out.println("Correct Password");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter pin");
        int pin=sc.nextInt();

        try {
            verify(pin);
        } catch (Exception e) {
            System.out.println("Exception :" + e.getMessage());
        } finally {
            System.out.println("verification is completed");
            sc.close();
        }
    }

}
