import java.awt.Frame;
import java.awt.TextField;
import java.awt.Button;

class FrameWithInheritance extends Frame{
	public static void main(String[] args) {
		FrameWithInheritance frame = new FrameWithInheritance();
		frame.setSize(500, 500);

		TextField field1, field2, result;
		Button add, sub, mul, div;

		field1 = new TextField("NUM1");
		field2 = new TextField("NUM2");
		result = new TextField("RESULT");

		add = new Button("ADD");
		sub = new Button("SUB");
		mul = new Button("MUL");
		div = new Button("DIV");

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

		add.setBounds(50, 180, 50, 30);
		sub.setBounds(102, 180, 50, 30);
		mul.setBounds(154, 180, 50, 30);
		div.setBounds(206, 180, 50, 30);

		frame.setLayout(null);
		frame.setVisible(true);
	}	
}