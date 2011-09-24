/**
Class for implementing moves, storing Game at points in along the playing scheme, etc
*/
public class Game {
	private Piece[][] board;
	/**
	Sets up the start of a new game
	*/
	public Game(){
		board = new Piece[Board.NUM_POSITIONS-1][Board.NUM_POSITIONS-1];
		for (int i=0; i < Board.NUM_POSITIONS; i++) {
			board[i,0] = new Piece(Player.BLACK,i,0);
			board[i,1] = new Piece(Player.BLACK,i,1);
			board[i,Board.NUM_POSITIONS-1] = new Piece(Player.WHITE,i,Board.NUM_POSITIONS-1);
			board[i,Board.NUM_POSITIONS-2] = new Piece(Player.WHITE,i,Board.NUM_POSITIONS-2)
		}
	}
	/**
	 * Checks to see if a player can move to a spot
	 * @parameter1 the piece to be moved
	 * @parameter2 row on the board of the move
	 * @parameter3 col on the board of the move
	 */
	public boolean canMove(Piece player,int r, int c, int color){
		
	}
}