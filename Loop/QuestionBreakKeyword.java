import java.util.Scanner;

public class QuestionBreakKeyword {
    public static void main(String[] args) {
        int n;
       Scanner sc= new Scanner(System.in);
       do{
        System.out.println("Enter a number:");
        n=sc.nextInt();
        if(n%10==0){
             System.out.println("The number is multiple of 10");
            break;
           
        }
        System.out.println(n);
       }
       while(true);
    }
}
