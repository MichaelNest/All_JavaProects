
package simpleguibutton;

import java.awt.*;
import javax.swing.*;

public class MyDrowPanel extends JPanel {
    
    @Override
    public void paintComponent(Graphics g){
        //g.setColor(Color.red);
        //g.fillRect(20, 50, 100, 100);
        //Image image = new ImageIcon("cat1.jpg").getImage();
        //g.drawImage(image, 3, 4, this);
        
        Graphics2D g2d = (Graphics2D)g;
        int red = (int)(Math.random()*255);
        int blue = (int)(Math.random()*255);
        int green = (int)(Math.random()*255);
        Color randomColor1 = new Color(red, green, blue);
        g.setColor(randomColor1);
        g.fillRect(0, 0, this.getWidth(), this.getHeight());
        Color startGrad = new Color(red, blue, green);
        red = (int)(Math.random()*255);
        blue = (int)(Math.random()*255);
        green = (int)(Math.random()*255);
        Color randomColor2 = new Color(red, green, blue);
        g.setColor(randomColor2);
        g.fillOval(120, 120, 100, 100);
        Color endGrad = new Color(red, blue, green);
        
        GradientPaint grad2 = new GradientPaint(10, 10, startGrad, 70, 70, endGrad);
        g2d.setPaint(grad2);
        g2d.fillRect(10, 10, 70, 70);
        
        GradientPaint grad = new GradientPaint(50, 50, Color.blue, 100, 100, Color.orange);
        g2d.setPaint(grad);
        g2d.fillOval(50, 50, 100, 100);
    }
    
}
