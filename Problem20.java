import com.intellij.openapi.vcs.history.VcsRevisionNumber;

import java.math.BigInteger;

/**
 * Created by Jackson on 5/25/16.
 */
public class Problem20 {
    public static void main(String[] args){
        int number = 100;
        int total = 0;
        BigInteger factorialNum = new BigInteger("1");
        String factorialString;
        while(number != 1){
            factorialNum = factorialNum.multiply(new BigInteger(number + ""));
            number--;
        }
        factorialString = factorialNum.toString();
        for(int i=0;i<factorialString.length();i++){
            total += Integer.parseInt(factorialString.charAt(i) + "");
        }
        System.out.println(total);
    }
}
