class Outer {
    private String message = "hello from outer class";
    class Inner {
        void display(){
            System.out.println("Message:" + message);
        }
    }
}
public class InnerAnonyDemo {
    public static void main(String[] args) {
        Outer obj = new Outer();
        Outer.Inner in = obj.new Inner();
        in.display();
    }
}