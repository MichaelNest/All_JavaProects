
package simpleanimation;

import java.awt.*;
import javax.swing.*;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class SimpleAnimation {

    int x = 10;
    int y = 10;
    MyDrowPanel myPanel;
    
    public static void main(String[] args) {
        SimpleAnimation simp = new SimpleAnimation();
        simp.go();
        
    }
    
    public void go(){
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
       myPanel = new MyDrowPanel();
        
        frame.getContentPane().add(myPanel);
        frame.setSize(300, 300);
        frame.setVisible(true);
       
        for(int i=0; i<200; i++){
            x++;
            y++;
        
        frame.repaint();
        
        try{
            Thread.sleep(50);
        }catch(Exception ex){}
        }
    }
    
    class MyDrowPanel extends JPanel{
        public void paintComponent(Graphics g){
            g.setColor( Color.black);
            g.fillRect(0, 0, this.getWidth(), this.getHeight());
            g.setColor(Color.green);
            g.fillOval(x, y, 40, 40);
        }
    }
    
}
