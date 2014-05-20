package javagame;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.JFrame;



public class JavaGame extends JFrame {
	
	
	private Image dbImage;
	private Graphics dbg;
	static Line l = new Line(200, 0, 300, 0, 200, 100, 300, 100, 200, 200, 300, 200, 200, 300, 300, 300, 200, 400, 300, 400);
	
	
	public JavaGame() {
		
		setTitle("JavaGame");
		setSize(500, 500);
		setResizable(false);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
	
	
	public void paint (Graphics g) {
		dbImage = createImage(getWidth(), getHeight());
		dbg = dbImage.getGraphics();
		draw(dbg);
		g.drawImage(dbImage, 0, 0, this);
		
	}
	public void draw(Graphics g){
		l.draw(g);
		repaint();
	}
	
	
	public static void main(String[] args) {
		
		 new JavaGame();
		 Thread line = new Thread(l);
		 line.start();
		 

	}

}
