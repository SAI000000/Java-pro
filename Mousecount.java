import java.awt.Color;
import java.applet.Applet;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.awt.FlowLayout;
import java.awt.Label;
/*<applet code="Mousecount.class" width=500 height=500>
 </applet>
*/
public class Mousecount extends Applet implements MouseListener{
    Label l;
        public void init(){
         Label   l=new Label ("Mouse Listener Demo");
            add(l);
            setSize(500,500);
            setVisible(true);
            addMouseListener(this);
            l.setBounds(50,150,200,100);
            setLayout(null);
            add(l);
        
        }
        public void mouseEntered(MouseEvent e){
            int a;
            l.setText("Number of Click count=" + a.getClickCount()+"at position"+e.getX()+","+e.getY());
            showStatus("MouseEntered");
        }
        public void mouseClicked(MouseEvent e1){
           int b;
            l.setText("Number of Click count="+b.getClickCount()+"at position"+e1.getX()+","+e1.getY());
            showStatus("MouseClicked");
        }
        public void mousePressed(MouseEvent e2){
         //  int a=e2.getClickCount();
            l.setText("Number of Click count=");
            showStatus("MousePressed");
        }
        public void mouseReleased(MouseEvent e3){
           int c;
            l.setText("Number of Click count="+c.getClickCount());
            showStatus("MouseReleased");
        }
        public void mouseExited(MouseEvent e4){
            
            showStatus("MouseExited");
        }
    }