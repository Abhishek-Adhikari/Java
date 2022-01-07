import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class SwingGUI implements ActionListener{
		JButton add, subtract;
		JTextField field1, field2, field3;
		JLabel label1, label2, label3;

	public SwingGUI() {
		JFrame frame = new JFrame("object");

		field1 = new JTextField();
		field1.setBounds(150, 50, 200, 30);

		field2 = new JTextField();
		field2.setBounds(150, 100, 200, 30);

		field3 = new JTextField();
		field3.setBounds(150, 150, 200, 30);

		label1 = new JLabel("NUM1");
		label1.setBounds(50,50,70,30);

		label2 = new JLabel("NUM2");
		label2.setBounds(50,100,70,30);

		label3 = new JLabel("RESULT");
		label3.setBounds(50,150,70,30);

		add = new JButton("ADD");
		subtract = new JButton("SUB");
	

		frame.add(label1);
		frame.add(label2);
		frame.add(label3);

		frame.add(field1);
		frame.add(field2);
		frame.add(field3);

		frame.add(add);
		frame.add(subtract);
				
		add.addActionListener(this);
		subtract.addActionListener(this);		

		add.setBounds(50, 180, 90, 30);
		subtract.setBounds(142, 180, 90, 30);


		frame.setSize(500, 500);
		frame.setLayout(null);
		frame.setVisible(true);
	}

	public void actionPerformed(ActionEvent event) {
		double num1 = Double.parseDouble(field1.getText());
		double num2 = Double.parseDouble(field2.getText());
	try {
		if(event.getSource() == add) {
			field3.setText(String.valueOf(num1 + num2));
		}

		if(event.getSource() == subtract) {
			field3.setText(String.valueOf(num1 - num2));
		}
	} catch (Exception e) {
			label3.setText("invalid " + e.getMessage());
	}
	}

public static void main(String[] args)
	{
		new SwingGUI();
	}
}