import java.util.*;

public class Ternary {
    
    public static void main(String[] args) {
        int age;
         Scanner sc = new Scanner(System.in);

        System.out.println("Enter age");
       age = sc.nextInt();

        String m = age >= 18 ? "vote" : "not vote";

        System.out.println(m);
    }
}
