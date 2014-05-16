import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;


public class Car extends JFrame implements Runnable{
	
	int x,y;
	private Image dbImage;
	private Graphics dbg;
	Image car;
	
	
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
	
	
	public Car(){
		ImageIcon i = new ImageIcon("D:/Documents/Softuni/Java Basic/CarGame/src/red-car.png");
		car = i.getImage();
		x=125;
		y=395;
	}
	
	public void drawCar(Graphics g) {
		g.drawImage(car,x,y,this);
	}


	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
}
