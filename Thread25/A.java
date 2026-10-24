class ThreadImp1 extends Thread {
    public void run() {
        System.out.println("HI");
    }
}

public class A {
    public static void main(String[] args) {
        ThreadImp1 t1 = new ThreadImp1();
        t1.start();
    }
}
