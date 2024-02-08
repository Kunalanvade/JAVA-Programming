import java.util.*;

public class Butterfly {

    public static void butterfly_pattern(int n) {
        // First Half
        for (int i = 1; i <= n; i++) { // stars before space
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // for space between stars
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            // again for stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Second half

        for (int i = n; i >= 1; i--) {
            // stars before space
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // for space between stars
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            // again for stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        butterfly_pattern(7);
    }
}
