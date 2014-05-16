import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;


public class BlueCar extends JFrame implements Runnable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int x,xDirection,y ,yDirection;
	Image bluecar;
	
	
	public void move(){
		if(y>600){
			y =0;
			x += 100 +xDirection;
		}
		if(y==0){
			x = 125;}
		y +=1+yDirection;
		
		
		
		//System.out.println("x = "+ x);
		if (y > 300) {
			System.out.println("x = "+ x);
			System.out.println("y = "+ y);	
		}
		
		
			
	}
	
	public void setXDir(int xdir){
		xDirection = xdir;
	}
	public void setYDir(int ydir){
		yDirection = ydir;
	}
	
	public void run(){
		try{
			while(true){
				move();
				Thread.sleep(5);
			}
		}catch(Exception e){
			System.out.println("ERORR " +e);
		}
	}
	
	public BlueCar(){
		ImageIcon i = new ImageIcon("C:/cargame/blue-car.png");
		bluecar = i.getImage();
		//x=245;
		//y = 395;
		
	}
	
	public void drawBlueCar(Graphics g) {
		g.drawImage(bluecar,x,y,this);
	}


	

}
