public class Stone1{
    public static void main(String[] args){
        int n;
        for(int i = 1; i < 200;){
            n = i;
            if(n == 4){
                i += 1;
            }else{
                if((n % 2) == 1){
                    n = (n * 3) + 1;
                } else{
                    n = n / 2;
                }
            }
        
        }
    }
        
}