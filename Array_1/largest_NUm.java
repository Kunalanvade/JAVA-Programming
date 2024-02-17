import java.util.*;

public class largest_NUm {

    public static int largest_number(int numbers[]) {

        int largest = Integer.MIN_VALUE; // -infinity
        int smallest = Integer.MAX_VALUE; // +infinity
        for (int i = 0; i < numbers.length; i++) {
            if (largest < numbers[i]) {
                largest = numbers[i];
            }

            if (smallest > numbers[i]) {
                smallest = numbers[i];
            }

        }
        System.out.println("Smallest number is =  " + smallest);
        return largest;

    }

    public static void main(String[] args) {

        int numbers[] = { 1, 5, 3, 7, 9 };
        System.out.println("largest number is = " + largest_number(numbers));

    }
}
