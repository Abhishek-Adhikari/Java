## assigned date:Jan/7/2022
## deadline: Jan/14/2022
## submitted in: Jan/7/2022

# APPLET
## Applet Life Cycle in Java
In Java, an applet is a special type of program embedded in the web page to generate dynamic content. Applet is a class in Java.

The applet life cycle can be defined as the process of how the object is created, started, stopped, and destroyed during the entire execution of its application. It basically has five core methods namely init(), start(), stop(), paint() and destroy().These methods are invoked by the browser to execute.

Along with the browser, the applet also works on the client side, thus having less processing time.

## Methods of Applet Life Cycle
https://static.javatpoint.com/core/images/applet-life-cycle-in-java.png
There are five methods of an applet life cycle, and they are:
- init()

The init() method is the first method to run that initializes the applet. It can be invoked only once at the time of initialization. The web browser creates the initialized objects, i.e., the web browser (after checking the security settings) runs the init() method within the applet.

- start()

The start() method contains the actual code of the applet and starts the applet. It is invoked immediately after the init() method is invoked. Every time the browser is loaded or refreshed, the start() method is invoked. It is also invoked whenever the applet is maximized, restored, or moving from one tab to another in the browser. It is in an inactive state until the init() method is invoked.

- stop()

The stop() method stops the execution of the applet. The stop () method is invoked whenever the applet is stopped, minimized, or moving from one tab to another in the browser, the stop() method is invoked. When we go back to that page, the start() method is invoked again.

- destroy()

The destroy() method destroys the applet after its work is done. It is invoked when the applet window is closed or when the tab containing the webpage is closed. It removes the applet object from memory and is executed only once. We cannot start the applet once it is destroyed.

- paint()

The paint() method belongs to the Graphics class in Java. It is used to draw shapes like circle, square, trapezium, etc., in the applet. It is executed after the start() method and when the browser or applet windows are resized.

## Flow of Applet Life Cycle
  init() method

	   
 start() method

	   	
 paint() method
	   

  stop() method
	   

destroy() method	  

# JAVA SWING 
Java Swing is a part of Java Foundation Classes (JFC) that is used to create window-based applications. It is built on the top of AWT (Abstract Windowing Toolkit) API and entirely written in java.

Unlike AWT, Java Swing provides platform-independent and lightweight components.

The javax.swing package provides classes for java swing API such as JButton, JTextField, JTextArea, JRadioButton, JCheckbox, JMenu, JColorChooser etc.

## Difference
						
			# JAVA AWT 					  				# JAVA SWING 			
 ``` AWT components are platform-dependent. ```   Java swing components are platform-independent. ``` AWT components are heavyweight. ``` Swing components are lightweight. ``` AWT doesn't support pluggable look and feel. ``` Swing supports pluggable look and feel. ``` AWT provides less components than Swing. ``` Swing provides more powerful components such as tables, lists, scrollpanes, colorchooser, tabbedpane etc. ``` AWT doesn't follows MVC(Model view Controller) where model represents data, view represents presentation and controller acts as an interface between model and view. ``` Swing follows MVC.			  											

