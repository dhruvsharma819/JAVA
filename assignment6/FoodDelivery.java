class DeliveryStatus {
    void update(){

    }
}

class Order{
    String item;
    int bill;

    Order(String item,int bill) {
        this.item = item;
        this.bill = bill;
    }

    class OrderDetails {
        void display(){
            System.out.println("Item ordered= " + item);
            System.out.println("Bill= " + bill);
        }
    }
}



public class FoodDelivery{
    public static void main(String[] args) {
        Order o1 = new Order("Veg Thali",200);
        Order.OrderDetails d = o1.new OrderDetails();
        d.display();

        DeliveryStatus ds = new DeliveryStatus() {
          void update() {
              System.out.println("Order is delivered");
          }
        };
        ds.update();
    }
}