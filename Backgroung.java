import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;


public class Backgroung extends JFrame implements Runnable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int x,xDirection,y ,yDirection;
	Image backg;
	
	
	public void move(){
		if(y>5){
			y = -5;
		}
		y +=1-yDirection;
		
	}
	
	public void setYDir(int ydir){
		yDirection = ydir;
	}
	
	public void run(){
		try{
			while(true){
				move();
				
				Thread.sleep(10);
			}
		}catch(Exception e){
			System.out.println("ERORR " +e);
		}
	}
	
	public Backgroung(){
		ImageIcon i = new ImageIcon("C:/cargame/trace.png");
		backg = i.getImage();
		x=0;
		}
	
	public void drawBackg(Graphics g) {
		g.drawImage(backg,x,y,this);
	}

}
