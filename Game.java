import javax.swing.*;
/**
Class for implementing moves, storing Game at points in along the playing scheme, etc
*/
public class Game {
	private int[][] positions;
	private boolean gameStarted;
	private int whiteScore;
	private int blackScore;
	/**
	Sets up the start of a new game
	*/
	public Game(){
		positions = new int[Board.NUM_POSITIONS][Board.NUM_POSITIONS];
		gameStarted = false;
	}
	
	public boolean startGame(){
		if (gameStarted == false){
			gameStarted = true;
			resetBoard();
			return true;
		}
		return false;
	}
	
	public int positionColor(int r, int c){
		return positions[r][c];
	}
	
	public void move(int from_r,int from_c, int to_r, int to_c,int color){
		Board.removePiece(from_r,from_c);
		positions[from_r][from_c]=0;
		Board.drawPiece(to_r,to_c,color);
		positions[to_r][to_c]=color;
		if (color == Player.BLACK && to_c == Board.NUM_POSITIONS) {
			JOptionPane.showMessageDialog(null,"Black has won the game!");
		}
		if (color == Player.WHITE && to_c == 0) {
			JOptionPane.showMessageDialog(null,"White has won the game!");
		}
	}
	
	public void selectPosition(int r, int c){
	
	}
	
	public void unselectPosition(int r, int c){
	
	}
	
	public boolean validMove(int from_r,int from_c,int to_r, int to_c,int color){
		if (Math.abs(from_r-to_r)>1 || Math.abs(from_c-to_c)>1)
			return false;
		if (color == Player.BLACK){
			if(positions[to_r][to_c] == Player.BLACK){
				return false;
			} else if (positions[to_r][to_c] == Player.WHITE){
				if (to_r == from_r || to_c-from_c<1)
					return false;
				else{
					blackScore++;
					return true;
				}
			} else {
				if (Math.abs(to_r-from_r)<0 || to_c-from_c<1)
					return false;
				else
					return true;
			}
		} else if (color == Player.WHITE){
			if (positions[to_r][to_c] == Player.WHITE){
				return false;
			} else if (positions[to_r][to_c] == Player.BLACK){
				if (to_r == from_r || from_c-to_c<1)
					return false;
				else{
					whiteScore++;
					return true;
				}
			}else {
					if (Math.abs(from_r-to_r)<0 || from_c-to_c<1)
						return false;
					else
						return true;
			}
		}
		return false;
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