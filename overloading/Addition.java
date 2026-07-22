//1. Develop a Calculator program using overloaded methods for addition of integers and decimals. Use a static variable to count calculations. 

class Addition {

    static int count;
    int a, b;
    double x, y;


    Addition(int c, int d) {
        a = c;
        b = d;
    }

    Addition(double p, double q) {
        x = p;
        y = q;
    }

    // Version 1 - Integer addition
    void add(int x, int y) {
        int sum = a + b;
        count++;
        System.out.println("Integer Addition = " + sum);
    }

    // Version 2 - Decimal addition
    void add(double x, double y) {
        double sum = x + y;
        count++;
        System.out.println("Decimal Addition = " + sum);
    }

    static void showCount() {
        System.out.println("Total calculations = " + count);
    }

    public static void main(String[] args) {

        Addition c1 = new Addition(2, 8);
        c1.add(c1.a, c1.b);

        Addition c2 = new Addition(20.2, 1.1);
        c2.add(c2.x, c2.y);

        Addition.showCount();
    }
}
