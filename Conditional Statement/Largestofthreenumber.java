import java.util.Scanner;

public class Largestofthreenumber {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value of a ");
        a= sc.nextInt();
        System.out.println("Enter the value of b ");
        b= sc.nextInt();
        System.out.println("Enter the value of c ");
        c= sc.nextInt();
        if(a>b && a>c){
            System.out.println("A is big");
        }
        else if(b>c && b>a){
            System.out.println("B is big");
        }
        else if(c>a && c>b){
            System.out.println("C is big");

        }
        else{
            System.out.println("All are equal");
        }
    }
}
