package view;

import view.Lorann;

public class Missile extends Sprite{
	
	int aa=0;
	private final int Board_width = 660;
	private final int Missile_speed = 32;
    public Missile(int x, int y) {
        super(x, y);
        
        initMissile();
    }
    
    private void initMissile() {
        loadImage("C:\\Users\\IRaptorz\\Downloads\\osu\\sprite\\fireball_1.png");  
        getImageDimensions();
    }
    
    public void move() {
    	
    		if ((Lorann.f == true && Lorann.l == true && aa==0) || aa==1) {
                x += Missile_speed;
                Lorann.f = false;
                aa=1;
    		}
    		else if ((Lorann.f == true && Lorann.r == true && aa== 0) || aa==2) {
    			x -= Missile_speed;
    			 Lorann.f = false;
    			 aa=2;
    		}
    		else if ((Lorann.f == true && Lorann.u == true && aa==0) || aa==3) {
                y += Missile_speed;
                Lorann.f = false;
                aa=3;
    		}
    		else if ((Lorann.f == true && Lorann.d == true && aa== 0) || aa==4) {
    			y -= Missile_speed;
    			 Lorann.f = false;
    			 aa=4;
    		}

    		if (x > Board_width || aa==5) {
            	x -= Missile_speed;
            	aa=5;
            	}
            
    		if(x<0|| aa==6) {
            	x += Missile_speed;
            	 aa=6;
            }
    		if (y < 0|| aa==7) {
            	y += Missile_speed;
            	 aa=7;
            }
    		if (y > 440|| aa==8) {
            	y -= Missile_speed;
            	 aa=8;
            }
    			
    		}
            
            }