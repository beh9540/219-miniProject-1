import java.awt.event.*;
import javax.swing.*;

public class Player implements ActionListener{
	public static final int BLACK = 1;
	public static final int WHITE = 2;
	private Game game;
	private int whosTurn;
	private int[]selected;
	
	public Player (Game _game) {
		game = _game;
		whosTurn = WHITE;
	}
	
	public void actionPerformed(ActionEvent ae){
		JButton jb = (JButton)ae.getSource();
		int [] position = game.getPosition(jb);
		if (selected == null && game.positionColor(position[0],position[1])==whosTurn){
			selected = position;
			game.selectPosition(position[0],position[1]);
		} else if(selected == position){
			selected = null;
			game.unselectPosition(position[0],position[1]);
		} else if(selected != null && game.validMove(selected[0],selected[1],position[0],position[1],whosTurn)) {
			game.move(selected[0],selected[1],position[0],position[1],whosTurn);
			if (whosTurn == BLACK)
				whosTurn = WHITE;
			else 
				whosTurn = BLACK;
			selected = null;
		}
	}
}