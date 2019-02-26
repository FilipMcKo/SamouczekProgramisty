public class BeforeMain {

    public static void sayHi(){
        System.out.println("Hi before main method");

    }

    public void sayHello(){
        System.out.println("hello");
    }

    public static void main(String[] args) {
        BeforeMain beforeMain = new BeforeMain();
        System.out.println("main method");
    }
}
