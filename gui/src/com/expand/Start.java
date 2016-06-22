package com.expand;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import java.util.*;
import java.text.SimpleDateFormat;

public class Start extends JPanel implements ActionListener {
	
	static JFrame frame;
    String numLetters, numGuesses;
    private JComboBox patternList, patternList1;
	
	public Start() {
        
        JButton newButton = new JButton("New User");
        newButton.addActionListener(this);
        add(newButton);
        
        JButton ExistingButton = new JButton("Existing User");
        ExistingButton.addActionListener(this);
        add(ExistingButton);
 
        setBorder(BorderFactory.createEmptyBorder(10,10,10,10));

    }

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getActionCommand().equals("New User")){
			new NewUserGUI().show();
		}
		
		if (e.getActionCommand().equals("Existing User")){
			
		}
    	//new GUI_PlayGame(Integer.parseInt(numLetters), Integer.parseInt(numGuesses)).show();
		
	}
	
	public static void createAndShowGUI() {
        //Create and set up the window.
        frame = new JFrame("Evil Hangman");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        //Create and set up the content pane.
        JComponent newContentPane = new Start();
        newContentPane.setOpaque(true); //content panes must be opaque
        frame.setContentPane(newContentPane);
 
        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }
 
    public static void main(String[] args) {
    	createAndShowGUI();

    }

		
}
