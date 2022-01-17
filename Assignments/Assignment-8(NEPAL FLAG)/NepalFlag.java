import java.awt.Graphics;
import java.awt.Frame;
import java.awt.Color;
import java.awt.Polygon;

class NepalFlag extends Frame {
	static Color FlagColor = new Color(221,12,39);

	public NepalFlag() {
		super("Nepal Flag");
		setSize(900, 900);
		setVisible(true);
	}
	
	public void paint(Graphics g) {
		// triangle with blue border
		int a[]  = {80, 40, 120 };
		int b[] = {30, 150, 150 };

		g.setColor(Color.blue);
		g.drawPolygon(a, b, 3);


		// triangle filled with green color
		int c[]  = {180, 140, 220};
		int d[] = {30, 150, 150};
		g.setColor(Color.green);
		g.fillPolygon(c, d, 3);
		g.drawPolygon(c, d, 3);


		// NEPAL FLAG
		int n[] = {250, 350, 250, 350, 250};
		int o[] = {30, 130, 130, 250,250};

		g.setColor(FlagColor);
		
		g.fillPolygon(n, o , 5);
		g.drawPolygon(n, o, 5);

		g.drawLine(250 , 250, 250, 270);
		g.setColor(Color.white);
		g.fillOval(270,200,20,20);		

		g.setColor(Color.white);
		g.fillOval(270, 87, 20, 20);
		
		g.setColor(FlagColor);
		g.fillOval(270, 83, 20, 20);


		// for blue borders
		int x[] = {230,230,350,250,350,250, 250,356,256,356}; 
		int y[] = {6  ,10 ,130,130,250,250, 253,253,133,133};
		Polygon border = new Polygon(x,y,10);
		g.drawPolygon(border);
		g.setColor(Color.blue);
		g.fillPolygon(border);

		// stick of flag
		int s[] = {250,253,253,250};
		int t[] = {6,10,287,287};
		Polygon stick = new Polygon(s, t, 4);
		g.drawPolygon(stick);
		g.setColor(Color.blue);
		g.fillPolygon(stick);
	}
		

	public static void main(String[] args) {
		new NepalFlag();
	}
}