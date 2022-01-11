import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.BoxLayout;
import javax.swing.JPanel;

class Border implements ActionListener {
	JButton add, sub, mul, div;
	JTextField num1, num2, result;
	JPanel pan1, pan2, pan3, pan4;
	JLabel l1, l2, l3;
	public Border() {
		JFrame frame = new JFrame("this is frame");
		pan1 = new JPanel();
		pan2 = new JPanel();
		pan3 = new JPanel();
		pan4 = new JPanel();

		l1 = new JLabel("Num1:");  
		l2 = new JLabel("Num2:");
		l3 = new JLabel("Result");

		num1 = new JTextField();
		num2 = new JTextField();
		result = new JTextField();

		num1.setColumns(5);
		num2.setColumns(5);
		result.setColumns(5);

		add = new JButton("ADD");
		sub = new JButton("SUB");
		mul = new JButton("MUL");
		div = new JButton("DIV");

		pan1.add(l1);
		pan1.add(num1);

		pan2.add(l2);
		pan2.add(num2);

		pan3.add(l3);
		pan3.add(result);

		pan4.add(add);
		pan4.add(sub);
		pan4.add(mul);
		pan4.add(div);

		frame.add(pan1);
		frame.add(pan2);
		frame.add(pan3);
		frame.add(pan4);

		frame.setLayout(new BoxLayout(frame.getContentPane(),BoxLayout.Y_AXIS));
		
		frame.pack();	
		frame.setVisible(true);
	
		add.addActionListener(this);
		sub.addActionListener(this);
		mul.addActionListener(this);
		div.addActionListener(this);
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
		new Border();
	}
}
