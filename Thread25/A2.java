class ThreadImp1 implements Runnable {
    public void run() {
        System.out.println("HI");
    }
}

public class A2 {
    public static void main(String[] args) {
        ThreadImp1 t1 = new ThreadImp1();
        Thread t = new Thread(t1);
        t.start();
    }
}
