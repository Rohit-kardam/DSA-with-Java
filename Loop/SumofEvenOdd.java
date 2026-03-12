import java.util.Scanner;

public class SumofEvenOdd {
    public static void main(String[] args) {
        int n;
        int evensum=0;
        int oddsum=0;
        Scanner sc= new Scanner(System.in);
        do{
            System.out.println("enter number:");
            n=sc.nextInt();
            if(n%2==0){
             evensum+=n;
            }
            else{
                oddsum+=n;
            }

        }
            
        while(n!=0);
        System.out.println("evensum"+evensum);
                System.out.println(oddsum);
    
    }
}
