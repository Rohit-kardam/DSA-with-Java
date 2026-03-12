import java.util.Scanner;

public class Palindrome {
    public static void Palindrom(int n){
        int rem;
        int rev=0;
        int original=n;
        
        
        while(n!=0){
            rem=n%10;
            rev=rev*10+rem;
           
            n=n/10;

        }
       if(original==rev){
        System.out.println("palindrom");
       }
       else{
        System.out.println("no");
       }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Ebter the number:");
        int n;
        n=sc.nextInt();
        Palindrom(n);
    }
}
