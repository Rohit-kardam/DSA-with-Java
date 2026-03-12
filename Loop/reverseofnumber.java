// if a number divded by 10 than last digit of number comes 
//print the reverse without variable
public class reverseofnumber {
    public static void main(String[] args) {
        int n=10899;
        while (n>0) {
            int lastdigit=n%10;
            System.out.print(lastdigit);
            n=n/10;
            
        }
        System.out.println();
    }
    
}
