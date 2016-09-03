/**
 * Created by Jackson on 5/25/16.
 */
public class Problem21 {
    public static void main(String[] args){
        long amicableTotal = 0;
        long divisorSumOne;
        long divisorSumTwo;
        for(int i=1;i<10000;i++){
            divisorSumOne = getDivisorSum(i);
            divisorSumTwo = getDivisorSum(divisorSumOne);
            if((i == divisorSumTwo) && (i != divisorSumOne)) amicableTotal += i;
        }
        System.out.println(amicableTotal);
    }
    public static long getDivisorSum(long number){
        long sum = 0;
        for(int i=1;i<number;i++){
            if(number % i == 0) sum += i;
        }
        return sum;
    }
}
