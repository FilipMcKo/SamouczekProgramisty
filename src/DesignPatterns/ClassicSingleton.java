package DesignPatterns;
public class ClassicSingleton {
    private static ClassicSingleton instance = null;

    private ClassicSingleton() {  // prywatny konstruktor
    }

    public static ClassicSingleton getInstance() {
        if(instance == null) {
            instance = new ClassicSingleton();
        }
        return instance;
    }
}
