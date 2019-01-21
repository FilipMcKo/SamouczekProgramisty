package AnonymousClasses;

import java.util.*;

public class Anonymosclasses2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.println("Podaj słowo nr " + (i + 1) + ": ");
            list.add(scanner.nextLine());
        }

        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length()<o2.length()) return -1;
                else if (o1.length()==o2.length()) return 0;
                return 1;
            }
        });

        System.out.println(list);

    }
}
