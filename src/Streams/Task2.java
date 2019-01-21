package samouczekProgramisty.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Task2 {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2, 54, 26, 1, -654, 35, 2, 8, 9, 4, 6, 5, 5, -48498651);
        Optional<Integer> min = list
                .stream()
                .reduce((a, b) -> a > b ? b : a);
        System.out.println(min);
    }
}
