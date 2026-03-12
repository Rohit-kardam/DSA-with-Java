import java.util.Scanner;

public class sumofdigitofinteger {
    public static void sumofint(int n){
        int lastd;
        int rem;
        int sum=0;
        while(n>0){
            rem=n%10;
            sum=sum+rem;
            n=n/10;
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n;
        System.out.println("enter number:");
        n=sc.nextInt();
        sumofint(n);
    }
}
