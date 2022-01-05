import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

class CalculatorWithinClass extends JFrame implements ActionListener {
	JButton add, sub, mul, div;
	JTextField num1, num2, result;
	public CalculatorWithinClass() {
		JLabel l1, l2, l3;

		l1 = new JLabel("Num1:");
		l1.setBounds(50, 50, 70, 30);
        
		l2 = new JLabel("Num2:");
		l2.setBounds(50,100,70,30);
        
		l3 = new JLabel("Result");
		l3.setBounds(50,150,70,30);

		num1 = new JTextField();
		num1.setBounds(150, 50, 200, 30);

		num2 = new JTextField();
		num2.setBounds(150, 100, 200, 30);

		result = new JTextField();
		result.setBounds(150, 150, 200, 30);

		add = new JButton("ADD");
		sub = new JButton("SUB");
		mul = new JButton("MUL");
		div = new JButton("DIV");

		add(l1);
		add(l2);
		add(l3);

		add(num1);
		add(num2);
		add(result);
		add(add);
		add(sub);
		add(mul);
		add(div);

		add.addActionListener(this);
		sub.addActionListener(this);
		mul.addActionListener(this);
		div.addActionListener(this);

		add.setBounds(50, 180, 90, 30);
		sub.setBounds(142, 180, 90, 30);
		mul.setBounds(233, 180, 90, 30);
		div.setBounds(324, 180, 90, 30);
		
		setSize(500, 500);
		setLayout(null);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent event)
	{
		String temp1 = num1.getText();
		String temp2 = num2.getText();
		double num1 = Double.parseDouble(temp1);

       	double num2 = Double.parseDouble(temp2);
        try {
            if(event.getSource()==add)
            {
            result.setText(String.valueOf(num1+num2));
            }
            if(event.getSource()==sub)
            {
            result.setText(String.valueOf(num1-num2));
            }
            if(event.getSource()==mul)
            {
            result.setText(String.valueOf(num1*num2));
            }
            if(event.getSource()==div)
            {
            result.setText(String.valueOf(num1/num2));
            }
        } catch (Exception e) {
        	result.setText("invalid " + e.getMessage());
        }    
	}	

public static void main(String[] args)
	{
		new CalculatorWithinClass();
	}
}