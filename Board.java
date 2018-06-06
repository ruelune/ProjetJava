package view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Board extends JPanel implements ActionListener {

    private final int PosX = 40;
    private final int PosY = 60;
    private final int DELAY = 100;
     private Timer timer;
    private Lorann lorann; 
    
	  public Board() {

	        initBoard();
	    }
	  
	  private void initBoard() {

	        addKeyListener(new TAdapter());
	        setFocusable(true);
	        setBackground(Color.BLACK);
	        setDoubleBuffered(true);

	        lorann = new Lorann(PosX,PosY);

	        timer = new Timer(DELAY, this);
	        timer.start();
	    }

	    public void paintComponent(Graphics g) {
	        super.paintComponent(g);

	        doDrawing(g);

	        Toolkit.getDefaultToolkit().sync();
	    }
	    
	    private void doDrawing(Graphics g) {

	        Graphics2D g2d = (Graphics2D) g;
	        
	        g2d.drawImage(lorann.getImage(), lorann.getPosX(),
	                lorann.getPosY(), this);

	        Missile missile = lorann.getMissile();
	        	if(missile!=null)
	        			g2d.drawImage(missile.getImage(), missile.getPosX(),
	                    missile.getPosY(), this);
	       
	    }
	    public void actionPerformed(ActionEvent e) {

	    	updateMissiles();
	        updateLorann();
	        repaint();
	    }


	    private void updateMissiles() {
	    	
	        Missile missile = lorann.getMissile();

	            if (missile!=null && missile.isVisible()) {

	                missile.move();
	            } else {

	                missile=null;
	            }
	        }
	    
	    private void updateLorann() {

	        lorann.move();
	    }
	    
	    private class TAdapter extends KeyAdapter {

	        public void keyPressed(KeyEvent e) {
	            lorann.keyPressed(e);
	        }

	        public void keyReleased(KeyEvent e) {
	            lorann.keyReleased(e);
	        }
	    }

}

