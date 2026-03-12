public class primeinrange {
    public static void primeinrang(int n){

        for(int i=2;i<=n;i++){
            int flag=0;
            for(int j=2;j<=Math.sqrt(i);j++){
                if(i%j==0){
                   flag=1;
                   break;
                }

            }
            if(flag==0){
                System.out.println(i);
            }
           
           
            
        }
    }
    public static void main(String[] args) {
        primeinrang(20);
        
    }
}
