import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;

class FrameWithInheritance extends JFrame{
	public FrameWithInheritance() {  //using constructor
		JFrame frame = new JFrame();
		frame.setSize(500, 500);

		JTextField field1, field2, result;
		JButton add, sub, mul, div;

		field1 = new JTextField("NUM1");
		field2 = new JTextField("NUM2");
		result = new JTextField("RESULT");

		add = new JButton("ADD");
		sub = new JButton("SUB");
		mul = new JButton("MUL");
		div = new JButton("DIV");

		frame.add(field1);
		frame.add(field2);
		frame.add(result);
		frame.add(add);
		frame.add(sub);
		frame.add(mul);
		frame.add(div);

		field1.setBounds(50, 50, 200, 30);
		field2.setBounds(50, 100, 200, 30);
		result.setBounds(50, 150, 200, 30);

		add.setBounds(50, 180, 70, 30);
		sub.setBounds(121, 180, 70, 30);
		mul.setBounds(192, 180, 70, 30);
		div.setBounds(263, 180, 70, 30);

		frame.setLayout(null);
		frame.setVisible(true);
	}
	public static void main(String[] args) {
		new FrameWithInheritance();
	}	
}



