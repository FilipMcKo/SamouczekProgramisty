package Threads.WaysToCreateThread;

public class UsingLambdas {

    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("I'm inside runnable!");
            }
        });


        Thread thread2 = new Thread(() -> System.out.println("I'm inside runnable!"));

    }
}
