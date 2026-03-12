import java.util.Scanner;

public class Numerfrom1toN {

    public static void main(String[] args) {
        int n;
        int i=1;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter ending point");
        n=sc.nextInt();
        while (i<=n) {
            System.out.println(i);
            i++;
            
        }
    }
}