class Restaurant {

    static int totalOrders;
    int dineInBill;
    int takeawayBill;
    double deliveryBill;

    Restaurant(int d) {
        dineInBill = d;
    }

    Restaurant(int t, int x) {
        takeawayBill = t;
    }

    Restaurant(double d) {
        deliveryBill = d;
    }

    // Version 1 - DineIn Bill
    void bill(int bill) {
        totalOrders++;
        System.out.println("Dine-in Bill = " + bill);
    }

    // Version 2 - TakeawayBill
    void bill(int bill, int packingCharge) {
        int total = bill + packingCharge;
        totalOrders++;
        System.out.println("Takeaway Bill = " + total);
    }

    // Version 3 - DeliveryBill
    void bill(double bill) {
        totalOrders++;
        System.out.println("Delivery Bill = " + bill);
    }

    static void showOrders() {
        System.out.println("Total Orders = " + totalOrders);
    }

    public static void main(String[] args) {

        Restaurant r1 = new Restaurant(500);
        r1.bill(r1.dineInBill);

        Restaurant r2 = new Restaurant(400, 20);
        r2.bill(400, 20);

        Restaurant r3 = new Restaurant(650.50);
        r3.bill(650.50);

        Restaurant r4 = new Restaurant(1007.0);
        r4.bill(r4.deliveryBill);

        Restaurant.showOrders();
    }
}
