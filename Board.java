import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Board extends JPanel{
	public static final int NUM_POSITIONS = 8;
	private static JButton [][] board;
	private Game game;
	
	public Board(){
		board = new JButton[NUM_POSITIONS][NUM_POSITIONS];
		setLayout(new GridLayout(NUM_POSITIONS,NUM_POSITIONS));
		for (int i = 0; i < NUM_POSITIONS; i++){
			for (int j = 0; j < NUM_POSITIONS; j++) {
				board[i][j] = new JButton();
				board[i][j].addActionListener(player);
				if((j+i)%2 !=0){
					board[i][j].setBackground(Color.RED);
				} else {
					board[i][j].setBackground(Color.ORANGE);
				}
				add(board[i][j]);
			}
		}	
		Game game = new Game();
		Player player = new Player(game);
	}
	/**
	 * Draws a piece on the board
	 * @parameter1 the row on the board
	 * @parameter2 the column on the board
	 * @parameter3 the color of the player
	 */
	static void drawPiece(int r, int c,int color){
		Piece piece = new Piece();
		piece.setColor(color);
		board[r][c].setIcon((Icon)piece);
	}

	/**
	 * Removes a piece from the board
	 */
	static void removePiece(int r,int c){
		board[r][c].setIcon(null);
	}
	
	static int[] getPosition(JButton jb){
		for (int i = 0; i < NUM_POSITIONS; i++){
			for (int j = 0; j < NUM_POSITIONS; j++){
				if(board[i][j].equals(jb)){
					int [] position = {i,j};
					return position;
				}
			}
		}
		return null;
	}
}