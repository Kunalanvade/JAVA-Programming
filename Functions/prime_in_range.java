import java.util.*;

public class prime_in_range {

    public static boolean isprime(int n) {
        boolean isprime = true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void primes_in_range(int n) {
        for (int i = 2; i <= n; i++) {
            if (isprime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

    }

    public static void main(String[] args) {

        primes_in_range(50);
    }
}
