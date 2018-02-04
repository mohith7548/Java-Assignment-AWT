import java.awt.*;
import java.awt.event.*;
import java.util.Stack;
class ArithmeticOperations extends Frame implements ActionListener
{
	Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17;
	TextField t1;
	Label l1;
	ArithmeticOperations()
	{
		b0=new Button("0");
		b1=new Button("1");
		b2=new Button("2");
		b3=new Button("3");
		b4=new Button("4");
		b5=new Button("5");
		b6=new Button("6");
		b7=new Button("7");
		b8=new Button("8");
		b9=new Button("9");
		b10=new Button("+");
		b11=new Button("-");
		b12=new Button("*");
		b13=new Button("/");
		b14=new Button("%");
		b15=new Button("CLR");
		b16=new Button("=");
		b17=new Button(".");
		l1=new Label("Enter");
		t1=new TextField(20);
		add(l1);
		add(t1);
		add(b0);
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b6);
		add(b7);
		add(b8);
		add(b9);
		add(b10);
		add(b11);
		add(b12);
		add(b13);
		add(b14);
		add(b15);
		add(b16);
		add(b17);
		setLayout(null);
		l1.setBounds(100,60,50,30);
		t1.setBounds(170,60,150,50);
		b1.setBounds(100,130,50,30);
		b2.setBounds(160,130,50,30);
		b3.setBounds(220,130,50,30);
		b4.setBounds(100,170,50,30);
		b5.setBounds(160,170,50,30);
		b6.setBounds(220,170,50,30);
		b7.setBounds(100,210,50,30);
		b8.setBounds(160,210,50,30);
		b9.setBounds(220,210,50,30);
		b10.setBounds(100,310,50,30);
		b11.setBounds(160,310,50,30);
		b12.setBounds(220,310,50,30);
		b13.setBounds(280,310,50,30);
		b14.setBounds(340,310,50,30);
		b15.setBounds(400,310,50,30);
		b0.setBounds(160,260,50,30);
		b16.setBounds(220,260,50,30);
		b17.setBounds(100,260,50,30);
		b0.addActionListener(this);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		b10.addActionListener(this);
		b11.addActionListener(this);
		b12.addActionListener(this);
		b13.addActionListener(this);
		b14.addActionListener(this);
		b15.addActionListener(this);
		b16.addActionListener(this);
		b17.addActionListener(this);
		 this.addWindowListener(new WindowAdapter()
                        {
                          public void windowClosing(WindowEvent e)
                          {
                            System.exit(0);
                          }
                        });
		 
	}
	public void actionPerformed(ActionEvent ae)
	{
		int c,n;
		String s1,s2,s3,s4;
		if(b0==ae.getSource())
		{
			s2="0";
			s3=t1.getText();
			s4=s3+s2;
			t1.setText(s4);
		}
		if(b1==ae.getSource())
		{
			s2="1";
			s3=t1.getText();
			s4=s3+s2;
			t1.setText(s4);
		}
		if(b2==ae.getSource())
		{
			s2="2";
			s3=t1.getText();
			s4=s3+s2;
			t1.setText(s4);
		}
		if(b3==ae.getSource())
		{
			s2="3";
			s3=t1.getText();
			s4=s3+s2;
			t1.setText(s4);
		}
		if(b4==ae.getSource())
		{
			s2="4";
			s3=t1.getText();
			s4=s3+s2;
			t1.setText(s4);
		}
		if(b5==ae.getSource())
		{
			s2="5";
			s3=t1.getText();
			s4=s3+s2;
			t1.setText(s4);
		}
		if(b6==ae.getSource())
		{
			s2="6";
			s3=t1.getText();
			s4=s3+s2;
			t1.setText(s4);
		}
		if(b7==ae.getSource())
		{
			s2="7";
			s3=t1.getText();
			s4=s3+s2;
			t1.setText(s4);
		}
		if(b8==ae.getSource())
		{
			s2="8";
			s3=t1.getText();
			s4=s3+s2;
			t1.setText(s4);
		}
		if(b9==ae.getSource())
		{
			s2="9";
			s3=t1.getText();
			s4=s3+s2;
			t1.setText(s4);
		}
		if(b10==ae.getSource())
		{
			s2="+";
			s3=t1.getText();
			s4=s3+s2;
			t1.setText(s4);
		}
		if(b11==ae.getSource())
		{
			s2="-";
			s3=t1.getText();
			s4=s3+s2;
			t1.setText(s4);
		}
		if(b12==ae.getSource())
		{
			s2="*";
			s3=t1.getText();
			s4=s3+s2;
			t1.setText(s4);
		}
		if(b13==ae.getSource())
		{
			s2="/";
			s3=t1.getText();
			s4=s3+s2;
			t1.setText(s4);
		}
		if(b14==ae.getSource())
		{
			s2="%";
			s3=t1.getText();
			s4=s3+s2;
			t1.setText(s4);
		}
		if(b15==ae.getSource())
		{
			t1.setText("");
		}
		if(b17==ae.getSource())
		{
			s2=".";
			s3=t1.getText();
			s4=s3+s2;
			t1.setText(s4);
		}
		if(b16==ae.getSource())
		{
			s3=t1.getText();
			t1.setText(s3+"="+Integer.toString(evaluate(s3)));
		}		
	}
	 public static int evaluate(String expression)
	    {
	        char[] tokens = expression.toCharArray();
	        Stack<Integer> values = new Stack<Integer>();
	        Stack<Character> ops = new Stack<Character>();
	        for (int i = 0; i < tokens.length; i++)
	        {
	            if (tokens[i] == ' ')
	            continue;
	            if (tokens[i] >= '0' && tokens[i] <= '9')
	            {
	            	StringBuffer sbuf = new StringBuffer();
	                while (i < tokens.length && tokens[i] >= '0' && tokens[i] <= '9')
	                    sbuf.append(tokens[i++]);
	                values.push(Integer.parseInt(sbuf.toString()));
	            }
	 	 	    else if (tokens[i] == '(')
	                ops.push(tokens[i]);
	 	        else if (tokens[i] == ')')
	            {
	                while (ops.peek() != '(')
	                  values.push(applyOp(ops.pop(), values.pop(), values.pop()));
	                ops.pop();
	            }
	 	        else if (tokens[i] == '+' || tokens[i] == '-' ||
	                     tokens[i] == '*' || tokens[i] == '/')
	            {
	                while (!ops.empty() && hasPrecedence(tokens[i], ops.peek()))
	                  values.push(applyOp(ops.pop(), values.pop(), values.pop()));
	                ops.push(tokens[i]);
	            }
	        }
	  	        while (!ops.empty())
	            values.push(applyOp(ops.pop(), values.pop(), values.pop()));
	 	        return values.pop();
	    }
	    public static boolean hasPrecedence(char op1, char op2)
	    {
	        if (op2 == '(' || op2 == ')')
	            return false;
	        if ((op1 == '*' || op1 == '/') && (op2 == '+' || op2 == '-'))
	            return false;
	        else
	            return true;
	    }
	    public static int applyOp(char op, int b, int a)
	    {
	        switch (op)
	        {
	        case '+':
	            return a + b;
	        case '-':
	            return a - b;
	        case '*':
	            return a * b;
	        case '/':
	            if (b == 0)
	                throw new
	                UnsupportedOperationException("Cannot divide by zero");
	            return a / b;
	        }
	        return 0;
	    }

    public static void main(String args[])
    {
    	ArithmeticOperations c2=new ArithmeticOperations();
    	c2.setTitle("Calculator");
    	c2.setVisible(true);
    	c2.setSize(900,900);
    }
}