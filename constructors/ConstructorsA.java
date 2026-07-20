// question - 2. Develop a Mobile Phone Inventory System using different constructors to initialize mobile details and create duplicate object records. 

class Mobile {
    String brand;
    String model;
    int price;
    int quantity;

    
    Mobile(String b, String m, int p, int q) {          // Parameterized Constructor 
        brand = b;
        model = m;
        price = p;
        quantity = q;
    }

    
    Mobile(Mobile copyMb) {                         // Copy Constructor
        this.brand = copyMb.brand;
        this.model = copyMb.model;
        this.price = copyMb.price;
        this.quantity = copyMb.quantity;
    }

    void display() {
        System.out.println("Brand = " + brand);
        System.out.println("Model = " + model);
        System.out.println("Price = " + price);
        System.out.println("Quantity = " + quantity);
        System.out.println();
    }
}

public class ConstructorsA {
    public static void main(String[] args) {

        // Parameterized Constructor
        Mobile m1 = new Mobile("Samsung", "Galaxy S24", 75000, 10);
        Mobile m2 = new Mobile("Apple", "iPhone 15", 80000, 5);

        // Copy Constructor
        Mobile m3 = new Mobile(m1);
        Mobile m4 = new Mobile(m2);

        System.out.println("Original Mobile 1:");
        m1.display();

        System.out.println("Original Mobile 2:");
        m2.display();

        System.out.println("Duplicate Mobile 1:");
        m3.display();

        System.out.println("Duplicate Mobile 2:");
        m4.display();
    }
}