import java.awt.*;
import javax.swing.*;

public class Piece implements Icon {
	private Color color;
	private int height;
	private int width;
	
	public void setColor(int _color){
		if (_color == Player.BLACK){
			color = Color.BLACK;
		} else {
			color = Color.WHITE;
		}
	}
	
	public int getIconHeight(){
		return (int)(height*0.8);
	}
	
	public int getIconWidth(){
		return (int)(width*0.8);
	}
	
	public void paintIcon(Component c,Graphics g, int x, int y){
		Graphics2D g2 = (Graphics2D) g;
		g2.setColor(color);
		height = c.getHeight();
		width = c.getWidth();
		g2.fillOval(x,y,(int)(width*0.8),(int)(height*0.8));

	}
}