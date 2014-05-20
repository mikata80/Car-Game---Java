package javagame;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.Random;

public class Line implements Runnable {

	int x1, y1, x2, y2, x3, y3, x4, y4, x5, y5, x6, y6, x7, y7, x8, y8, x9, y9, x10, y10;
	Rectangle line1, line2, line3, line4, line5, line6, line7, line8, line9, line10;
	public Line(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4, int x5, int y5, int x6, int y6, int x7, int y7, int x8, int y8, int x9, int y9, int x10, int y10  ) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
		this.x3 = x3;
		this.y3 = y3;
		this.x4 = x4;
		this.y4 = y4;
		this.x5 = x5;
		this.y5 = y5;
		this.x6 = x6;
		this.y6 = y6;
		this.x7 = x7;
		this.y7 = y7;
		this.x8 = x8;
		this.y8 = y8;
		this.x9 = x9;
		this.y9 = y9;
		this.x10 = x10;
		this.y10 = y10;
		
		//create lines
		line1 = new Rectangle(this.x1, this.y1, 8, 50);
		line2 = new Rectangle(this.x2, this.y2, 8, 50);
		line3 = new Rectangle(this.x3, this.y3, 8, 50);
		line4 = new Rectangle(this.x4, this.y4, 8, 50);
		line5 = new Rectangle(this.x5, this.y5, 8, 50);
		line6 = new Rectangle(this.x6, this.y6, 8, 50);
		line7 = new Rectangle(this.x7, this.y7, 8, 50);
		line8 = new Rectangle(this.x8, this.y8, 8, 50);
		line9 = new Rectangle(this.x9, this.y9, 8, 50);
		line10 = new Rectangle(this.x10, this.y10, 8, 50);
	}
	
	public void draw(Graphics g){
		g.setColor(Color.black);
		g.fillRect(line1.x, line1.y, line1.width, line1.height);
		g.fillRect(line2.x, line2.y, line2.width, line2.height);
		g.fillRect(line3.x, line3.y, line3.width, line3.height);
		g.fillRect(line4.x, line4.y, line4.width, line4.height);
		g.fillRect(line5.x, line5.y, line5.width, line5.height);
		g.fillRect(line6.x, line6.y, line6.width, line6.height);
		g.fillRect(line7.x, line7.y, line7.width, line7.height);
		g.fillRect(line8.x, line8.y, line8.width, line8.height);
		g.fillRect(line9.x, line9.y, line9.width, line9.height);
		g.fillRect(line10.x, line10.y, line10.width, line10.height);
	}
	
	public void move(){
		line1.y++;
		line2.y++;
		line3.y++;
		line4.y++;
		line5.y++;
		line6.y++;
		line7.y++;
		line8.y++;
		line9.y++;
		line10.y++;
		if (line9.y == 500 && line10.y == 500) {
			line9.y = 0;
			line10.y = 0;
		}
		if (line7.y == 500 && line8.y == 500){
			line7.y = 0;
			line8.y = 0;
		}
		if (line5.y == 500 && line6.y == 500){
			line5.y = 0;
			line6.y = 0;
		}
		if (line3.y == 500 && line4.y == 500){
			line3.y = 0;
			line4.y = 0;
		}
		if (line1.y == 500 && line2.y == 500){
			line1.y = 0;
			line2.y = 0;
		}
	}
	
	@Override
	public void run() {
		try{
			while(true){
				move();
				Thread.sleep(5);
			}
		}catch(Exception e){System.err.println(e.getMessage());}
	}
}
