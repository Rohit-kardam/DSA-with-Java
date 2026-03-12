import java.util.Scanner;

class totalcost{
    public static void main(String[] args) {
    float pencil,eraser,pen;
    int $= 24;
        Scanner sc= new Scanner(System.in);
    System.out.println("Enter the cost of pencil:");
     System.out.println("Enter the cost of eraser:");
      System.out.println("Enter the cost of pen:");
      pencil=sc.nextFloat();
      eraser=sc.nextFloat();
      pen=sc.nextFloat();
    
        System.out.println(" total cost of the items:"+ (pencil+eraser+pen));
        System.out.println($);
    }
}