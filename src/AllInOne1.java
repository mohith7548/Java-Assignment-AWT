import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AllInOne1 extends Frame implements ActionListener {
	Label in = new Label("input");
	Label out = new Label("output");
	TextField t1 = new TextField();
	TextField t2 = new TextField();
	Button cut = new Button("cut");
	Button copy = new Button("copy");
	/*Button largest = new Button("largerst");
	Button add = new Button("add");
	Button sub = new Button("sub");*/
	
	AllInOne1(){
		this.setLayout(null);
		in.setBounds(60, 30, 50, 30);
		out.setBounds(260, 30, 50, 30);
		t1.setBounds(60 ,60, 160, 40);
		t2.setBounds(260, 60, 180, 40);
		copy.setBounds(120, 120, 60 ,40);
		cut.setBounds(240, 120, 60 ,40);
		this.add(in);
		this.add(out);
		this.add(t1);
		this.add(t2);
		this.add(copy);
		this.add(cut);
		copy.addActionListener(this);
		cut.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		if(copy == ae.getSource()) {
			t2.setText(t1.getText());
		}
		if(cut == ae.getSource()) {
			t2.setText(t1.getText());
			t1.setText("");
		}
		
	}
	public static void main(String[] args) {
		AllInOne1 f = new AllInOne1();
		f.setSize(600, 400);
		f.setVisible(true);
		f.setTitle("All In One");
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}

}
