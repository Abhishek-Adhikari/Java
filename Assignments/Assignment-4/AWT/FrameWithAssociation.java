import java.awt.Frame;
import java.awt.Button;
import java.awt.TextField;
import java.awt.Label;

class FrameWithAssociation {
	public static void main(String[] args) {
		Frame frame = new Frame("this is frame");

		TextField num1, num2, result;
		Button add, sub, mul, div;
		Label l1, l2, l3;

		l1 = new Label("Num1:");
		l1.setBounds(50, 50, 70, 30);
        
		l2 = new Label("Num2:");
		l2.setBounds(50,100,70,30);
        
		l3 = new Label("Result");
		l3.setBounds(50,150,70,30);

		num1 = new TextField();
		num1.setBounds(150, 50, 200, 30);

		num2 = new TextField();
		num2.setBounds(150, 100, 200, 30);

		result = new TextField();
		result.setBounds(150, 150, 200, 30);

		add = new Button("ADD");
		sub = new Button("SUB");
		mul = new Button("MUL");
		div = new Button("DIV");

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
		
		frame.setSize(500, 500);
		frame.setLayout(null);
		frame.setVisible(true);
	}
}