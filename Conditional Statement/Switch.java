import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        String day;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter day");
        day=sc.next();


        switch (day) {
            case "Monday":
                System.out.println("monday");
                break;
        
            default:
                break;
        }
    }
}
