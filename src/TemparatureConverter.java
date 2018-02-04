import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TemparatureConverter extends Frame implements ActionListener {

	Label celtext = new Label("Enter");
	TextField inputtext = new TextField();
	TextField outputtext = new TextField();
	Button toCelcius = new Button("To Celcius");
	Button toFarenheit = new Button("To Farenheit");

	public TemparatureConverter() {
		// setLayout(new FlowLayout());
		setLayout(null);
		celtext.setBounds(90, 50, 30, 20);
		inputtext.setBounds(100, 100, 80, 30);
		outputtext.setBounds(400, 100, 80, 30);
		toCelcius.setBounds(150, 150, 80, 30);
		toFarenheit.setBounds(350, 150, 80, 30);
		// toCelcius.setBounds(200, 250, 80, 30);
		this.add(celtext);
		this.add(inputtext);
		this.add(toCelcius);
		this.add(toFarenheit);
		this.add(outputtext);
		// text.addActionListener(this);
		toFarenheit.addActionListener(this);
		toCelcius.addActionListener(this);
		this.setSize(600, 400);
		this.setVisible(true);
		this.setTitle("Temparature Converter");
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		double input = Integer.parseInt(inputtext.getText());
		double output = 0;
		if (toCelcius == e.getSource()) {
			output = ((input - 32) * 5) / 9.000;
			outputtext.setText(Double.toString(output));
		}
		if (toFarenheit == e.getSource()) {
			output = ((9 * input) / 5.000) + 32;
			outputtext.setText(Double.toString(output));
		}
	}

	public static void main(String[] kune) {
		TemparatureConverter f = new TemparatureConverter();
	}

}
