
package drowpanelbutton;


import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class DrowPanelButton {
    
    JFrame frame;
    JLabel label;
    public static void main(String[] args) {
        DrowPanelButton obj = new DrowPanelButton();
        obj.go();
    }
    
    public void go(){
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JButton colorButton = new JButton("Change Color");
        JButton labelButton = new JButton("Change Label");
        colorButton.addActionListener(new ColorListener());
        labelButton.addActionListener(new LabelListener());
        
        label = new JLabel("I am a Label!!");
        MyPanel myPanel = new MyPanel();
        
        frame.getContentPane().add(BorderLayout.CENTER, myPanel);
        frame.getContentPane().add(BorderLayout.WEST, colorButton);
        frame.getContentPane().add(BorderLayout.EAST, labelButton);
        frame.getContentPane().add(BorderLayout.SOUTH, label);
        frame.setSize(500, 500);
        frame.setVisible(true);
    }
    
    class ColorListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            frame.repaint();
        
    }
    }
    
    class LabelListener implements ActionListener{

            @Override
            public void actionPerformed(ActionEvent e) {
                if(label.getText().equals("I am a Label!!"))
                {label.setText("Yobtel-Moptel!!");}
                else{label.setText("I am a Label!!");
            }
            }
        
    }

   
}
    

