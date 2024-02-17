import java.util.*;

public class REVERSE_ARRAY {

    public static void reverse(int number[]) {
        int start = 0, end = number.length - 1;

        while (start < end) {
            // swapping of array //
            int temp = number[end];
            number[end] = number[start];
            number[start] = temp;

            start++;
            end--;
        }

    }

    public static void main(String[] args) {

        int number[] = { 2, 4, 6, 8, 10, 12 };
        reverse(number);
        for (int i = 0; i <= number.length; i++) {
            System.out.print(number[i] + " ");
        }
        System.out.println();
    }
}
