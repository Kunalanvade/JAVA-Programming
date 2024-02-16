import java.util.*;

public class program_1 {

    public static void main(String args[]) {

        int marks[] = new int[50];

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of marks = ");
        marks[0] = sc.nextInt();
        System.out.print("Enter the number of marks = ");
        marks[1] = sc.nextInt();
        System.out.print("Enter the number of marks = ");
        marks[2] = sc.nextInt();

        System.out.println("marks of pysics = " + marks[0]);
        System.out.println("marks of chem = " + marks[1]);
        System.out.println("marks of maths = " + marks[2]);
    }

}