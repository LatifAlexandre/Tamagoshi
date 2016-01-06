package Tama;
import javax.swing.*;
import javax.swing.event.*;


public class GraphicsEngine extends JFrame
{

     JPanel panel = new JPanel();
     JButton button = new JButton("Hello");

     public GraphicsEngine(Tamagoshi tama){
          super("Tamagoshi");
          
          setSize(500,400);
          setResizable(true);
          setDefaultCloseOperation(EXIT_ON_CLOSE);
          setLocationRelativeTo(null);
          
          panel.add(button);
          add(panel);
          
          setVisible(true);
     }
     
     
     







}
