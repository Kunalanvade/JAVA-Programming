import java.util.*;

public class fun_overloading {

    public static int sum(int a, int b) {
        int total = a + b;
        return total;
    }

    public static int sum(int a, int b, int c) {
        int total = a + b + c;
        return total;
    }

    public static void main(String[] args) {

        System.out.println(sum(3, 5));
        System.out.println(sum(3, 5, 6));

    }
}
