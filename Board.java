public class Board extends JPanel{
	public static final NUM_POSITIONS = 8;
	
	public Board(Game game){
		setLayout(new GridLayout(NUM_POSITIONS,NUM_POSITIONS));
		lineWidth = getWidth()/(NUM_POSITIONS-1);
		lineHeight = getHeight()/(NUM_POSTIONS-1);
		
	}
}