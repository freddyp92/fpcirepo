 
public class GameBoard {
	//Sets up 2d array that can hold integers
    public int[][] grid;

    //GameBoard constructor
    public GameBoard(int i) {
        int[][] g = new int[i][i];
        this.grid = g;
    }
    
    //Fills 2d array with 0's and prints it in a grid format
    public void initialiseGrid() {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {
                grid[i][j] = 0;
                System.out.print(grid[i][j] + " ");
            }
            System.out.println("");
        }
    }
    
    //Prints the grid
    public void drawGrid() {
    	for (int i = 0; i < grid.length; i++) {
    		for (int j = 0; j < grid.length; j++) {
    			System.out.print(grid[i][j] + " ");
    		}
    		System.out.println("");
    	}
    }
}