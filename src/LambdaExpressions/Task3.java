package samouczekProgramisty.LambdaExpressions;

import java.util.function.BiFunction;
import java.util.function.Supplier;

public class Task3 {

    public static void main(String[] args) {
        BiFunction<Integer, String, Human> biFunction = Human::new;

        Human human = biFunction.apply(32,"adam");
        System.out.println(human.getAge());
        System.out.println(human.getName());

    }
}
