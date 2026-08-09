// Multithreading in Java.
// By extending the Thread class.

class MyThread extends Thread {
    public void run() {
        String str = "Thread started running .....";
        System.out.println(str);
    }
}

public class Tutorial26 {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();
    }
}
