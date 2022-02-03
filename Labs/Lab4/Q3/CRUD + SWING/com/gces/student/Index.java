package com.gces.student;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import javax.swing.*;
import java.sql.*;

public class Index extends JFrame {
	public static JButton add, delete, update, go;
	public static JTextField inputName, result;
	public static JLabel inputLabel;
	public Index() {
		JFrame frame = new JFrame("Main Frame");
		JPanel p = new JPanel();
		String a,b,c,d;
		// table
		String data[][] = { { "1", "ABC", "Abhishek", "2000" }, { "2", "XYZ", "Amrit", "3000"} };
		String column[] = { "Book Id", "Book name", "Author", "Price"};
		JTable jt = new JTable(data, column);

		result = new JTextField(30);
		p.add(result);

		inputName = new JTextField("0");
		inputName.setBounds(80, 222, 276, 20);
		String x = inputName.getText();
		int y = Integer.parseInt(x);
		System.out.println(y);

		p.add(inputName);

		jt.setBounds(10, 0, 80, 80);
		JScrollPane sp = new JScrollPane(jt);
		p.add(sp);

		add = new JButton("Add book");
		add.setBounds(30, 250, 100, 30);
		add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame f = new JFrame("add book frame");

				JTextField bName, bAuthor, bPrice, ok;
				JLabel l1, l2, l3;
				JButton Add;

				l1 = new JLabel("Book Name:");
				l1.setBounds(20, 80, 60, 30);

				bName = new JTextField();
				bName.setBounds(100, 80, 130, 30);

				l2 = new JLabel("Author:");
				l2.setBounds(20, 130, 60, 30);

				bAuthor = new JTextField();
				bAuthor.setBounds(100, 130, 130, 30);

				l3 = new JLabel("Price:");
				l3.setBounds(20, 190, 60, 30);

				bPrice = new JTextField();
				bPrice.setBounds(100, 190, 130, 30);

				ok = new JTextField();
				ok.setBounds(50, 230, 80, 30);

				add = new JButton("ADD BOOK");
				add.setBounds(50, 230, 110, 30);
				add.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String name = bName.getText();
						String author = bAuthor.getText();
						String price = bPrice.getText();

						Connection con;
						try {
							con = DriverManager.getConnection("jdbc:mysql://localhost:3306/books", "root", "");

							String query = "INSERT INTO customers (`bName`, `bAuthor`, `bPrice`) VALUES(?, ?, ?)";
							PreparedStatement stmt = con.prepareStatement(query);
							stmt.setString(1, name);
							stmt.setString(2, author);
							stmt.setString(3, price);

							stmt.executeUpdate();

							con.close();
							JOptionPane.showMessageDialog(null, "Book added successfully"); 
																							
						} catch (SQLException e1) {
							e1.printStackTrace();
						}
					}
				});

				f.add(l1);
				f.add(bName);
				f.add(l2);
				f.add(bAuthor);
				f.add(l3);
				f.add(bPrice);
				f.add(bAuthor);
				f.add(add);
				f.add(ok);

				f.setVisible(true);
				f.setLayout(null);
				f.setSize(400, 500);				
			}
		});

		delete = new JButton("Delete book");
		delete.setBounds(140, 250, 130, 30);
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {				
				JFrame fd = new JFrame("Delete book frame");
				JTextField search, ok;

				JLabel l1;
				l1 = new JLabel("Enter name to delete the book : ");
				l1.setBounds(30, 30, 200, 30);
				search = new JTextField();
				search.setBounds(30, 60, 100, 30);
								
				JButton okay;
				okay = new JButton("OK");
				okay.setBounds(30,200,60,30);
				okay.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String num = search.getText();
								
						Connection con;
						try {
							con = DriverManager.getConnection("jdbc:mysql://localhost:3306/books", "root", "");

							String query = "DELETE FROM customers WHERE `customers`.`bName` = ? ";
							PreparedStatement stm = con.prepareStatement(query);
							stm.setString(1, num);
							stm.executeUpdate();
							con.close();
							JOptionPane.showMessageDialog(null, "Book deleted successfully"); 
						} catch (SQLException e1) {
							e1.printStackTrace();
						}	
					}	
				});

				ok = new JTextField("ok");
				ok.setBounds(30,300,30,30);

				fd.add(l1);
				fd.add(search);
				fd.add(okay);
				fd.add(ok);
				
				fd.setVisible(true);
				fd.setLayout(null);
				fd.setSize(500, 500);
			}
		});
		
		update = new JButton("Update book");
		update.setBounds(280, 250, 130, 30);
		update.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame fu = new JFrame("update frame");
				JTextField name, author, price;
				JLabel l1, l2, l3,ok;
				JButton update;
				
				l1 = new JLabel("Name");
				l1.setBounds(30,30,80,30);
				name = new JTextField();
				name.setBounds(120,30,300,30);
				
				l2 = new JLabel("Author");
				l2.setBounds(30,70,80,30);
				author = new JTextField();
				author.setBounds(120,70,300,30);
				
				l3 = new JLabel("Price");
				l3.setBounds(30,110,80,30);
				price = new JTextField();
				price.setBounds(120,110,300,30);
				
				update = new JButton("UPDATE");
				update.setBounds(300, 150, 90, 30);
				update.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent event) {
						String naam = name.getText();
						String lekhak = author.getText();
						String paisa = price.getText();
						
						Connection con;
						try {
							con = DriverManager.getConnection("jdbc:mysql://localhost:3306/books", "root", "");

							String query = "UPDATE customers SET `bName`=?, `bAuthor` = ?, `bPrice` = ? WHERE `customers`.`bName` = ? ";
							PreparedStatement stm = con.prepareStatement(query);
							stm.setString(1, naam);
							stm.setString(2, lekhak);
							stm.setString(3, paisa);
							stm.setString(4, naam);

							stm.executeUpdate();

							con.close();
							JOptionPane.showMessageDialog(null, "Book updated successfully"); 
						} catch (SQLException e1) {
							e1.printStackTrace();
						}	
					}
				});
				
				ok = new JLabel("ok");
				ok.setBounds(30,150,40,30);
				
				fu.add(l1);
				fu.add(name);
				fu.add(l2);
				fu.add(author);
				fu.add(l3);
				fu.add(price);
				fu.add(update);
				fu.add(ok);
				
				fu.setVisible(true);
				fu.setLayout(null);
				fu.setSize(500, 500);				
			}
		});

		go = new JButton("Go");
		go.setBounds(370, 222, 70, 20);

		inputLabel = new JLabel("Search by name:");
		inputLabel.setBounds(80, 202, 150, 20);

		go.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Connection con;
				try {
					String name = inputName.getText();
					
					con = DriverManager.getConnection("jdbc:mysql://localhost:3306/books", "root", "");

					String query = "select * from customers where `customers`.`bName` = ? ";
					PreparedStatement stmt = con.prepareStatement(query);
					stmt.setString(1, name);
					
					ResultSet rs = stmt.executeQuery();
					
					while (rs.next()) {
						result.setText(
								rs.getInt(1) + "\t " + rs.getString(2) + "\t " + rs.getString(3) + "\t " + rs.getString(4));
					}

				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		});

		frame.add(add);
		frame.add(delete);
		frame.add(update);
		frame.add(inputName);
		frame.add(go);
		frame.add(inputLabel);

//		adding panel
		frame.add(p);

		frame.setSize(500, 500);
		frame.setVisible(true);
		frame.setLayout(null);
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		new Index();

	}
}
