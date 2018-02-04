import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class CompleteCalculator extends Frame implements ActionListener {
	
	Label in = new Label("input");
	Label out = new Label("output");
	TextField input = new TextField();
	TextField output = new TextField();
	Button sin = new Button("Apply sine");
	Button cos = new Button("Apply cosine");
	Button tan = new Button("Apply tan");
	//Button trigMode = new Button("Trig. Mode");
	//Button baseMode = new Button("Base Mode");
	Button toBinary = new Button("To Binary");
	Button toHex = new Button("To Hex");
	Button toOctal = new Button("to Octal");
	CompleteCalculator() {
		// TODO Auto-generated constructor stub
		this.setLayout(null);
		in.setBounds(60, 30, 50, 30);
		out.setBounds(260, 30, 50, 30);
		input.setBounds(60, 60, 160, 40);
		output.setBounds(260, 60, 180, 40);
		sin.setBounds(60, 120, 120, 40);
		cos.setBounds(200, 120, 120, 40);
		tan.setBounds(340, 120, 120, 40);
		toBinary.setBounds(60, 180, 120, 40);
		toHex.setBounds(200, 180, 120, 40);
		toOctal.setBounds(340, 180, 120, 40);
		this.add(in);
		this.add(input);
		this.add(sin);
		this.add(cos);
		this.add(tan);
		this.add(toBinary);
		this.add(toHex);
		this.add(toOctal);
		this.add(out);
		this.add(output);
		sin.addActionListener(this);
		cos.addActionListener(this);
		tan.addActionListener(this);
		toBinary.addActionListener(this);
		toHex.addActionListener(this);
		toOctal.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		if(sin == ae.getSource()) {
			Double inputnum = Double.parseDouble(input.getText());
			output.setText(Double.toString(Math.sin(Math.toRadians(inputnum))));
		}
		if(cos == ae.getSource()) {
			Double inputnum = Double.parseDouble(input.getText());
			output.setText(Double.toString(Math.cos(Math.toRadians(inputnum))));
		}
		if(tan == ae.getSource()) {
			Double inputnum = Double.parseDouble(input.getText());
			output.setText(Double.toString(Math.tan(Math.toRadians(inputnum))));
		}
		if(toBinary == ae.getSource()) {
			String number = input.getText();
			output.setText(Integer.toString(Integer.parseInt(number, 10), 2));
		}
		if(toHex == ae.getSource()) {
			String number = input.getText();
			output.setText(Integer.toString(Integer.parseInt(number, 10), 16));
		}
		if(toOctal == ae.getSource()) {
			String number = input.getText();
			output.setText(Integer.toString(Integer.parseInt(number, 10), 8));
		}
	}
	public static void main(String[] args) {
		CompleteCalculator c = new CompleteCalculator();
		c.setSize(600, 400);
		c.setVisible(true);
		c.setTitle("Trignometric Calculator");
		c.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
}
