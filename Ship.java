
public class Ship {
	//Declares initial variables for ship object
	public int shipLength;
	public int startX;
	public int startY;
	public int endX;
	public int endY;
	
	//Constructor for ship object
	public Ship(int shipLength, int startX, int startY, int endX, int endY) {
		//Assigns local variables for ship object
		this.shipLength = shipLength;
		this.startX = startX;
		this.startY = startY;
		this.endX = endX;
		this.endY = endY;
	}
}