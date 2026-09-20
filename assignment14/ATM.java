import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int bal=5000;

        System.out.print("Enter withdrawal amount:");
        int amount = sc.nextInt();

        try {
            if (amount <= 0) {
                throw new Exception("Amount less than zero");
            }

            if (amount > bal) {
                throw new Exception("Insufficient balance");
            }

            bal = bal - amount;

            System.out.println("Withdrawal successful!");
            System.out.println("Remaining balance: " + bal);
        }
        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}