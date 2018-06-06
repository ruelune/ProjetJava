package view;


import java.awt.EventQueue;
import javax.swing.JFrame;

public class main extends JFrame{

    public main() {
        
        initUI();
    }
private void initUI() {
        
	    add(new Board());
        setSize(660, 420);
        setResizable(false);
        setTitle("Lorann");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

public static void main(String[] args) {
    
    EventQueue.invokeLater(() -> {
        main ex = new main();
        ex.setVisible(true);
    }
    );
}
}