/**
 * Created by Jackson on 3/26/16.
 */
public class Problem1 {
    public static void main(String[] args){
        int sum = 0;
        for(int i=1;i<1000;i++){
            if((i % 3 == 0) || (i % 5 == 0)){   // If i is divisible by 3 or 5, then add it to the sum
                sum += i;
            }
        }
        System.out.println(sum);
    }

}
