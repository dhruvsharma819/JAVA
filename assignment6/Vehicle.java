//anonymous class
class Action {
    void Act(){}
}

class OuterClass {
    String name;
    String type;
    int topspeed;

    OuterClass(String n, int ts , String ty){
        name=n;
        topspeed=ts;
        type=ty;

    }
    class Detail {            // innere class
        void show() {
            System.out.println("Vehicle Name: " + name);
            System.out.println("Type " + type);
            System.out.println("Top Speed: " + topspeed+ "km/h");
    }
}}



    public class Vehicle {
        public static void main(String[] args) {
        OuterClass v = new OuterClass("XUV700", 200, "SUV");

        OuterClass.Detail details = v.new Detail();
        details.show();

        Action a = new Action() {
            void Act() {
                System.out.println(v.name + " is broken.");
            }
        };

        a.Act();
    }
    }
    
