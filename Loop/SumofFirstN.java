import java.util.Scanner;

public class SumofFirstN {
    public static void main(String[] args) {
        int i;
        int n;
        int sum=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("ENter the starting point point");
        i=sc.nextInt();
        System.out.println("ENter the ending point");
        n=sc.nextInt();
        while(i<=n){
            sum=sum+i;
            i++;
        }
        System.out.println(sum);
    }
}
