import java.util.*;

public class bino_coeff {

    public static int factorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }

    public static int bino_coeff(int n, int r) {
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int n_r_fact = factorial(n - r);

        int bino_coef = fact_n / (fact_r * n_r_fact);
        return bino_coef;

    }

    public static void main(String[] args) {
        System.out.println(bino_coeff(5, 2));
    }
}
