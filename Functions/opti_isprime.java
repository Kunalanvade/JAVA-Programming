import java.util.*;

public class opti_isprime {

    public static boolean optimize_is_prime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(optimize_is_prime(4));
    }
}
