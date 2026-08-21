class BankAccount {
    final int num = 12345678;
    String name = "Ram";
    double bal = 1234.56;

    void displayAccount() {
        System.out.println("Account Number: " + num);
        System.out.println("Account Holder: " + name);
        System.out.println("Balance: " + bal);
    }
}

public class bank {
    public static void main(String[] args) {
        BankAccount b = new BankAccount();
        b.displayAccount();
    }
}