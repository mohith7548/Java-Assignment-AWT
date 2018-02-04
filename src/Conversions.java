import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Conversions extends Frame implements ActionListener{

	TextField rupees = new TextField();
	TextField dollars = new TextField();
	TextField cm = new TextField();
	TextField feet = new TextField();
	Label r = new Label (" Rupees     =");
	Label d = new Label (" Dollars ");
	Label c = new Label (" cms          =");
	Label f = new Label (" feet");
	Button one = new Button("GO");
	Button two = new Button("GO");
	Button clr = new Button("CLR");

	public Conversions() {
		// TODO Auto-generated constructor stub
		this.setLayout(null);
		rupees.setBounds(60, 60, 100, 30);
		r.setBounds(160, 60, 100, 30);
		dollars.setBounds(300, 60, 100, 30);
		d.setBounds(350, 60, 100, 30);
		cm.setBounds(60, 120, 100, 30);
		c.setBounds(160, 120, 100, 30);
		feet.setBounds(300, 120, 100, 30);
		f.setBounds(350, 120, 100, 30);
		one.setBounds(450, 60, 60, 40);
		two.setBounds(450, 120, 60, 40);
		clr.setBounds(200, 180, 60, 40);
		this.add(r); this.add(rupees);
		this.add(d); this.add(dollars);
		this.add(c); this.add(cm);
		this.add(f); this.add(feet);
		this.add(one); this.add(two); this.add(clr);
		one.addActionListener(this); two.addActionListener(this);
		clr.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		if(one == ae.getSource()) {
			if(dollars.getText().trim().isEmpty()) {
				double ans =(double) 64.14 * Double.parseDouble(rupees.getText());
				System.out.println(ans);
				dollars.setText(Double.toString(ans));
			} else if(rupees.getText().trim().isEmpty()) {
				rupees.setText(Double.toString( 0.0156 * Double.parseDouble(dollars.getText())));
			}
		}
		if(two == ae.getSource()) {
			if(cm.getText().trim().isEmpty()) {
				double ans =(double) 30.48 * Double.parseDouble(feet.getText());
				System.out.println(ans);
				cm.setText(Double.toString(ans));
			} else if(feet.getText().trim().isEmpty()) {
				feet.setText(Double.toString( 0.0328 * Double.parseDouble(cm.getText())));
			}
		}
		if(clr == ae.getSource()) {
			rupees.setText(null);
			dollars.setText(null);
			cm.setText(null);
			feet.setText(null);
		}
	}
	public static void main(String[] args) {
		Conversions f = new Conversions();
		f.setSize(600, 400);
		f.setVisible(true);
		f.setTitle("Conversions");
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}

}
