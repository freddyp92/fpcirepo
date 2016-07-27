import java.util.Scanner;
 
public class Player {
    public Player() {
       
    }
    
    //Method for adding players ships to the GameBoard grid
    public void addToGrid(GameBoard g) {
        System.out.println("Player 1: Enter both X and Y co-ordinates for " +
                "starting point and ending point of ship 1 (separated " +
                "with spaces eg. 0 0 0 1 to place ship from 0,0 to 0,1):-> ");
        Scanner p1 = new Scanner(System.in);
        //Todo try and think of easier more efficient way for users to add ships
        //Takes 2 sets of coordinates, one for the starting point of the ship
        //and one for the ending point of the ship
        int sX = Integer.parseInt(p1.next());
        int sY = Integer.parseInt(p1.next());
        int eX = Integer.parseInt(p1.next());
        int eY = Integer.parseInt(p1.next());
        
        /*
        if (sX == 0) {
        	sX = 2;
    	}
    	else if (sX == 2) {
    		sX = 0;
    	}
    	else {
    	
    	}
    	
    	if (sY == 0) {
    		sY = 2;
    	}
    	else if (sY == 2) {
    		sX = 0;
    	}
    	else {
    	
    	}
    	
    	if (eX == 0) {
    		eX = 2;
    	}
    	else if (eX == 2) {
    		eX = 0;
    	}
    	else {
    	
    	}
    	
    	if (eY == 0) {
    		eY = 2;
    	}
    	else if (eY == 2) {
    		eX = 0;
    	}
    	else {
    	
    	}*/
    	
        
        //Instantiation of the ship object
        Ship s1 = new Ship(2, sX, sY, eX, eY);
        
        //Sets ship 1 as 1's on 2d array using coordinates from user input
        g.grid[s1.startX][s1.startY] = 1;
        g.grid[s1.endX][s1.endY] = 1;
        g.drawGrid();
        
        
        //Todo fix coordinates so 0,0 hits the bottom left corner of the grid
        //instead of top left
        System.out.println("Player 1: Enter both X and Y co-ordinates for " +
                "starting point and ending point of ship 2 :-> ");
        sX = Integer.parseInt(p1.next());
        sY = Integer.parseInt(p1.next());
        eX = Integer.parseInt(p1.next());
        eY = Integer.parseInt(p1.next());
        p1.close();
        Ship s2 = new Ship(2, sX, sY, eX, eY);

        //Validates 2nd move
        if (g.grid[s2.startX][s2.startY] != 0 || g.grid[s2.endX][s2.endY] != 0) {
            System.out.println("You already have a ship placed here!");
        }
        else {
        	//Sets ship 2 as 2's on 2d array using coordinates from user input
        	g.grid[s2.startX][s2.startY] = 2;
            g.grid[s2.endX][s2.endY] = 2;
            g.drawGrid();
        }
        
        /*Players take shots at each other
        while(gameOver = false) {
        	System.out.println("Player 1: Enter both X and Y co-ordinates for " +
                "the location of your first shot (separated " +
                "with spaces eg. 0 0 to hit 0,0):-> ");
        	Scanner p1 = new Scanner(System.in);
        	int cX = Integer.parseInt(p1.next);
        	int cY = Integer.parseInt(p1.next);
        
        	if (g.grid[cX][cY] !=0) {
        		System.out.println("You have hit a ship!");
        	}
        	else {
        		System.out.println("You have missed.");
        	}
        }*/
    }
}