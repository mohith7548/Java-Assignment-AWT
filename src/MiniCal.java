import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MiniCal extends Frame implements ActionListener {

	Label l1 = new Label("Number 1: ");
	Label l2 = new Label("Number 2: ");
	Label l3 = new Label("Output:");
	TextField t1 = new TextField();
	TextField t2 = new TextField();
	TextField t3 = new TextField();
	Button add = new Button("Add");
	Button sub = new Button("Sub");
	Button mul = new Button("Mul");
	Button div = new Button("Div");
	Button mod = new Button("Mod");
	Button clr = new Button("CLR");
	MiniCal(){
		this.setLayout(null);
		l1.setBounds(60, 120, 80, 30);
		t1.setBounds(160, 120 ,120, 30);
		l2.setBounds(60, 180, 80, 30);
		t2.setBounds(160, 180 ,120, 30);
		l3.setBounds(60, 240, 80, 30);
		t3.setBounds(160, 240 ,120, 30);
		add.setBounds(60, 320, 60, 40);
		sub.setBounds(140, 320, 60, 40);
		mul.setBounds(220, 320, 60, 40);
		div.setBounds(300, 320, 60, 40);
		mod.setBounds(380, 320, 60, 40);
		clr.setBounds(460, 320, 60, 40);
		this.add(l1);
		this.add(t1);
		this.add(l2);
		this.add(t2);
		this.add(l3);
		this.add(t3);
		this.add(add);
		this.add(sub);
		this.add(mul);
		this.add(div);
		this.add(mod);
		this.add(clr);
		add.addActionListener(this);
		sub.addActionListener(this);
		mul.addActionListener(this);
		div.addActionListener(this);
		mod.addActionListener(this);
		clr.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		if(add == ae.getSource()) {
			t3.setText(Double.toString(Double.parseDouble(t1.getText()) + Double.parseDouble(t2.getText())));
		}
		if(sub == ae.getSource()) {
			t3.setText(Double.toString(Double.parseDouble(t1.getText()) - Double.parseDouble(t2.getText())));
		}
		if(mul == ae.getSource()) {
			t3.setText(Double.toString(Double.parseDouble(t1.getText()) * Double.parseDouble(t2.getText())));
		}
		if(div == ae.getSource()) {
			t3.setText(Double.toString(Double.parseDouble(t1.getText()) / Double.parseDouble(t2.getText())));
		}
		if(mod == ae.getSource()) {
			t3.setText(Double.toString(Double.parseDouble(t1.getText()) % Double.parseDouble(t2.getText())));
		}
		if(clr == ae.getSource()) {
			t1.setText("");
			t2.setText("");
			t3.setText("");
			//t3.setText(Double.toString(Double.parseDouble(t1.getText()) + Double.parseDouble(t2.getText())));
		}
		
	}
	public static void main(String[] args) {
		MiniCal f = new MiniCal();
		f.setSize(600, 600);
		f.setVisible(true);
		f.setTitle("Mini Calci");
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}

}
