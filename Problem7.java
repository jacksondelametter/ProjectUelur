/**
 * Created by Jackson on 4/30/16.
 */
public class Problem7 {
    public static void main(String[] args){
        int primeCount = 0;
        int number = 2;
        while(true){
            if(isPrime(number)) primeCount++;

            if(primeCount == 10001) break;
            number++;
        }
        System.out.println("The 10001st prime number is " + number);
    }
    public static boolean isPrime(int number){
        for(int i=2;i<=Math.sqrt((double)number);i++){
            if(number % i == 0) return false;
        }
        return true;
    }
}
