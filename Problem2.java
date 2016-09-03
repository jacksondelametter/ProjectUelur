/**
 * Created by Jackson on 4/20/16.
 */
public class Problem2 {
    public static void main(String[] args){
        int evenSum = 2;
        evenSum = fib(1, 2, evenSum);
        System.out.println("The sum of the even fibonacci numbers are " + evenSum);

    }
    public static int fib(int numberOne, int numberTwo, int sum){
        int currentNumber = numberOne + numberTwo;
        if(currentNumber > 4000000){    // If the new number is greater than 4 million, return the sum which is 0
            return sum;
        }
        sum = fib(numberTwo, currentNumber, sum);   // Recursivly call the fibinacci sequence
        if(currentNumber % 2 ==0){  // When returning, if the new number is even, add it to the sum
            sum += currentNumber;
        }
        return sum;
    }
}
