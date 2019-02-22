public class BeforeMain {

    public static void sayHi(){
        System.out.println("Hi before main method");

    }

    public void sayHello(){
        System.out.println("hello");
    }

    public static void main(String[] args) {
        System.out.println("main method");
        BeforeMain beforeMain = new BeforeMain();
    }
}
