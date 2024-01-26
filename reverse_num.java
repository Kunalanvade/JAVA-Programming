import java.util.*;

public class reverse_num {
public static void main(String[] args) {
    int i=12345;
    int rev= 0;
    while(i>0){
        int l = i%10;
        rev=(rev*10)+l;
        i=i/10;
    }
    System.out.println(rev);
}    
}
