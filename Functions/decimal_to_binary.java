import java.util.*;

public class decimal_to_binary {

    public static void DectoBin(int n) {
        int MyNum = n;
        int pow = 0;
        int BinNum = 0;

        while (n > 0) {
            int rem = n % 2;
            BinNum = BinNum + (rem * (int) Math.pow(10, pow));
            pow++;
            n = n / 2;
        }
        System.out.println("binary of " + MyNum + " is " + BinNum);

    }

    public static void main(String[] args) {

        DectoBin(07);
    }
}
