import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;

class FrameWithInheritance extends JFrame{
	public FrameWithInheritance() {  //using constructor
		JFrame frame = new JFrame();
		frame.setSize(500, 500);

		JTextField num1, num2, result;
		JButton add, sub, mul, div;
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

		frame.add(l1);
		frame.add(l2);
		frame.add(l3);

		frame.add(num1);
		frame.add(num2);
		frame.add(result);
		frame.add(add);
		frame.add(sub);
		frame.add(mul);
		frame.add(div);

		add.setBounds(50, 180, 90, 30);
		sub.setBounds(142, 180, 90, 30);
		mul.setBounds(233, 180, 90, 30);
		div.setBounds(324, 180, 90, 30);
		frame.setLayout(null);
		frame.setVisible(true);
	}
	public static void main(String[] args) {
		new FrameWithInheritance();
	}	
}



