package com.expand;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class NewUserGUI2 implements ActionListener{
	
	String sid;
	String password;
	String firstName;
	String lastName;
	protected JFrame frame;
	JComboBox univField;
	JTextField deptField;
	JCheckBox fishing;
	JCheckBox hiking;
	JCheckBox concerts;
	JCheckBox traveling;
	JCheckBox food;
	JCheckBox baseball;
	JCheckBox football;
	
	public NewUserGUI2(String sid, String password, String firstName, 
			String lastName){
		this.sid = sid;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		
	}
	
	public void show(){
		frame = new JFrame("Create your profile");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(500,500));
        frame.setLayout(new FlowLayout());
        frame.setResizable(false);
        
        String[] universities = {
                "Penn State",
                "Temple",
                "University of Delaware",
                "University of Maryland",
                "Grambling State",
                "University of Pennsylvania",
                };
        
        JPanel univ = new JPanel();
        univ.setLayout(new BoxLayout(univ,
                BoxLayout.PAGE_AXIS));
        JLabel univText = new JLabel("University");
        univField = new JComboBox(universities);
        univ.add(univText);
        univ.add(univField);
        frame.add(univ);
        
        JPanel dept = new JPanel();
        dept.setLayout(new BoxLayout(dept,
                BoxLayout.PAGE_AXIS));
        JLabel deptText = new JLabel("Department");
        deptField = new JTextField(20);
        dept.add(deptText);
        dept.add(deptField);
        frame.add(dept);
        
        fishing = new JCheckBox();
        JLabel fishingLabel = new JLabel("fishing");
        frame.add(fishingLabel);
        frame.add(fishing);
        hiking = new JCheckBox();
        JLabel hikingLabel = new JLabel("hiking");
        frame.add(hikingLabel);
        frame.add(hiking);
        concerts = new JCheckBox();
        JLabel concertsLabel = new JLabel("concerts");
        frame.add(concertsLabel);
        frame.add(concerts);
        traveling = new JCheckBox();
        JLabel travelingLabel = new JLabel("traveling");
        frame.add(travelingLabel);
        frame.add(traveling);
        food = new JCheckBox();
        JLabel foodLabel = new JLabel("food");
        frame.add(foodLabel);
        frame.add(food);
        
        JLabel blank = new JLabel("               ");
        frame.add(blank);
        
        baseball = new JCheckBox();
        JLabel baseballLabel = new JLabel("baseball");
        frame.add(baseballLabel);
        frame.add(baseball);
        football = new JCheckBox();
        JLabel footballLabel = new JLabel("football");
        frame.add(footballLabel);
        frame.add(football);
        
        JButton go = new JButton("start");
        go.addActionListener(this);
        frame.add(go);
        
        frame.setResizable(false);
        frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("start")){
			Hobbies hobbies = new Hobbies(fishing.isSelected(), hiking.isSelected(),
					concerts.isSelected(), traveling.isSelected(), food.isSelected(),
					baseball.isSelected(), football.isSelected());
			Profile profile = new Profile(sid, password, firstName, lastName,
					(String)univField.getSelectedItem(), deptField.getText().toString(),
					hobbies);
		}
		
	}

}
