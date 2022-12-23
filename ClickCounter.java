import java.awt.*;
import java.applet.*;
import java.lang.*;
import java.awt.event.*;

// height=300, width=300 
/*<applet code="ClickCounter.class" height=300 width=300>
</applet>
 */

public class ClickCounter extends Applet 
		implements MouseListener, MouseMotionListener,
			   ActionListener {

	private int x,y;
	private int clickcount;
	private boolean clickcountstart;

	private Label  label;
	private Button button1;
	private Button button2;
	

	public void init () {
		setBackground (Color.cyan);
		addMouseListener (this);
		addMouseMotionListener (this);

		clickcount=0;

		label=new Label("Observer Click Count Here!",Label.CENTER);
		add (label);

		clickcountstart=true;
		button1 = new Button("Counting ON");
		add (button1);

		button1.addActionListener (this);

		button2 = new Button ("Initialize Count");
		add (button2);
		button2.addActionListener (this);
		
	}

	public void paint (Graphics g) {
		showStatus ("Applet Working!");
	}


   
	public void mouseClicked (MouseEvent e) {
		x=e.getX();
		y=e.getY();
		if (clickcountstart) {
			clickcount=clickcount+1;
			if (clickcount==1) label.setText(clickcount+" click"); 
			else label.setText(clickcount+" clicks"); 
		}
	}	

	public void mouseEntered (MouseEvent e){}
	public void mousePressed (MouseEvent e){}
	public void mouseReleased (MouseEvent e){}
	public void mouseExited (MouseEvent e){}
	public void mouseDragged (MouseEvent e){}
	public void mouseMoved (MouseEvent e){}


	public void actionPerformed (ActionEvent e) {

		if (e.getSource() == button1) { 
			String controlsLabel = e.getActionCommand (); 
			if (controlsLabel.equals("OFF")) 	
				{ button1.setLabel ("ON"); clickcountstart=true;}
			else 
				{button1.setLabel ("OFF"); clickcountstart=false;}
		}

		else

		if (e.getSource() == button2) {
			clickcount=0;
			 label.setText(clickcount+" clicks");
		}	

	}
	

}
