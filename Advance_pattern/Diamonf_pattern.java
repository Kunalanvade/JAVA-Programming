import java.util.*;

public class Diamonf_pattern {

    public static void diamond(int n) {// first half of diamond
        for (int i = 1; i <= n; i++) {
            // for space
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // for stars
            for (int j = 1; j <= 2 * (i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // second half of diamond
        for (int i = n; i >= 1; i--) {
            {
                // for space
                for (int j = 1; j <= n - i; j++) {
                    System.out.print(" ");
                }
                // for stars
                for (int j = 1; j <= 2 * (i) - 1; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        diamond(5);
    }
}
