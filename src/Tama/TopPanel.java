package Tama;

import java.awt.GridLayout;

import javax.swing.*;

public class TopPanel extends JPanel {

	JButton feed = new JButton("Feed");
	JButton play = new JButton("Play");
	JButton sleep = new JButton("Sleep");
     
     TopPanel()
     {
    	 setLayout(new GridLayout(1,3));
    	 add(feed);
    	 add(play);
    	 add(sleep);
     }
}
