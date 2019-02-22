package Threads.WaysToCreateThread;

public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("I'm inside thread!");
    }


    public static void main(String[] args) {
        Thread thread = new MyThread();
    }
}


