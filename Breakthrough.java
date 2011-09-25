import javax.swing.*;
import java.awt.event.*;

public class Breakthrough extends JFrame{

	public Breakthrough() {
		super("Breakthrough");
		setSize(300,300);
		Board board = new Board();
		add(board);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);	
	}
	
	public static void main(String [] args){
		new Breakthrough();
	}	
}