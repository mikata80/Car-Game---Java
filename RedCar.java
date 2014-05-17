import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;


public class RedCar extends JFrame{
	
	int x,y;
	private Image dbImage;
	private Graphics dbg;
	Image redcar;

	public RedCar(){
		ImageIcon i = new ImageIcon("C:/cargame/red-car.png");
		redcar = i.getImage();
		x=125;
		y=395;
	}
	
	public void drawredcar(Graphics g) {
		g.drawImage(redcar,x,y,this);
	}

}
