public class Stone1{
    public static void main(String[] args){
        int n;
        int count = 0;
        boolean loop;
        int most = 0;
        for(int i = 1; i < 201; i++){
            n = i;
            loop = false;
            count = 0;
            while(!loop ){
                if(n == 4){
                    System.out.println(i + ": " + count + " loops");
                    if(count > most){
                        most = count;
                    }
                    loop = true;
                }
                else{
                    count = count + 1;
                    if((n % 2) == 1){
                        n = (n * 3) + 1;
                    } else{
                        n = n / 2;
                    }
                }
            }
        }
        System.out.println("The most amount of loops were " + most + " loops");

    }
}
        
