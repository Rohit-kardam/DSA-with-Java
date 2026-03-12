public class methodoverloading {
    public static int sum(int a,int b){
         return a+b;
    }
    
    public static int sum(int a,int b,int c){
         return a+b+c;
    }
    public static float sum(float a,float b){
         return a+b;
    }
   public static void main(String[] args) {
    System.out.println(sum(2, 3));
    System.out.println(sum(3, 3, 3));
    System.out.println(sum(3.2f, 3.5f));
   }
}
