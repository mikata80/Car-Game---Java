import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

import sun.awt.image.ImageWatched;

import com.sun.org.apache.regexp.internal.REDebugCompiler;





public class MainWindow extends JFrame {
	
	Image backgroung;
	Image carred;
	BlueCar bluecar = new BlueCar();
	BlueCarSec bluecarsec = new BlueCarSec();
	RedCar redcar = new RedCar();
	Backgroung backg = new Backgroung();
	
	
	int x,y;
	private Image dbImage;
	private Graphics dbg;
	
	public class Al extends KeyAdapter{
		public void keyPressed(KeyEvent e) {
			int keyCode = e.getKeyCode();
			//System.out.println(keyCode);
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
			repaint();
		}
	}
	
	public MainWindow(){
		
		//ImageIcon trace = new  ImageIcon("C:/cargame/Trace.png");
		//backgroung = trace.getImage();
		ImageIcon i = new ImageIcon("C:/cargame/red-car.png");
		carred = i.getImage();
		
		addKeyListener(new Al());
		setTitle("CarGame");
		setSize(500,500);
		setResizable(false);
		setVisible(true);
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
		//g.drawImage(backgroung,0,0,this);
		backg.drawBackg(g);
		g.drawImage(carred,x,y,this);
		bluecar.drawBlueCar(g);
		bluecarsec.drawBlueCar(g);
		repaint();
	}
	
	
	public static void main(String[] args) {
		MainWindow mw = new MainWindow();
		
		Thread t1 = new Thread(mw.bluecar);
		t1.start();
		Thread t2 = new Thread(mw.bluecarsec);
		t2.start();
		Thread t0 = new Thread(mw.backg);
		t0.start();
		
		
	}
	
	
		
	
	
	
}
