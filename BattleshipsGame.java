
public class BattleshipsGame {
    public static void main(String[] args) {
        //Todo add questions to ask in comments
        System.out.println("***** BATTLESHIPS! *****");

        GameBoard g = new GameBoard(3);
        g.initialiseGrid();
        Player p = new Player();
        p.addToGrid(g);
    }
}