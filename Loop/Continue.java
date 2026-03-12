import java.util.Scanner;

public class Continue {
    public static void main(String[] args) {
        int n;
        Scanner sc= new Scanner(System.in);
        do{
            System.out.println("enter a number:");
            n=sc.nextInt();
            if(n%10==0){
                System.out.println("its a multiple of 10");
                continue;
            }
        }
        while(true);
    }
}
