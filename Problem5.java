/**
 * Created by Jackson on 4/23/16.
 */
public class Problem5 {
    static int numbers[] = {2,3,4,5,6,7,8,11,12,13,14,15,16,17,18,19,20};
    public static void main(String[] args){
        int smallestMultiple = 100;
        boolean found = false;
        while(!found){
            if(smallestMultiple % 2 == 0 && testNumbers(smallestMultiple)){
                System.out.println("The smallest multiple is " + smallestMultiple);
                found = true;
            }
            smallestMultiple++;
        }
    }
    public static boolean testNumbers(long number){
        for(int i=0;i<numbers.length;i++){
            if(number % numbers[i] != 0) return false;
        }
        return true;
    }
}
