public class binomialcoff {
    public static int fact(int n){
        int f=1;
        for(int i=n;i>=1;i--){
            f=f*i;
        }
        return f;
    }
public static int binomial(int n,int r){
    int fact_n=fact(n);
    int fact_r=fact(r);
    int fact_nr=fact(n-r);
    int bc=fact_n/(fact_r*fact_nr);
    return bc;
}
    public static void main(String[] args) {
        int n=10;
        int r=5;
        System.out.println(binomial(n, r));
        
        
    }
    
}
