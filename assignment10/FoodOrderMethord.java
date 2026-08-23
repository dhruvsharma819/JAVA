abstract class FoodOrder {

    abstract void Bill();
}

class DineInOrder extends FoodOrder {

    
    void Bill() {
        double foodPrice = 1000;
        double serviceCharge = 30;

        double total = foodPrice + serviceCharge;

        System.out.println("Dine in Order");
        System.out.println("Total bill: " + total);
    }
}

class TakeAwayOrder extends FoodOrder {

    
    void Bill() {
        double foodPrice = 800;
        double packingCharge =20;

        double total = foodPrice + packingCharge;

        System.out.println("Take away Order");
        System.out.println("total bill: " + total);
    }
}

public class FoodOrderMethord {

    public static void main(String[] args) {

        FoodOrder order1 = new DineInOrder();
        order1.Bill();

        FoodOrder order2 = new TakeAwayOrder();
        order2.Bill();
    }
}