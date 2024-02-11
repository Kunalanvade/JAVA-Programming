
public class AdvancedPattern {
    public static void main(String[] args) {
        int rows = 5;

        for (int i = 1; i <= rows; i++) {
            // Print leading spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            // Print numbers in ascending order
            for (int k = 1; k <= i; k++) {
                System.out.print(k + " ");
            }
            // Print numbers in descending order
            for (int l = i - 1; l >= 1; l--) {
                System.out.print(l + " ");
            }
            System.out.println();
        }
    }
}