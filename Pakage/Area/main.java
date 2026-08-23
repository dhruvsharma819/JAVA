import MyRectangle.rectangle;
import MySquare.square;

public class main {
    public static void main(String[] args) {

        square s = new square();
        rectangle r = new rectangle();

        System.out.println("Area of Square = " + s.area(5));
        System.out.println("Area of Rectangle = " + r.area(10, 4));
    }
}