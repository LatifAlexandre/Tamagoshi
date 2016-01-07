package Tama;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.*;
import javax.swing.event.*;


public class GraphicsEngine extends JFrame implements ActionListener {

     private JPanel panel = new JPanel(); //a panel that contais all the other panels
     
     CenterPanel centerP;
     TopPanel topP;
     BottomPanel bottomP;
          
     
 	
     public void changePhoto(String img){
    	 ImageIcon icon = new ImageIcon(getClass().getResource(img));
    	 JLabel label = new JLabel(icon);
         add(label);
         panel.add(label, BorderLayout.CENTER);
     }
 		
     
     public GraphicsEngine(Tamagoshi tama){
          super("Tamagoshi");
          
          centerP = new CenterPanel();
          topP = new TopPanel();
          bottomP = new BottomPanel(tama);
          
          
          initiateGui(tama);
     }

     
     void initiateGui(Tamagoshi tama){
    	 
    	 setLayout(new BorderLayout());
         setSize(700,500);
         setResizable(true);
         setDefaultCloseOperation(EXIT_ON_CLOSE);
         setLocationRelativeTo(null);
         
         setVisible(true);
         
         changePhoto("bg.jpg");
         
         
         JMenuBar menuBar = new JMenuBar();
         JMenu fileMenu = new JMenu("File");
         fileMenu.setMnemonic( KeyEvent.VK_F);
         JMenu optionMenu = new JMenu("Options");
         fileMenu.setMnemonic( KeyEvent.VK_F);
         JMenu aboutMenu = new JMenu("About");
         fileMenu.setMnemonic( KeyEvent.VK_F);
         menuBar.add(fileMenu);
         menuBar.add(optionMenu);
         menuBar.add(aboutMenu);

         // File->New, N - Mnemonic
         JMenuItem newGame = new JMenuItem("New", KeyEvent.VK_N);
         JMenuItem loadGame = new JMenuItem("Load Game", KeyEvent.VK_N);
         JMenuItem saveGame = new JMenuItem("Save Game", KeyEvent.VK_N);
         JMenuItem exitGame = new JMenuItem("Exit", KeyEvent.VK_N);
         fileMenu.add(newGame);
         fileMenu.add(loadGame);
         fileMenu.add(saveGame);
         fileMenu.add(exitGame);

         setJMenuBar(menuBar);
         
         add(centerP, BorderLayout.CENTER);
         add(topP,BorderLayout.NORTH);
         
         topP.play.addActionListener(this);
         topP.feed.addActionListener(this);
         topP.sleep.addActionListener(this);
         
         
         add(bottomP,BorderLayout.SOUTH);
    	 add(panel);
     }
     
     
     
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
     
	
	
     
     







}
