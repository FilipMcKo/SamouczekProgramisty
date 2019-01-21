package samouczekProgramisty.LambdaExpressions;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Task1 {


    public static void main(String[] args) {
        List<String> words = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            System.out.print("Podaj słowo: ");
            words.add(scanner.nextLine());
        }

        //comparator za pomoca lambda
        Comparator<String> comparatorLambda = (String o1, String o2) -> {
            if (o1.length() < o2.length())
                return -1;
            else if (o1.length() > o2.length())
                return 1;
            else
                return 0;
        };

        //comparator labda autorstwa m.pietraszka
        words.sort((a, b) -> a.length() - b.length());


        //comparator za pomoca instancji klasy anoniowaej i nadpisania funkcji z interfejsu
        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() < o2.length())
                    return -1;
                else if (o1.length() > o2.length())
                    return 1;
                else
                    return 0;
            }
        };

        //words.sort(comparatorLambda);

        System.out.println(words.toString());
    }
}

