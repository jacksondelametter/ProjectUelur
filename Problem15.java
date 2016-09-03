/**
 * Created by Jackson on 5/18/16.
 */
public class Problem15 {
    static final int numOfSquares = 4;
    static int pathsFound = 0;
    static String[][] grid;
    public static void main(String[] args){
        grid = populateGrid();
        //printGrid(grid);
        findPaths(0,0);
        System.out.println("The amount of paths in this grid are " + pathsFound);
    }
    public static String[][] populateGrid(){
        String[][] grid = new String[numOfSquares + 1][numOfSquares + 1];
        for(int i=0;i<grid[0].length;i++){
            for(int j=0;j<grid[1].length;j++){
                if(i == 0 && j == 0) grid[i][j] = "!";
                else grid[i][j] = "*";
            }
        }
        return grid;
    }
    public static void printGrid(String[][] grid){
        for(int i=0;i<grid[0].length;i++){
            for(int j=0;j<grid[1].length;j++){
                System.out.print(grid[i][j]);
            }
            System.out.println("");
        }
    }
    public static void findPaths(int xCord, int yCord){
        if(xCord == (grid[1].length - 1) && yCord == (grid[0].length - 1)) System.out.println(++pathsFound);
        if(xCord + 1 < grid[1].length) findPaths(xCord + 1, yCord);
        if(yCord + 1 < grid[0].length) findPaths(xCord, yCord + 1);
    }
    public static void findPathsIterative(){
        int xCord = 0;
        int yCord = 0;
        while(true){
            if(xCord + 1 < grid[1].length){
                xCord += 1;
                continue;
            }
            else if(yCord + 1 < grid[0].length){
                yCord += 1;
                continue;
            }
            pathsFound++;
            break;
        }
    }
    public static void getPath(int xCord, int yCord){
        int x = xCord;
        int y = yCord;
    }
}
