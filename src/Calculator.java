import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.EmptyStackException;
import java.util.Stack;

public class Calculator extends Frame implements ActionListener {


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Label in = new Label("input");
	Label out = new Label("output");
	TextField input = new TextField();
	TextField output = new TextField();
	Button plus = new Button("+");
	Button minus = new Button("-");
	Button mul = new Button("*");
	Button div = new Button("/");
	Button equals = new Button("=");
	Button clear = new Button("C");
	Button back = new Button("<-");
	Button[] button = new Button[10];
	String msg = "";

	Calculator() {
		setLayout(null);
		//setBackground(Color.DARK_GRAY);
		//setBackground(Color.);
		this.add(input);
		this.add(output);
		int a = 0;
		for (int i = 0, num = 0; i < 10; ++i, ++num) {
			button[i] = new Button(Integer.toString(num));
			this.add(button[i]);
		}
		for (int i = 120; i <= 240; i += 60) {
			for (int j = 60; j <= 180; j += 60) {
				button[a].setBounds(j, i, 40, 40);
				++a;
			}
		}
		in.setBounds(60, 30, 50, 30);
		out.setBounds(260, 30, 50, 30);
		input.setBounds(60, 60, 160, 40);
		output.setBounds(260, 60, 100, 40);
		plus.setBounds(260, 120, 40, 40);
		minus.setBounds(320, 120, 40, 40);
		mul.setBounds(260, 180, 40, 40);
		div.setBounds(320, 180, 40, 40);
		equals.setBounds(260, 240, 40, 40);
		clear.setBounds(320, 240, 40, 40);
		back.setBounds(380, 120, 40, 40);
		this.add(plus);
		this.add(minus);
		this.add(mul);
		this.add(div);
		this.add(equals);
		this.add(clear);
		this.add(back);
		this.add(in);
		this.add(out);
		for (int i = 0; i < 10; ++i) {
			button[i].addActionListener(this);
		}
		plus.addActionListener(this);
		minus.addActionListener(this);
		mul.addActionListener(this);
		div.addActionListener(this);
		clear.addActionListener(this);
		equals.addActionListener(this);
		back.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; ++i) {
			if (button[i] == ae.getSource()) {
				msg += Integer.toString(i);
				input.setText(msg);
			}
		}
		if (plus == ae.getSource()) {
			msg += "+";
			input.setText(msg);
		}
		if (minus == ae.getSource()) {
			msg += "-";
			input.setText(msg);
		}
		if (mul == ae.getSource()) {
			msg += "*";
			input.setText(msg);
		}
		if (div == ae.getSource()) {
			msg += "/";
			input.setText(msg);
		}
		if (clear == ae.getSource()) {
			msg = "";
			input.setText(msg);
			output.setText(msg);
		}
		if (back == ae.getSource()) {
			msg = msg.substring(0, msg.length() - 1);
			input.setText(msg);
		}
		if (equals == ae.getSource()) {
			String compute = input.getText();
			System.out.println(compute);
			double ans = 0.0;
			try {
				ans = evaluate(compute);
				System.out.println("ans: " + ans);
			} catch (Exception e) {
				e.printStackTrace();
			}
			output.setText(Double.toString(ans));
			//input.setText("\n"+Double.toString(ans));
		}

	}

	public static void main(String[] kune) {
		Calculator f = new Calculator();
		f.setSize(600, 400);
		f.setTitle("Calculator");
		f.setVisible(true);
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}

	public static Double evaluate(String input) throws EmptyStackException {
		Stack<Integer> op = new Stack<Integer>();
		Stack<Double> val = new Stack<Double>();
		Stack<Integer> optmp = new Stack<Integer>();
		Stack<Double> valtmp = new Stack<Double>();
		input = "0" + input;
		input = input.replaceAll("-", "+-");
		String temp = "";
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (ch == '-')
				temp = "-" + temp;
			else if (ch != '+' && ch != '*' && ch != '/')
				temp = temp + ch;
			else {
				val.push(Double.parseDouble(temp));
				op.push((int) ch);
				temp = "";
			}
		}
		val.push(Double.parseDouble(temp));
		char operators[] = { '/', '*', '+' };
		for (int i = 0; i < 3; i++) {
			boolean it = false;
			while (!op.isEmpty()) {
				int optr = op.pop();
				double v1 = val.pop();
				double v2 = val.pop();
				if (optr == operators[i]) {
					if (i == 0) {
						valtmp.push(v2 / v1);
						it = true;
						break;
					} else if (i == 1) {
						valtmp.push(v2 * v1);
						it = true;
						break;
					} else if (i == 2) {
						valtmp.push(v2 + v1);
						it = true;
						break;
					}
				} else {
					valtmp.push(v1);
					val.push(v2);
					optmp.push(optr);
				}
			}
			while (!valtmp.isEmpty())
				val.push(valtmp.pop());
			while (!optmp.isEmpty())
				op.push(optmp.pop());
			if (it)
				i--;
		}
		return val.pop();// val.pop();
	}

}
