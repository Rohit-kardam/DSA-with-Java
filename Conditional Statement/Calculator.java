import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in); 
        int a,b;
        System.out.println("Enter a :");
        a= sc.nextInt();
         System.out.println("Enter b :");
        b= sc.nextInt();
        char operator= sc.next().charAt(0);
        switch (operator) {
            case '+':
                System.out.println(a+b);
                break;
            case '-':
                System.out.println(a-b);
                break;
                  case '*':
                System.out.println(a*b);
                break;
                  case '/':
                System.out.println(a/b);
                break;    
          case '%':
                System.out.println(a%b);
                break;
            default:
                break;
        }
    }
}
