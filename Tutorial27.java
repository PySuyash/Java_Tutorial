// Multithreading in java.
// By implementing the Runnable interface.

class MyThread implements Runnable {
    public void run() {
        String str = "Thread is running .......";
        System.out.println(str);
    }
}

public class Tutorial27 {
    public static void main(String[] args) {
        MyThread g1 = new MyThread();
        Thread t1 = new Thread(g1);
        t1.start();
    }
}
