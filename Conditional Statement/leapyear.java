import java.util.Scanner;

public class leapyear {
    public static void main(String[] args) {
        int year;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a year");
        year=sc.nextInt();
        if(year%4==0 && year%100!=0 || year%400==0){
            System.out.println("leap year");
        }
        else{
            System.err.println("Not a leap year");
        }





            }
}
