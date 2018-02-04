import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MouseEventsDemo extends Frame implements MouseListener, MouseMotionListener {

	String msg = "";
	int mouseX = 0;
	int mouseY = 0;

	public MouseEventsDemo() {
		addMouseListener(this);
		addMouseMotionListener(this);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}

	@Override
	public void mouseDragged(MouseEvent me) {
		// TODO Auto-generated method stub
		mouseX = me.getX();
		mouseY = me.getY();
		msg = "*" + " mouse at " + mouseX + " , " + mouseY;
		repaint();
	}

	@Override
	public void mouseMoved(MouseEvent me) {
		// TODO Auto-generated method stub
		msg = "Moving mouse at " + me.getX() + "," + me.getY();
		repaint();
	}

	@Override
	public void mouseClicked(MouseEvent me) {
		// TODO Auto-generated method stub
		msg = msg + "-------click received";
		repaint();
	}

	@Override
	public void mouseEntered(MouseEvent me) {
		// TODO Auto-generated method stub
		mouseX = 100;
		mouseY = 100;
		msg = "Mouse exited.";
		repaint();
	}

	@Override
	public void mouseExited(MouseEvent me) {
		// TODO Auto-generated method stub
		mouseX = 100;
		mouseY = 100;
		msg = "Mouse excited";
		repaint();
	}

	@Override
	public void mousePressed(MouseEvent me) {
		// TODO Auto-generated method stub
		mouseX = me.getX();
		mouseY = me.getY();
		msg = "Button Down";
		repaint();
	}

	@Override
	public void mouseReleased(MouseEvent me) {
		// TODO Auto-generated method stub
		mouseX = me.getX();
		mouseY = me.getY();
		msg = "Button Released";
		repaint();
	}

	public void paint(Graphics g) {
		g.drawString(msg, mouseX, mouseY);
	}

	public static void main(String[] kune) {
		MouseEventsDemo f = new MouseEventsDemo();
		f.setSize(800, 600);
		f.setTitle("Mouse Events Demo");
		f.setVisible(true);
	}

}
