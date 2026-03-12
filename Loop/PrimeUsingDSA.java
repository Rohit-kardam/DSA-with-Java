import java.util.Scanner;

public class PrimeUsingDSA {
    public static void main(String[] args) {
        int n;
        Scanner sc= new Scanner(System.in);
        System.out.println("Entere a valid number:");
        n=sc.nextInt();
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
            System.out.println("not prime");
            return;
            }
        }
        if(n>1){
        System.out.println("prime");    
        }
        else{
            System.out.println(" not prime");
        }
    }
}
