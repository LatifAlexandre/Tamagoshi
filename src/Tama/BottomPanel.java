package Tama;

import java.awt.GridLayout;

import javax.swing.*;

public class BottomPanel extends JPanel {
	
	JLabel age;
	JLabel health;
	JLabel hunger;
	JLabel energy;
	JLabel mood;
    
    
    BottomPanel(Tamagoshi tama){
    	
    	age = new JLabel("Age : " + (tama.getAge()) + " years | ");
        health = new JLabel("Health = " + (tama.getHealthPoints()) + "% | ");
        hunger = new JLabel("Hunger = " + (tama.getHungerPoints()) + "% | ");
        energy = new JLabel("Energy = " + (tama.getEnergyPoints()) + "% | ");
        mood = new JLabel("Mood = " + (tama.getMoodPoints()) + "%");
    	
    	setLayout(new GridLayout(1,5));
    	add(age);
        add(health);
        add(hunger);
        add(energy);
        add(mood);
    }
	
     
     
}
