// parameter in defination parameter and formal parameter
// calling statement argument actual parameter

import java.util.Scanner;

public class functionwithparameter {
    public static int sum(int a,int b){
   return a+b;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int x,y;
        System.out.println("enter x and y");
        x=sc.nextInt();
        y=sc.nextInt();
        System.out.println(sum(x,y));
    }
}
