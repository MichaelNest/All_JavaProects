
package simpleguibutton;

import javax.swing.*;
import java.awt.event.*;

public class SimpleGuiButton implements ActionListener{
    JButton button;
    String a = "Click me!!";
    String b = "I've been clicked!!!";
    public static void main(String[] args) {
       
        SimpleGuiButton gui = new SimpleGuiButton();
        gui.go();
    }
    
    public void go(){
        JFrame frame = new JFrame();
        button = new JButton(a);
        MyDrowPanel panel = new MyDrowPanel();
        
        button.addActionListener(this);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.getContentPane().add(button);
        frame.setVisible(true);
        frame.setSize(300, 300);
        frame.getContentPane().add(panel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       if(button.getText().equals(a))
               { button.setText(b);}
       else{button.setText(a);}
    }
    
  
    
}
