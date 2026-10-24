class MyTask implements Runnable {
    public void run() {
        for (int i =1 ; i<=5 ; i++){
            System.out.println(Thread.currentThread().getName() + ":" + i);

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        
    }
}

public class MultiThread {
    public static void main(String[] args) {
        MyTask task1 = new MyTask();
        MyTask task2 = new MyTask();
        MyTask task3 = new MyTask();
        
        Thread t1 = new Thread(task1 , "therad-1");
        Thread t2 = new Thread(task2 , "therad-2");
        Thread t3 = new Thread(task3 , "therad-3");

        t1.start();
        t2.start();
        t3.start();
    }
}
