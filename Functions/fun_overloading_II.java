import java.util.*;

public class fun_overloading_II {

    public static int sum(int a, int b) {
        int total = a + b;
        return total;

    }

    public static float sum(float a, float b) {
        float total = a + b;
        return total;

    }

    public static void main(String[] args) {
        System.out.println(sum(4, 5));

        System.out.println(sum(4.0f, 5.0f));
    }
}
