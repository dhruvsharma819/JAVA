abstract class PaymentMethod {
    abstract void pay(double amount);
}

class CreditCard extends PaymentMethod {

    void pay(double amount) {
        System.out.println("amount paid using card:" + amount);
    }
}

class UPI extends PaymentMethod {

    void pay(double amount) {
        System.out.println("amount paid using upi " + amount);
    }
}

public class Payment {
    public static void main(String[] args) {

        PaymentMethod p1 = new CreditCard();
        p1.pay(10000.6);

        PaymentMethod p2 = new UPI();
        p2.pay(1000);
    }
}