/**
 * Created by Jackson on 4/30/16.
 */
public class Problem6 {
    public static void main(String[] args){
        long sumOfSquares = sumOfSquares();
        long squareOfSums = squareOfSums();

        long difference = squareOfSums - sumOfSquares;
        System.out.println("The difference between the sum of squares and the square of sum is " + difference);
    }
    public static long sumOfSquares(){
        long sum = 0;
        for(int i=1;i<=100;i++){
            sum += (i * i);
        }
        return sum;
    }
    public static long squareOfSums(){
        long sum = 0;
        for(int i=1;i<=100;i++){
            sum += i;
        }
        sum *= sum;
        return sum;
    }
}
