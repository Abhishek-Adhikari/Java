import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;

class FrameWithAssociation {
	public static void main(String[] args) {
		JFrame frame = new JFrame("this is frame");

		JTextField num1, num2, result;
		JButton add, sub, mul, div;

		num1 = new JTextField("enter num1");
		num1.setBounds(50, 50, 200, 30);

		num2 = new JTextField("enter num2");
		num2.setBounds(50, 100, 200, 30);

		result = new JTextField("Result");
		result.setBounds(50, 150, 200, 30);

		add = new JButton("ADD");
		sub = new JButton("SUB");
		mul = new JButton("MUL");
		div = new JButton("DIV");

		frame.add(num1);
		frame.add(num2);
		frame.add(result);
		frame.add(add);
		frame.add(sub);
		frame.add(mul);
		frame.add(div);

		add.setBounds(50, 180, 70, 30);
		sub.setBounds(121, 180, 70, 30);
		mul.setBounds(192, 180, 70, 30);
		div.setBounds(263, 180, 70, 30);
		
		frame.setSize(500, 500);
		frame.setLayout(null);
		frame.setVisible(true);
	}
}