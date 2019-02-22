package TypyProsteAReferencyjne;



public class Test{

    public static void main(String[] args) {
        testPrimitives();
        testReferences();
    }

    static void testPrimitives() {
        int x = 1;
        int y = x;

        x = 2;

        System.out.println("y: " + y);

    }

    static void testReferences() {
        SomeClass a = new SomeClass();
        SomeClass b = a;

        a.setDescr("new value");

        System.out.println("b descr: " + b.getDescr());
    }
}