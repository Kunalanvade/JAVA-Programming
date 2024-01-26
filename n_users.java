import java.util.*;

public class n_users {
    public static void main(String[] arg){
    
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter number :-");
     int range = sc.nextInt();
     int counter=1;
     while(counter<=range ){
        System.out.println(counter);
        counter++;
     }
      System.out.println("Printed Succesfully !!!");
    }
}