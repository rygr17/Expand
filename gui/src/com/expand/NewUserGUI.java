package com.expand;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class NewUserGUI implements ActionListener{
	
	protected JFrame frame;
	String sidOut;
	String passwordOut;
	String firstNameOut;
	String lastNameOut;
	
	
	public NewUserGUI() {
		
	}
	 public void show() {

	    	frame = new JFrame("New User Register");
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setSize(new Dimension(500,500));
	        frame.setLayout(new FlowLayout());
	        frame.setResizable(false);
	        
	        JPanel sid = new JPanel();
	        sid.setLayout(new BoxLayout(sid,
                    BoxLayout.PAGE_AXIS));
	        JLabel sidText = new JLabel("Sid");
	        JTextField sidField = new JTextField(7);
	        sid.add(sidText);
	        sid.add(sidField);
	        frame.add(sid);
	        
	        JPanel pass = new JPanel();
	        pass.setLayout(new BoxLayout(pass,
                    BoxLayout.PAGE_AXIS));
	        JLabel passText = new JLabel("Password");
	        JPasswordField passField = new JPasswordField(10);
	        sid.add(passText);
	        sid.add(passField);
	        frame.add(pass);
	        
	        JPanel firstName = new JPanel();
	        firstName.setLayout(new BoxLayout(firstName,
                    BoxLayout.PAGE_AXIS));
	        JLabel firstText = new JLabel("First Name");
	        JTextField firstField = new JTextField(10);
	        sid.add(firstText);
	        sid.add(firstField);
	        frame.add(firstName);
	        
	        JPanel lastName = new JPanel();
	        firstName.setLayout(new BoxLayout(firstName,
                    BoxLayout.PAGE_AXIS));
	        JLabel lastText = new JLabel("Last Name");
	        JTextField lastField = new JTextField(10);
	        sid.add(lastText);
	        sid.add(lastField);
	        frame.add(lastName);
	        
	        JButton go = new JButton("start");
	        go.addActionListener(this);
	        frame.add(go);
	        
	        frame.setResizable(false);
	        frame.setVisible(true);
	 }
	 
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("start")){
			new NewUserGUI2(sidOut, passwordOut, firstNameOut, 
					lastNameOut).show();
		}
		
	}

}
