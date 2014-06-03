import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;


public class BlueCarSec extends JFrame implements Runnable{
	
	/**
	 * mikata
	 */
	private static final long serialVersionUID = 1L;
	int x,xDirection,y ,yDirection;
	Image bluecarsec;
	
	
	public void move(){
		if(y>600){
			y =0;
			if (x>325)
				x=120;
			else 
				x += 120;
		}else if(y==0){
			x = 225;}
		y +=1+yDirection;
		
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
	
	public BlueCarSec(){
		ImageIcon i = new ImageIcon("C:/cargame/blue-car.png");
		bluecarsec = i.getImage();
		//x=245;
		//y = 395;
		
	}
	
	public void drawBlueCar(Graphics g) {
		g.drawImage(bluecarsec,x,y,this);
	}

}
