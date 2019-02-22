package Threads.WaysToCreateThread;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("I'm inside runnable!");
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new MyRunnable());
    }
}


