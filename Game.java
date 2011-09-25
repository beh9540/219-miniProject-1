import javax.swing.*;
/**
Class for implementing moves, storing Game at points in along the playing scheme, etc
*/
public class Game {
	private int[][] positions;
	/**
	Sets up the start of a new game
	*/
	public Game(){
		positions = new int[Board.NUM_POSITIONS][Board.NUM_POSITIONS];
		resetBoard();
	}
	
	public int positionColor(int r, int c){
		return Player.WHITE;
	}
	
	public void move(int from_r,int from_c, int to_r, int to_c,int color){
		Board.removePiece(from_r,from_c);
		Board.drawPiece(to_r,to_c,color);
	}
	
	public void selectPosition(int r, int c){
	
	}
	
	public void unselectPosition(int r, int c){
	
	}
	
	public boolean validMove(int from_r,int from_c,int to_r, int to_c,int color){
		return true;
	}
	
	public int [] getPosition(JButton jb) {
		return Board.getPosition(jb);
	}
	
	private void resetBoard() {
		for (int i=0; i < Board.NUM_POSITIONS; i++) {
			positions[i][0] = Player.BLACK;
			Board.drawPiece(i,0,Player.BLACK);
			positions[i][1] = Player.BLACK;
			Board.drawPiece(i,1,Player.BLACK);
			positions[i][Board.NUM_POSITIONS-1] = Player.WHITE;
			Board.drawPiece(i,Board.NUM_POSITIONS-1,Player.WHITE);
			positions[i][Board.NUM_POSITIONS-2] = Player.WHITE;
			Board.drawPiece(i,Board.NUM_POSITIONS-2,Player.WHITE);
		}
	}
}