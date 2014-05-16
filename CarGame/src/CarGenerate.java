import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;


import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class CarGenerate extends JFrame {

	int x,y;
	private Image dbImage;
	private Graphics dbg;
	Image car;
	Image background;
	
	public class Al extends KeyAdapter{
		public void keyPressed(KeyEvent e) {
			int keyCode = e.getKeyCode();
			
			if (keyCode == e.VK_LEFT) {
				if (x<=125) 
					x=125;
				else 
					x-=100;		
			}
			if (keyCode == e.VK_RIGHT) {
				if(x>=325)
					x=325;
				else
					x+=100;		
			}
		}
	}

	public CarGenerate() {
		//background
		ImageIcon trace = new ImageIcon("D:/Documents/Softuni/Java Basic/CarGame/src/Trace.png");
		background = trace.getImage();
		//load car image
		ImageIcon i = new ImageIcon("D:/Documents/Softuni/Java Basic/CarGame/src/red-car.png");
		car = i.getImage();
		//game properties
		addKeyListener(new Al());
		setTitle("Car Game");
		setSize(500,500);
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);
		setBackground(Color.BLUE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		x=125;
		y=395;
	}
	public void paint(Graphics g) {
		dbImage =createImage(getWidth(),getHeight());
		dbg = dbImage.getGraphics();
		paintComponent(dbg);
		g.drawImage(dbImage, 0, 0, this );
	}
	
	public void paintComponent(Graphics g) {
		g.drawImage(background,0,0,this);
		g.drawImage(car,x,y,this);
		repaint();
	}

	public static void main(String[] args) {
		new CarGenerate();

	}

}
