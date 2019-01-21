package samouczekProgramisty.LambdaExpressions;

import java.util.function.*;

public class Task2 {

    public static void main(String[] args) {
        Supplier<Object> supplier = Object::new;
        Object objectInstance1 = supplier.get();
        Object objectInstance2 = supplier.get();

        Predicate<Object> predicate = objectInstance1::equals;
        BiPredicate<Object,Object> biPredicate = Object::equals;

        System.out.println(predicate.test(objectInstance2));
        System.out.println(biPredicate.test(objectInstance1,objectInstance1));
    }
}
