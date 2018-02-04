import java.awt.Choice;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class BillCalculator extends Frame implements ActionListener, ItemListener {

	Label[] description = { new Label("SNO"), new Label("ITEM"), new Label("QUANTITY"), new Label("PRICE") };
	Label[] slno = { new Label("1"), new Label("2") };
	// Checkbox windows, linux, macOs;
	// CheckboxGroup cbg = new CheckboxGroup();
	Choice company, os;
	TextField[] quantity = { new TextField(), new TextField() };
	TextField[] price = { new TextField(), new TextField() };
	double[] company_price = { 45000, 43000, 50000, 49000 };
	double[] os_price = { 5000, 200, 400, 350, 600 };
	Label total = new Label("Tatal");
	TextField tot = new TextField("");

	BillCalculator() {
		this.setLayout(null);
		for (int i = 0, a = 60; i < 4; ++i, a += 100) {
			description[i].setBounds(a, 30, 100, 40);
			this.add(description[i]);
		}
		for (int i = 0, a = 80; i < 2; ++i, a += 40) {
			quantity[i].setBounds(260, a, 60, 30);
			price[i].setBounds(360, a, 100, 30);
			price[i].setEditable(false);
			this.add(quantity[i]); this.add(price[i]);
		}
		/*
		 * windows = new Checkbox("Windows",cbg, true); linux = new Checkbox("Linux",
		 * cbg, false); macOs = new Checkbox("MacOs", cbg, false);
		 */
		os = new Choice();
		company = new Choice();
		company.add("Acer");
		company.add("Dell");
		company.add("HP");
		company.add("Lenovo");
		os.add("Windows");
		os.add("Ubuntu");
		os.add("Kali Linux");
		os.add("Linux Mint");
		os.add("Fedora");
		slno[0].setBounds(60, 80, 60, 30);
		slno[1].setBounds(60, 120, 60, 30);
		company.setBounds(140, 80, 100, 30);
		os.setBounds(140, 120, 100, 30);
		total.setBounds(260, 200, 60, 30);
		tot.setBounds(360, 200, 100, 30);
		total.setVisible(false);
		tot.setVisible(false);
		this.add(slno[0]);
		this.add(slno[1]);
		this.add(company);
		this.add(os);
		this.add(tot);
		this.add(total);
		for (int i = 0; i < 2; ++i) {
			quantity[i].addActionListener(this);
		}
	}

	@Override
	public void itemStateChanged(ItemEvent ie) {
		// TODO Auto-generated method stub

	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		if (quantity[0] == ae.getSource()) {
			double rate = company_price[company.getSelectedIndex()];
			rate *= Integer.parseInt(quantity[0].getText());
			price[0].setText(Double.toString(rate));
		}
		if(quantity[1] == ae.getSource()) {
			double rate = os_price[os.getSelectedIndex()];			
			rate *= Integer.parseInt(quantity[1].getText());
			price[1].setText(Double.toString(rate));
			
			total.setVisible(true);
			tot.setVisible(true);
			tot.setText(Double.toString(Double.parseDouble(price[0].getText()) +  
											Double.parseDouble(price[1].getText())));
		}
	}

	public static void main(String[] args) {
		BillCalculator f = new BillCalculator();
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
