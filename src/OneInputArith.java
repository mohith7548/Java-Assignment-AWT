import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class OneInputArith extends Frame implements ActionListener{

	Label l = new Label("Enter a Number: ");
	TextField t = new TextField();
	Button add5 = new Button("Add 5");
	Button sub5 = new Button("Sub 5");
	Button add10 = new Button("Add 10");
	Button sub10 = new Button("Sub 10");
	OneInputArith() {
		// TODO Auto-generated constructor stub
		this.setLayout(null);
		l.setBounds(100, 100, 120, 30);
		t.setBounds(240, 100, 100, 30);
		add5.setBounds(160, 160, 60, 40);
		sub5.setBounds(260, 160, 60, 40);
		add10.setBounds(160, 200, 60, 40);
		sub10.setBounds(260, 200, 60, 40);
		this.add(l);
		this.add(t);
		this.add(add5);
		this.add(sub5);
		this.add(add10);
		this.add(sub10);
		add5.addActionListener(this);
		sub5.addActionListener(this);
		add10.addActionListener(this);
		sub10.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		if(add5 == ae.getSource()) {
			t.setText(Double.toString(5 + Double.parseDouble(t.getText())));
		}
		if(sub5 == ae.getSource()) {
			t.setText(Double.toString(Double.parseDouble(t.getText()) - 5));
		}
		if(add10 == ae.getSource()) {
			t.setText(Double.toString(10 + Double.parseDouble(t.getText())));
		}
		if(sub10 == ae.getSource()) {
			t.setText(Double.toString(Double.parseDouble(t.getText()) - 10));
		}
	}
	public static void main(String[] args) {
		OneInputArith f = new OneInputArith();
		f.setSize(600, 400);
		f.setVisible(true);
		f.setTitle("One Input Arithmatic Operations");
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}

}
