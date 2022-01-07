import java.applet.Applet;
import java.awt.Graphics;

 class AppletLifeCycle extends Applet{
 	public void init() {
 		// initialized objects
 		System.out.println("initialized objects.");
 	}

 	public void start() {
 		// start the applet code
 		System.out.println("start the applet code");
 	}

 	public void paint(Graphics graphics) {
 		// any shapes code
 		System.out.println("any shapes code.");
 	}

 	public void stop() {
 		// stop the applet code
 		System.out.println("stop the applet code.");
 	}

 	public void destroy() {
 		// destroy the applet code
 		System.out.println("destroy the applet code");
 	}

 }