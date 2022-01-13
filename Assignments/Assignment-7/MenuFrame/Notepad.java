import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;
import javax.swing.JPopupMenu;
import javax.swing.JTextArea;
import javax.swing.JDialog;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.GridLayout;

public class Notepad implements ActionListener {
	JFrame frame = new JFrame();
	JMenuBar mb;
	JMenu file, edit, view, open;
	JMenuItem window, panel, nestedMenu, naya, save, close, cut, paste, copy, text, folder;
	JTextArea ta;
	JPopupMenu popupMenu;
	
	public Notepad() {
		naya = new JMenuItem("New");
		save = new JMenuItem("Save");
		close = new JMenuItem("Close");
		cut = new JMenuItem("Cut");
		copy = new JMenuItem("Copy");
		paste = new JMenuItem("Paste");
		window = new JMenuItem("window");
		panel = new JMenuItem("panel");
		
		cut.addActionListener(this);
		copy.addActionListener(this);
		paste.addActionListener(this);
		
		nestedMenu = new JMenu("Naya");
		mb = new JMenuBar();
		file = new JMenu("File");
		edit = new JMenu("Edit");
		view = new JMenu("View");
		open = new JMenu("Open");

		file.add(naya);
		file.add(save);
		file.add(close);

		edit.add(copy);
		edit.add(paste);
		edit.add(cut);

		view.add(window);
		view.add(panel);

		mb.add(file);
		mb.add(edit);
		mb.add(view);
		mb.add(open);

		ta = new JTextArea();
		ta.setBounds(5,5,360,320);
		frame.add(mb);
		frame.add(ta);
		frame.setJMenuBar(mb);

		popupMenu = new JPopupMenu();

		// popupMenu.add(file);
		// popupMenu.add(edit);
		// popupMenu.add(view);
		// popupMenu.add(open);

		frame.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent e){
				if(e.getButton() == MouseEvent.BUTTON3){
					popupMenu.show(frame,e.getX(),e.getY());
					System.out.println("popupMenu line 84 - 87 uncomment garda Menubar nai harayo");	
				}
			}
		});	
		frame.setVisible(true);
		frame.setSize(500,500);
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==cut)    
		ta.cut();    
		if(e.getSource()==paste)    
		ta.paste();    
		if(e.getSource()==copy)    
		ta.copy();    

		String s = e.getActionCommand();
        if (s.equals("open")) {
            JDialog d = new JDialog(frame, "YOU SURE?");
 
            JLabel l = new JLabel("this is a dialog box");
 
            d.add(l);
 
            d.setSize(100, 100);
            // visibility of dialog
            d.setVisible(true);

        }	
	   }
	
	public static void main(String[] args) {
		new Notepad();
	}
}

