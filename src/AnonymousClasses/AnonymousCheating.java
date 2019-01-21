package AnonymousClasses;

public class AnonymousCheating {
    private interface SomeInterface {
        void doSomethingUseful();
    }

    public static void main(String[] args) {
        SomeInterface anonymousInstance = new SomeInterface() {
            @Override
            public void doSomethingUseful() {
                System.out.println("I'm doing something useful!");
            }
        };

        anonymousInstance.doSomethingUseful();
        System.out.println(anonymousInstance.getClass());
    }
}
