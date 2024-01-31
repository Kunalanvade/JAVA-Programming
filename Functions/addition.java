import java.util.*;

public class addition {

    public static void add() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num_1 : ");
        int num_1 = sc.nextInt();
        System.out.print("Enter num_2 : ");
        int num_2 = sc.nextInt();
        int sum = num_1 + num_2;
        System.out.println("Sum = " + sum);

    }

    public static void main(String[] args) {
        add();
    }
}
