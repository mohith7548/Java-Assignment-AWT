import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class WhoIsElder extends Frame implements ActionListener {

	public static DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
	String msg = "";
	Label one = new Label("Enter 1st Person's DOB: ");
	TextField oneText = new TextField();
	Label two = new Label("Enter 2nd Person's DOB: ");
	TextField twoText = new TextField();
	Button go = new Button("Go");
	Label output = new Label(msg);

	WhoIsElder() {
		this.setLayout(null);
		one.setBounds(60, 60, 150, 30);
		oneText.setBounds(220, 60, 150, 30);
		two.setBounds(60, 120, 150, 30);
		twoText.setBounds(220, 120, 150, 30);
		go.setBounds(200, 180, 60, 40);
		output.setBounds(150, 250, 250, 30);

		this.add(one);
		this.add(oneText);
		this.add(two);
		this.add(twoText);
		this.add(go);
		this.add(output);
		go.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		Date dateone = new Date();
		Date datetwo = new Date();
		if (go == ae.getSource()) {
			try {
				dateone = formatter.parse(oneText.getText());
				datetwo = formatter.parse(twoText.getText());
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if (dateone.before(datetwo)) {
				msg = "Person-1 is Elder than Person-2!";
				output.setText(msg);
			} else if (dateone.after(datetwo)) {
				msg = "Person-2 is Elder than Person-1!";
				output.setText(msg);
			} else if (dateone.equals(datetwo)) {
				msg = "Person-1 & Person-2 are of Same Age!!";
				output.setText(msg);

			}
		}

	}

	public static void main(String[] kune) {
		WhoIsElder f = new WhoIsElder();
		f.setSize(600, 400);
		f.setTitle("Find who is Elder");
		f.setVisible(true);
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
}
