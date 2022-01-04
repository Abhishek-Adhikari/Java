import java.awt.Frame;
import java.awt.Button;
import java.awt.TextField;

class FrameWithAssociation {
	public static void main(String[] args) {
		Frame frame = new Frame("this is frame");

		TextField num1, num2, result;
		Button add, sub, mul, div;

		num1 = new TextField("enter num1");
		num1.setBounds(50, 50, 200, 30);

		num2 = new TextField("enter num2");
		num2.setBounds(50, 100, 200, 30);

		result = new TextField("Result");
		result.setBounds(50, 150, 200, 30);

		add = new Button("ADD");
		sub = new Button("SUB");
		mul = new Button("MUL");
		div = new Button("DIV");

		frame.add(num1);
		frame.add(num2);
		frame.add(result);
		frame.add(add);
		frame.add(sub);
		frame.add(mul);
		frame.add(div);

		add.setBounds(50, 180, 50, 30);
		sub.setBounds(102, 180, 50, 30);
		mul.setBounds(154, 180, 50, 30);
		div.setBounds(206, 180, 50, 30);
		
		frame.setSize(500, 500);
		frame.setLayout(null);
		frame.setVisible(true);
	}
}