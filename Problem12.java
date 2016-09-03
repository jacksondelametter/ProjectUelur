
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


/**
 * Created by Jackson on 5/13/16.
 */
public class Problem12 {
    static long triangularNum = 1;
    static long addingToNum = 2;
    public static void main(String[] args){
        while(!findDivisor(triangularNum)){
            triangularNum += addingToNum;
            addingToNum += 1;
        }
        System.out.println("The triangular number with 500 divisors is " + triangularNum);
    }
    public static boolean findDivisor(long triangularNum){
        ArrayList<Integer> primeNumbers = new ArrayList<>();
        ArrayList<Integer> exponents = new ArrayList<>();
        //initializeToZero(exponents);
        int number = (int)triangularNum;
        int divisor;
        int singleExponent;
        while(true) {
            divisor = getSmallestDivisibleNum(number);
            if (divisor == 0) {
                addExponent(primeNumbers, exponents, number);
                break;
            }
            addExponent(primeNumbers, exponents, divisor);
            number /= divisor;
        }
        if (getNumOfDivisors(exponents)) return true;
        else return false;
    }
    public static void initializeList(ArrayList<Integer> list){
        for(int i=0;i<1000;i++){
            list.set(i,0);
        }
    }
    public static void addExponent(ArrayList<Integer> primeNums, ArrayList<Integer> exponents, int number){
        if(!containsNumber(primeNums, number)){
            primeNums.add(number);
            exponents.add(primeNums.indexOf(number), 1);
        }
        else{
            exponents.set(primeNums.indexOf(number), exponents.get(primeNums.indexOf(number)) + 1);
        }
    }
    public static boolean getNumOfDivisors(ArrayList<Integer> exponents){
        int totalDivisors = 1;
        for(int i=0;i<exponents.size();i++){
            totalDivisors *= (exponents.get(i) + 1);
        }
        if(totalDivisors >= 500) return true;
        else return false;
    }
    public static boolean containsNumber(ArrayList<Integer> list, int number){
        for(int i=0;i<list.size();i++){
            if(list.get(i) == number) return true;
        }
        return false;
    }
    public static void initializeToZero(ArrayList<Integer> exponent){
        int index = 0;
        while(index < 500){
            exponent.add(0);
            index++;
        }
    }
    public static int getSmallestDivisibleNum(long number){    //Finds the smallest multiple of the number passed in
        for(int i=2;i<number;i++){
            if(number % i == 0 && isPrime(i)){
                return i;
            }
        }
        return 0;
    }
    public static boolean isPrime(int number){
        for(int i=2;i<Math.sqrt(number);i++){
            if(number % i == 0) return false;
        }
        return true;
    }
}
