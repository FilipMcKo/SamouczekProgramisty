package DesignPatterns;

class ThreadSafeSingleton {

    private static final ThreadSafeSingleton obj = new ThreadSafeSingleton();

    private ThreadSafeSingleton() { // prywatny konstruktor
        // ...
    }

    public static ThreadSafeSingleton getInstance() {
        return obj;


    }

}
