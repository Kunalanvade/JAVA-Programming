import java.util.*;

public class pairs {
    
    public static void print_pairs(int number[]){
        for(int i=0; i<number.length; i++){
            int current=number[i];
            for(int j=i+1; j<number.length; j++){
                System.out.print("("+current+","+number[j]+ ")");
            }
            System.out.println(" ");
        }
    }



    public static void main(String[] args) {
        int number []={2,4,6,8,10};
        print_pairs(number);
    }
}
