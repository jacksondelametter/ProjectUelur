/**
 * Created by Jackson on 4/23/16.
 */
public class Problem4 {
    public static void main(String[] arg){
        long product;
        long previousPalindrone = 0;
        boolean found = false;
        for(int i=999;i>=100;i--){
            for(int j=999;j>=100;j--){
                product = i * j;
                if(isPalindrome(product) && product > previousPalindrone){
                    previousPalindrone = product;
                }
            }
        }
        System.out.println(previousPalindrone);
    }
    public static boolean isPalindrome(long number){
        boolean foundPalidrone;
        String stringNum = Long.toString(number);
        String reverseStringNum = "";
        int forwardCount = 0;
        int backwardsCount = stringNum.length()-1;
        while(true){
            if(forwardCount > backwardsCount){
                foundPalidrone = true;
                break;
            }
            else if(stringNum.charAt(forwardCount) != stringNum.charAt(backwardsCount)){
                foundPalidrone = false;
                break;
            }
            forwardCount++;
            backwardsCount--;
        }
        return foundPalidrone;
    }
}
