import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * Created by Jackson on 5/22/16.
 */
public class Problem16 {
    public static void main(String[] args){
        String totalString;
        BigInteger totalNum = new BigInteger("1");
        long total = 0;
        for(int i=1;i<=1000;i++){
            totalNum = totalNum.multiply(new BigInteger("2"));
        }
        totalString = totalNum.toString();
        for(int i=0;i<totalString.length();i++){
            total += Long.parseLong(totalString.charAt(i) + "");
        }
        System.out.println(total);
    }
}
