public class Board extends JPanel{
	public static final NUM_POSITIONS = 8;
	
	public Board(Game game){
		setLayout(new GridLayout(NUM_POSITIONS,NUM_POSITIONS));
		lineWidth = getWidth()/(NUM_POSITIONS-1);
		lineHeight = getHeight()/(NUM_POSTIONS-1);
		
	}
	/**
	 * Draws a piece on the board
	 * @parameter1 the row on the board
	 * @parameter2 the column on the board
	 * @parameter3 the color of the player
	 */
	public void drawPlayer(int r, int c,int color){
		
		
	}
	
	/**
	 * Removes a piece from the board
	 */
	public void removePlayer(int r, int c){
		
	}
}