import java.awt.Button;
import java.awt.TextField;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class AwtGUI implements ActionListener{
		Button check;
		TextField field1, field2;
		Label label1, label2;

	public AwtGUI() {
		Frame frame = new Frame("object");

		field1 = new TextField();
		field1.setBounds(150, 50, 200, 30);

		field2 = new TextField();
		field2.setBounds(150, 100, 200, 30);

	
		label1 = new Label("NUM1");
		label1.setBounds(50,50,70,30);

		label2 = new Label("NUM2");
		label2.setBounds(50,100,70,30);

		check = new Button("CHECK");
	

		frame.add(label1);
		frame.add(label2);

		frame.add(field1);
		frame.add(field2);
	
		frame.add(check);
				
		check.addActionListener(this);

		check.setBounds(50, 180, 90, 30);


		frame.setSize(500, 500);
		frame.setLayout(null);
		frame.setVisible(true);
	}

	public void actionPerformed(ActionEvent event) {
		double num1 = Double.parseDouble(field1.getText());
		// double num2 = Double.parseDouble(field2.getText());
	try {
		if(event.getSource() == check) {
			if (num1 % 2 == 0) {
				field2.setText(String.valueOf("even"));
			}else {
				field2.setText(String.valueOf("odd"));				
			}
		}

	} catch (Exception e) {
			field2.setText("invalid " + e.getMessage());
	}
	}

public static void main(String[] args)
	{
		new AwtGUI();
	}
}