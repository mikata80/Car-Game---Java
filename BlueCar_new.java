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
	int xa,xaDirection,ya ,yaDirection;
	Image bluecar;
	
	
	public void move(){
		if(ya>500){
			ya =0;
			xa =225;
		} else if(ya==0){
			xa = 125;}
		ya +=1+yaDirection;
	}
	
	public void setXDir(int xadir){
		xaDirection = xadir;
	}
	public void setYDir(int yadir){
		yaDirection = yadir;
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
		g.drawImage(bluecar,xa,ya,this);
	}


	

}
