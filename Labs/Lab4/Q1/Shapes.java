import java.awt.Polygon;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Graphics;

public class Shapes extends JFrame {
	Shapes() {
		setSize(350, 700);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public void paint(Graphics g) {
		// triangle
		g.setColor(Color.RED);
		int[] triangleX = { 140, 190, 140 };
		int[] triangleY = { 90, 140, 140 };
		Polygon triangle = new Polygon(triangleX, triangleY, triangleX.length);
		g.fillPolygon(triangle);

		// circle
		g.fillOval(50, 50, 60, 60);

		// hexagon
		g.setColor(Color.BLACK);
		int[] hexagonX = { 190, 260, 300, 260, 190, 150 };
		int[] hexagonY = { 200, 200, 270, 350, 350, 270 };
		Polygon hexagon = new Polygon(hexagonX, hexagonY, hexagonX.length);
		g.fillPolygon(hexagon);

		// Oval
		g.setColor(Color.GREEN);
		g.fillOval(200, 50, 100, 60);

		// pentagon
		g.setColor(Color.CYAN);
		int[] pentagonX = { 90, 160, 200, 160, 90 };
		int[] pentagonY = { 400, 400, 470, 550, 550 };

		Polygon pentagon = new Polygon(pentagonX, pentagonY, pentagonX.length);
		g.fillPolygon(pentagon);
	}

	public static void main(String[] args) {
		new Shapes();
	}

}