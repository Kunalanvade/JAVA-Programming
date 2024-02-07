import java.util.*;

public class sum_of_integer {

    public static int addition(int n) {
        int sum = 0;
        while (n >= 0) {
            int LD = n % 10;
            sum = sum + LD;
            n = n / 10;
            break;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an Integer: ");
        int digit = sc.nextInt();
        System.out.println("The Sum is " + addition(digit));

    }
}
