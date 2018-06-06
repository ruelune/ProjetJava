package view;

import java.awt.event.KeyEvent;

public class Lorann extends Sprite {
	static boolean f;
	static boolean l;
	static boolean r;
	static boolean u;
	static boolean d;
	private int dx;
	private int dy;
	private Missile missile;
	
    public Lorann(int x, int y) {
    	
        super(x, y);
        
        initLorann();
    }
    
	public void initLorann () {
		

		
		loadImage("C:\\Users\\IRaptorz\\Downloads\\osu\\sprite\\lorann_ur.png");
		getImageDimensions();
	
	}
	
    public void move() {
    	
        x += dx;
        y += dy;

    }
    
    public Missile getMissile() {
    	return missile;
    }
	
	public void keyPressed(KeyEvent e) {

        int key = e.getKeyCode();
        
        if (key == KeyEvent.VK_ESCAPE) {
        	System.exit(1);
        }
        if (key == KeyEvent.VK_SPACE) {
        	
        	if (missile==null || missile.visible==false) {
        	f=true;
            fire();
            }
            
        }

        if (key == KeyEvent.VK_LEFT) {
        	loadImage("C:\\Users\\IRaptorz\\Downloads\\osu\\sprite\\lorann_l.png");
            if (x>20) {
            	dx -= 32;}
            l=true;
            r=false;
            d=false;
            u=false;
            
        }

        if (key == KeyEvent.VK_RIGHT) {
        	loadImage("C:\\Users\\IRaptorz\\Downloads\\osu\\sprite\\lorann_r.png");
            if (x < 600) {
            	dx += 32;
            }
            r=true;
            l=false;
            d=false;
            u=false;
                    
        }

        if (key == KeyEvent.VK_UP) {
        	loadImage("C:\\Users\\IRaptorz\\Downloads\\osu\\sprite\\lorann_u.png");
            if (y > 0) {
            	dy -= 32;}       
            u=true;
            l=false;
            r=false;
            d=false;
        }

        if (key == KeyEvent.VK_DOWN) {
        	loadImage("C:\\Users\\IRaptorz\\Downloads\\osu\\sprite\\lorann_b.png");
            if (y < 330) {
            	dy += 32;}
            u=false;
            d=true;
            l=false;
            r=false;

        }
        
    }

	
    public void fire() {
    	if (l==true) 
        missile = new Missile(x + width + 32, y + height - 32);
        if(r==true) 
        missile = new Missile(x - width, y + height - 32);
        if(u==true)
        missile = new Missile(x , y + height);
        if(d==true)
         missile = new Missile(x , y - height);
    }

    
	 public void keyReleased(KeyEvent e) {

	        int key = e.getKeyCode();

	        if (key == KeyEvent.VK_LEFT) {
	            dx = 0;
	        }

	        if (key == KeyEvent.VK_RIGHT) {
	            dx = 0;
	        }

	        if (key == KeyEvent.VK_UP) {
	            dy = 0;
	        }

	        if (key == KeyEvent.VK_DOWN) {
	            dy = 0;
	        }
	    }
}
