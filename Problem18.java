import java.util.ArrayList;
import java.util.Set;

/**
 * Created by Jackson on 5/23/16.
 */
public class Problem18 {
    static String[][] triangle;
    static ArrayList<Integer> totals = new ArrayList<>();
    public static void main(String[] args){
        int numbersIndex;
        String numbers = "75 95 64 17 47 82 18 35 87 10 20 04 82 47 65 19 01 23 75 03 34 88 02 77 73 07 63 67 99 65 04 28 06 16 70 92 41 41 26 56 83 40 80 70 33 41 48 72 33 47 32 37 16 94 29 53 71 44 65 25 43 91 52 97 51 14 70 11 33 28 77 73 17 78 39 68 17 57 91 71 52 38 17 14 91 43 58 50 27 29 48 63 66 04 68 89 53 67 30 73 16 69 87 40 31 04 62 98 27 23 09 70 98 73 93 38 53 60 04 23";
        int triangleRowCount = 1;

        ArrayList<String> numberList = getStringList(numbers);
        triangle = getTriangle(numberList);
        //printTriangle(triangle);

        getTotal(0, 0, 0);
        printGreatestTotal();
    }
    public static void printGreatestTotal(){
        int greatest = 0;
        for(int i=0;i<totals.size();i++){
            if(totals.get(i) > greatest) greatest = totals.get(i);
        }
        System.out.println(greatest);
    }
    public static ArrayList<String> getStringList(String numbers){
        ArrayList<String> list = new ArrayList<>();
        String singleNumber = "";
        for(int i=0;i< numbers.length();i++){
            if(numbers.charAt(i) == ' '){
                list.add(singleNumber);
                singleNumber = "";
            }
            else{
                singleNumber += numbers.charAt(i) + "";
            }
        }
        list.add(list.size()-1, singleNumber);
        return list;
    }
    public static void getTotal(int collumn, int row, int total){
        total += Integer.parseInt(triangle[collumn][row]);
        if(collumn == 14){
            totals.add(total);
            return;
        }
        getTotal(collumn + 1, row, total);
        getTotal(collumn + 1, row + 1, total);
    }
    public static String[][] getTriangle(ArrayList<String> list){
        String[][] triangle = new String[15][];
        int triangleRowCount = 1;
        int listIndex = 0;
        for(int i=0;i<15;i++){
            triangle[i] = new String[triangleRowCount];
            for(int j=0;j<triangleRowCount;j++){
                triangle[i][j] = list.get(listIndex);
                listIndex++;
            }
            triangleRowCount++;
        }
        return triangle;
    }
    public static void printTriangle(String[][] triangle){
        for(int i=0;i<15;i++){
            for(int j=0;j<triangle[i].length;j++){
                System.out.print(triangle[i][j] + " ");
            }
            System.out.println("");
        }
    }
    public static void printArrayList(ArrayList<String> list){
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i) + " ");
        }
    }
}
