public class Tamagoshi
{
     private String name;
     final float health;
     private float healthPoints;
     private int age;
     final float hunger; // hunger percentage 
     private float hungerPoints; // starting which percentage of "hunger" the tamagoshi is hungry
     final float energy; // fatigue percentage
     public float energyPoints;
     final float tired; // starting which percentage of "fatigue" the tamagoshi is tired
     private boolean sickness;
     private boolean sleeping;
     private int desire; // on fait un random chaque certain temps et on associe chaque élement à un int donc on renvoit le int
     final float mood;
     private float moodPoints;
     
     

     
     /********************\
     /     GETTERS        /
     /       AND          \
     /     SETTERS        /
     /                    \
     /*********************/


     public String getName ()
     {
          return name;
     }
     
     public float getHealth ()
     {
          return health;
     }
     
     public float getHealthPoints ()
     {
          return healthPoints;
     }
     
     public float changeHealthPoints ( float change )
     {
          healthPoints += change;
     }
     
     public int getAge ()
     {
          return age;
     }
     
     public float getHunger ()
     {
          return hunger;
     }
     
     public float getHungerPoints ()
     {
          return hungerPoints;
     }
     
     public void changeHungerPoints ( float change )
     {
          hungerPoints += change;
     }
     
     public float getEnergy ()
     {
          return energy;
     }
     
     public float getEnergyPoints ()
     {
          return energyPoints;
     }
     
     public void changeEnergyPoints( float change )
     {
          energyPoints += change;
     }
     
     public boolean sickness ()
     {
          return sickness;    
     }
     
     public boolean sleeping ()
     {
          return sleeping;    
     }
     
     public float getMood ()
     {
          return getMood;
     }
     
     public float getMoodPoints ()
     {
          return moodPoints;
     }
     
     public void changeMoodPoints( float change )
     {
          moodPoints += change;
     }
     
     
     
     
     
     
     
     

}
