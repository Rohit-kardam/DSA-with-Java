import java.util.Scanner;

public class Incometax {
    public static void main(String[] args) {
        int income;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the income of person");
        income=sc.nextInt();
        if(income <500000){
            System.out.println("0%tax");
        }
        else if(income>500000 && income <1000000){
            System.out.println("Tax is 20%");
        }
        else{
            System.out.println("tax is 30%");
        }

    }
}
