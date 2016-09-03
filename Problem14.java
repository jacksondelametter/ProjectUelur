import java.util.HashMap;

/**
 * Created by Jackson on 5/17/16.
 */
public class Problem14 {
    public static void main(String[] args){
        int chain;
        int highestChain = 0;
        long highestChainNum = 0;
        for(long i=2;i<1000000;i++){
            System.out.println(i);
            chain = collatzChain(i);
            if(chain > highestChain) {
                highestChain = chain;
                highestChainNum = i;
            }
        }
        System.out.println(highestChainNum);
    }
    public static int collatzChain(long n){
        int chain = 0;
        while(true){
            //System.out.println(n);
            if(n == 1) break;
            else if(n % 2 == 0) n = n / 2;
            else n = 3 * n + 1;
            chain++;
        }
        return chain;
    }
}
