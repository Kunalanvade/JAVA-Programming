import java.util.*;

public class prime_comp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        int counter = 0;
        for (int i = 2; i <= n - 1; i++) {
            if (n % i == 0) {
                counter++;
            }
        }
        if(counter > 0)
        {
            System.out.println("not prime");
        }
        else{
            System.out.println("prime") ;       }

    }
}
