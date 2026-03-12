import java.util.Scanner;

public class Primeornot {
    public static void main(String[] args) {
        int n;
        boolean isprime= true;
        Scanner sc= new Scanner(System.in);
        System.out.println("ENTER A NUMBER");
        n=sc.nextInt();
       for(int i=2;i<=n-1;i++){
        if(n%i==0){
            isprime=false;
        }
       }
       if(isprime==false||n==1){
        System.out.println("not prime");
       }
       else{
        System.out.println("prime");
       }
    }
}
