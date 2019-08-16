
package drowpanelbutton;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;


public class MyPanel extends JPanel{
    public void paintComponent(Graphics g){
        g.fillRect(0, 0, this.getWidth(), this.getHeight());
        int red = (int)(Math.random()*255);
        int blue = (int)(Math.random()*255);
        int green = (int)(Math.random()*255);
        Color randomColor = new Color(red, blue, green);
        Color startColor = new Color(red, blue, green);
        g.setColor(randomColor);
        g.fillOval(50, 50, 80, 80);
        
        red = (int)(Math.random()*255);
        blue = (int)(Math.random()*255);
        green = (int)(Math.random()*255);
        Color finishColor = new Color(red, blue, green);
        
        Graphics2D g2d = (Graphics2D)g;
        GradientPaint grad = new GradientPaint(120, 120, startColor, 250, 250, finishColor);
        g2d.setPaint(grad);   
        g2d.fillOval(120, 120, 100, 100);
    
    }
}
