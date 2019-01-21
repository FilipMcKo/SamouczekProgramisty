package References;

public class StackOverFlow {
    static Long[] bigOne = new Long[Integer.MAX_VALUE];

    public static void main(String[] args) {
        for (int i = 0; i<Integer.MAX_VALUE; i++) bigOne[i] = 1l;
    }
}
