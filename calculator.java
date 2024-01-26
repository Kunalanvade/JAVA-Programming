import java.util.*;

public class calculator {
    public static void main(String[] arg)
{
       Scanner sc = new Scanner(System.in);
       int a = sc.nextInt();
       int b = sc.nextInt();
       char ch = sc.next().charAt(0);
     
     switch(ch){
        case '+': System.out.println(a+b);
        break;
        case '-': System.out.println(a-b);
        break;
        case '*': System.out.println(a*b);
        break;
        case '/': System.out.println(a/b);
        break;
        case '%': System.out.println(a%b);
        break;
        default:System.out.println("ha ha ha" );
     }


}
}