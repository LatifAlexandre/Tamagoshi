package Tama;

public class Main
{

     public static void main(String [] args)
     {
          //TODO gestion de sauvgarde
          //TODO environnement
          //TODO moteur graphique
          //TODO Boucle de jeu
          Tamagoshi tama = new Tamagoshi("Tamuuu", 15);
          System.out.println(tama);
          tama.changeAge(1);
          tama.changeHealthPoints(-20);
          tama.changeHungerPoints(-200);
          tama.changeEnergyPoints(25);
          tama.changeMoodPoints(-50);
          
          System.out.println(tama);
          
          new GraphicsEngine(tama);
     }

}
