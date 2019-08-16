
package minimusicplayer2;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.sound.midi.ControllerEventListener;
import javax.sound.midi.MidiEvent;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.Sequence;
import javax.sound.midi.Sequencer;
import javax.sound.midi.ShortMessage;
import javax.sound.midi.Track;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class MiniMusicPlayer2 {
    static JFrame frame = new JFrame("My first Clip!!");
    static DrowPanel pn;

    
    public static void main(String[] args) {
       MiniMusicPlayer2 mini = new MiniMusicPlayer2();
       mini.go();
    }
    
    public void setUpGui(){
        pn = new DrowPanel();
        frame.setContentPane(pn);
        frame.setVisible(true);
        frame.setBounds(30, 30, 300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public void go(){
        setUpGui();
        
        try{
            Sequencer sequenser = MidiSystem.getSequencer();
            sequenser.open();
            sequenser.addControllerEventListener(pn, new int[] {127});
            Sequence seq = new Sequence(Sequence.PPQ, 4);
            Track track = seq.createTrack();
            
            int r = 0;
            for(int i = 0; i<60; i+=4){
                r = (int)((Math.random()*50)+1);
                track.add(makeEvent(144, 1, r, 100, i));
                track.add(makeEvent(176, 1, 127, 0, i));
                track.add(makeEvent(128, 1, r, 100, i+2));
            }
            sequenser.setSequence(seq);
            sequenser.start();
            sequenser.setTempoInBPM(120);
            
        }catch(Exception ex){ex.printStackTrace();}
    }
    
    public MidiEvent makeEvent(int comb, int chan, int one, int two, int tik){
        MidiEvent event = null;
        try{
            ShortMessage a = new ShortMessage();
            a.setMessage(comb, chan, one, two);
            event = new MidiEvent(a, tik);
            
        }catch(Exception ex){ex.printStackTrace();}
        return event;
    }
    
    class DrowPanel extends JPanel implements ControllerEventListener{
        boolean msg = false;

        @Override
        public void controlChange(ShortMessage event) {
           msg = true;
           repaint();
        }
        
        public void paintComponent(Graphics g){
            if(msg){
                Graphics2D g2 = (Graphics2D)g;
                
                int r = (int)(Math.random()*250);
                int gb = (int)(Math.random()*250);
                int b = (int)(Math.random()*250);
                
                g.setColor(new Color(r, gb, b));
                
                int ht = (int)((Math.random()*120)+10);
                int wt = (int)((Math.random()*120)+10);
                
                int x = (int)((Math.random()*40)+10);
                int y = (int)((Math.random()*40)+10);
                
                g.fillRect(x, y, wt, ht);
                //g.fillOval(x, y, wt, wt);
                msg = false;
            }
            
        }
        
    }
    
}
