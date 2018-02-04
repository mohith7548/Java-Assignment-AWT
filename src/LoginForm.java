import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

public class LoginForm extends Frame implements ActionListener{

	public static ArrayList<String> username = new ArrayList<String> ();
	public static ArrayList<String> password = new ArrayList<String> ();
	Label usn = new Label("Enter Username: ");
	TextField tusn = new TextField();
	Label psswd = new Label("Enter Password: ");
	TextField tpsswd = new TextField();
	Button go = new Button("GO");
	String msg = "";
	Label result = new Label(msg);
	TextArea ta = new TextArea("Mohith Loves Mayura", 10, 10, 1);
	LoginForm(){
		this.setLayout(null);
		usn.setBounds(60, 60, 120, 30);
		tusn.setBounds(200, 60, 120, 30);
		psswd.setBounds(60, 120, 120, 30);
		tpsswd.setBounds(200, 120, 120, 30);
		go.setBounds(150, 180, 60, 30);
		result.setBounds(150, 240, 200, 30);
		ta.setBounds(60, 300, 400, 300 );
		this.add(usn); this.add(tusn);
		this.add(psswd); this.add(tpsswd);
		this.add(go); this.add(result); this.add(ta);
		tusn.addActionListener(this); tpsswd.addActionListener(this);
		go.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		if(go == ae.getSource()) {
			if(username.indexOf(tusn.getText().trim()) == -1) {
				System.out.println("User doesn't Exist!!");
				msg = "User doesn't Exist!!";
				result.setText(msg);
				return;
			} else if(username.indexOf(tusn.getText().trim()) != -1) {
				if(password.indexOf(tpsswd.getText().trim()) == -1) {
					System.out.println("Invalid Password!!");
					msg = "Invalid Password!!";
					result.setText(msg);
				} else if( password.indexOf(tpsswd.getText().trim()) != -1) {
					System.out.println("Logged in Successfully!!");
					msg = "Logged in Successfully!!";
					result.setText(msg);
				}
			}
		}
	}
	public static void main(String[] args) {
		LoginForm f = new LoginForm();
		f.setSize(800, 800);
		f.setVisible(true);
		f.setTitle("Login Form");
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		username.add("Mohith"); password.add("411641");
		username.add("Vaditya"); password.add("411678");
		username.add("Pilli"); password.add("111609");
		username.add("RaghuRam"); password.add("411632");
		username.add("ChakraPani"); password.add("411653");
	}

}
