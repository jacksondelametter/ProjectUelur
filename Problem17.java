import com.intellij.openapi.vcs.history.VcsRevisionNumber;

/**
 * Created by Jackson on 5/22/16.
 */
public class Problem17 {
    static String[] singleDigitNums = {"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
    static String[] teenDigitNums = {"Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    static String[] doubleDigitNums = {"","Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
    public static void main(String[] args){
        String number;
        String word;
        int letterCount = 0;
        for(int i=1;i<=1000;i++){
            word = getWord(i + "");
            System.out.println(word);
            letterCount += word.length();
        }
        System.out.println("The letter count is " + letterCount);
    }
    public static String getWord(String number){
        String word;
        int numberCount = number.length();
        if(numberCount == 1) word = singleDigitWord(number);
        else if(numberCount == 2) word = doubleDigitWord(number);
        else if(numberCount == 3) word = tripleDigitWord(number);
        else word = "Onethousand";
        return word;
    }
    public static String singleDigitWord(String number){
        String word = "";
        for(int i=1;i<=9;i++){
            if(Integer.parseInt(number) == i){
                word = singleDigitNums[i - 1];
                break;
            }
        }
        return word;
    }
    public static String doubleDigitWord(String number){
        int tensPlaceInt = Integer.parseInt(number.charAt(0) + "");
        int onesPlaceInt = Integer.parseInt(number.charAt(1) + "");
        String tensPlaceString = "";
        String onesPlaceString = "";
        if(tensPlaceInt == 1) return teenDigitNums[Integer.parseInt(number) - 10];
        for(int i=1;i<=9;i++){
            if(onesPlaceInt == i) onesPlaceString = singleDigitNums[i - 1];
            if(tensPlaceInt == i) tensPlaceString = doubleDigitNums[i - 1];
        }
        return tensPlaceString + onesPlaceString;
    }
    public static String tripleDigitWord(String number){
        int oneHundredsPlaceInt = Integer.parseInt(number.charAt(0) + "");
        String oneHundredsPlaceString = "";
        String onesAndTensPlace = doubleDigitWord(number.substring(1));
        String word;
        for(int i=1;i<=9;i++){
            if(oneHundredsPlaceInt == i) oneHundredsPlaceString = singleDigitNums[i - 1] + "Hundred";
        }
        word = oneHundredsPlaceString + onesAndTensPlace;
        if(!onesAndTensPlace.equals("")) word = oneHundredsPlaceString + "and" + onesAndTensPlace;
        else word = oneHundredsPlaceString + onesAndTensPlace;
        return word;
    }
}
