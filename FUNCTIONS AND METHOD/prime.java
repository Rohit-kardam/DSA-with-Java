import java.util.Scanner;

public class prime {
    public static boolean isprime(int x){
            for(int i=2;i<=Math.sqrt(x);i++){
                if(x%i==0){
                  
                    return false;
                  
                }

            }
            if(x==1){
                 
                return false;

            }
         
            return true;
    }
    public static void isprimerange(int n){
        for(int i=2;i<=n;i++){
            if(isprime(i)){
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int x,n;
        System.out.println("Enter number:");
        x=sc.nextInt();
         System.out.println("Enter range:");
        n=sc.nextInt();
        isprime(x);
        isprimerange(n);
     

    }
}