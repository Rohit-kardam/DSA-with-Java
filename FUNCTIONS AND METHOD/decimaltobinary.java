public class decimaltobinary {
    public static void binary(int deci){
        int bin=0;
        int rem;
        int pow=0;
        while(deci>0){
            rem=deci%2;
            bin=bin+rem*(int)Math.pow(10, pow);
            pow++;
            deci=deci/2;
        }
        System.out.println(bin);
    }
    public static void main(String[] args) {
        binary(8);
    }
}
