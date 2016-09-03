/**
 * Created by Jackson on 4/20/16.
 */
public class Problem3 {
    public static void main(String[] args){
        long number = 600851475143l;    //600851475143l
        System.out.println("The largest Prime number of " + number + " is " + findLargestPrime(number));
    }
    public static long findLargestPrime(long startingNum){  // Does prime factorization on a number
        long dividingNum;
        long number = startingNum;
        while(true){
            dividingNum = getSmallestDivisibleNum(number);  //Finds the smallest number that is divisible by the current number
            if(dividingNum == 0) return number;             // If the returned number is 0, then number is a prime
            number /= dividingNum;
        }
    }
    public static long getSmallestDivisibleNum(long number){    //Finds the smallest multiple of the number passed in
        for(long i=2;i<number;i++){
            if(number % i == 0){
                return i;
            }
        }
        return 0;
    }
}
