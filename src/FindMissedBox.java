import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FindMissedBox extends Frame implements ActionListener {

	Label tot = new Label("Total: ");
	String msg = "Subject-";
	Label[] sub = new Label[5];
	TextField total = new TextField();
	TextField[] subject = new TextField[5];
	Button rem = new Button("Remaining");

	FindMissedBox() {
		this.setLayout(null);
		tot.setBounds(60, 60, 100, 30);
		total.setBounds(180, 60, 100, 30);
		this.add(tot);
		this.add(total);
		for (int i = 0, b = 120; i < 5; ++i, b += 60) {
			sub[i] = new Label(msg + Integer.toString((i + 1)));
			subject[i] = new TextField();
			sub[i].setBounds(60, b, 100, 30);
			subject[i].setBounds(180, b, 100, 30);
			this.add(sub[i]);
			this.add(subject[i]);
			// subject[i].addActionListener(this);
		}
		rem.setBounds(150, 420, 100, 40);
		this.add(rem);
		rem.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		if (ae.getSource() == rem) {
			double totalmarks = Double.parseDouble(total.getText());
			double sum = 0;
			double[] marks = new double[5];
			int index = 6;
			for (int i = 0; i < 5; ++i) {
				//System.out.println("Debug-1: " + i);
				if (subject[i].getText().trim().isEmpty()) {
					//System.out.println("Debug-2: " + i);
					index = i;

				} else if (subject[i].getText().trim() != null) {
					//System.out.println("Debug-3: "+i);
					marks[i] = Double.parseDouble(subject[i].getText());
					sum += marks[i];
				}

			}
			subject[index].setText(Double.toString(totalmarks - sum));
		}
	}

	public static void main(String[] args) {
		FindMissedBox f = new FindMissedBox();
		f.setSize(600, 500);
		f.setVisible(true);
		f.setTitle("Find missed Box");
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}

}
