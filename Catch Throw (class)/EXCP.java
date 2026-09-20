class ZeroException extends RuntimeException {
    public ZeroException(String m) {
        super(m);
    }
}

public class EXCP {

    public static void divide(int a, int b) {
        if (b == 0) {
            throw new ZeroException("Division by zero is not possible");
        }

        System.out.println("result: " + (a / b));
    }

    public static void main(String[] args) {
        try {
            divide(10, 0);
        } catch (ZeroException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}
