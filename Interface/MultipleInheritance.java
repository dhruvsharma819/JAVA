interface P1 {
    void display();
}
interface P2 {
    void show();
}
 
 class A implements P1,P2 {
    public void display(){
        System.out.println("P1 characters is called");
    }
    public void show(){
        System.out.println("p2 characters is called");
    }
 }
 public class MultipleInheritance {
    public static void main(String[] args) {
        A a = new A();
        a.display();
        a.show();
    }
 }