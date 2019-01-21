package samouczekProgramisty.LambdaExpressions;

import java.util.function.IntSupplier;
import java.util.function.ToIntFunction;

public class Example1 {
    public static void main(String[] args) {
        Object objectInstance = new Object();
        IntSupplier equalsMethodOnObject = objectInstance::hashCode;
        System.out.println(equalsMethodOnObject.getAsInt());
        System.out.println(objectInstance.hashCode());

        ToIntFunction<Object> hashCodeMethodOnClass = Object::hashCode;
        System.out.println(hashCodeMethodOnClass.applyAsInt(objectInstance));
        System.out.println(hashCodeMethodOnClass.applyAsInt(new Object()));

    }
}
