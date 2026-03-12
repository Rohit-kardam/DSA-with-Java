public class binarytodecimal {
    public static void decimal(int binum){
        int lastd;
        int dec=0;
        int pow=0;
        int mynum=binum;

        while(binum>0){
            lastd=binum%10;
            dec=dec+lastd*(int)(Math.pow(2, pow));
            pow++;
            binum=binum/10;

        }
        System.out.println("the decimal form of "+mynum+" is \t"+dec);
    }
    public static void main(String[] args) {
         decimal(101);
    }
}