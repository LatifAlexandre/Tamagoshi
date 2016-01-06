package Tama;
public class Tamagoshi
{
     private String name;
     final float maxHealth = 100;
     private float healthPoints;
     final float sick = 25; //Starting which percentage of health the tama become sick
     private int age;
     final int maxAge = 80; // maximum age at which the Tama dies
     final int old = 50; // starting which age the tamagoshi is old
     final float maxHunger = 100; 
     private float hungerPoints; // hunger percentage 
     final float hungry = 50; // starting which percentage of "hunger" the tamagoshi is hungry
     final float maxEnergy = 100; 
     public float energyPoints; // fatigue percentage
     final float tired = 20; // starting which percentage of "fatigue" the tamagoshi is tired
     private boolean sleeping;
     final float maxMood = 100;
     private float moodPoints;
     final float sad = 30; // starting which percentage of maxMood he'll become sad
     

     
     
     /**					
	 * Constructur of a tamagoshi
	 * 
	 * @param n player name
	 * @param a player age
	 */
	 
      Tamagoshi (String n, int a){
          name = n;
          age = a;
          healthPoints = 100;
          hungerPoints = 100;
          energyPoints = 100;
          sleeping = false;
          moodPoints = 100;
      }


     
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
     
     
     // ----------------------------------------
     public float getMaxHealth ()
     {
          return maxHealth;
     }
     
     public float getHealthPoints ()
     {
          return healthPoints;
     }
     
     public void changeHealthPoints ( float change )
     {
          if ((healthPoints + change) > maxHealth){
               healthPoints = maxHealth;
          }
          
          else if ((healthPoints + change) < 0){
               healthPoints = 0;
          }
          
          else healthPoints += change;
     }
     
     public boolean isSick(){
          if (healthPoints <= sick) return true;
          else return false;
     }
     
     // ----------------------------------------
     public int getMaxAge(){
          return maxAge;
     }
     
     public int getAge ()
     {
          return age;
     }
     
     public void changeAge(int change){
          if ((age + change) > maxAge){
               age = maxAge;
          }
          
          else age += change;
     }
     
     public boolean isOld(){
          if (age >= old) return true;
          else return false;
     }
     
     // ----------------------------------------
     public float getMaxHunger ()
     {
          return maxHunger;
     }
     
     public float getHungerPoints ()
     {
          return hungerPoints;
     }
     
     public void changeHungerPoints ( float change )
     {
          if ((hungerPoints + change) > maxHunger){
               hungerPoints = maxHunger;
          }
          
          else if ((hungerPoints + change) < 0){
               hungerPoints = 0;
          }
         
          else hungerPoints += change;
     }
     
     public boolean isHungry(){
          if (hungerPoints <= hungry) return true;
          else return false;
     }
     
     
     // ----------------------------------------
     public float getMaxEnergy ()
     {
          return maxEnergy;
     }
     
     public float getEnergyPoints ()
     {
          return energyPoints;
     }
     
     public void changeEnergyPoints( float change )
     {
          if ((energyPoints + change) > maxEnergy){
               energyPoints = maxEnergy;
          }
          
          else if ((energyPoints + change) < 0){
               energyPoints = 0;
          }
          
          else energyPoints += change;
     }
     
     public boolean isTired(){
          if (energyPoints <= tired) return true;
          else return false;
     }

     // ----------------------------------------
     public boolean sleeping ()
     {
          return sleeping;    
     }
     
     // ----------------------------------------
     public float getMaxMood ()
     {
          return maxMood;
     }
     
     public float getMoodPoints ()
     {
          return moodPoints;
     }
     
     public void changeMoodPoints( float change )
     {
          if ((moodPoints + change) > maxMood){
               moodPoints = maxMood;
          }
          
          else if ((moodPoints + change) < 0){
               moodPoints = 0;
          }
          
          else moodPoints += change;
     }
     
     public boolean isSad(){
          if (moodPoints <= sad) return true;
          else return false;
     }
     

//     public boolean wantsToPlay(){
//     
//     }
//     
//     public boolean wantsToEat(){
//     
//     }
//     
//     public boolean wantsToSleep(){
//     
//     }

     
//     /**					
//	 * tell what the tamagoshi wants to do
//	 * 
//	 */
//	 public void checkDesire(){
//	     
//	     if ((healthPoints < maxHealth/2) && (moodPoints < maxMood/2) && (energyPoints > maxEnergy/2)){
//	          System.out.println("I WANT TO PLAAAAAAAAAAY!");
//	     }
//	     
//	     
//	 
//	 }
         
     
     /**					
	 * feed the Tamagoshi to get his hungerPoints and moodPoints up!
	 * 
	 * @param meal, the food we'll feed to the tamagoshi
	 */
	  
	 public void eat (Food meal){
	     
	     if (hungerPoints == maxHunger){
	          System.out.println("I'm not hungry dude !");
	     }
	     
	     else
	     {
	          changeHungerPoints(meal.getHunger());
	          changeMoodPoints(meal.getMood());
	          changeHealthPoints(meal.getHealth());
	     }
	     
	 }
	 
	 /**					
	 * make the tamagoshi go to sleep so his energy and mood go up and hunger go down
	 * 
	 */
	 public void sleep(){
	     if (sleeping()){
	          System.out.println("shhhhhht! He's sleeping!");
	     }
	     else{
	          if (energyPoints >= maxEnergy){
	               System.out.println("I'm not tired Dude !!");
	          }  
	          
	          else{
	               changeEnergyPoints(maxEnergy/2);
	               changeMoodPoints(energyPoints/2);
	               changeHungerPoints(-(maxHunger/2));
	               changeHealthPoints(maxHealth/5);
	          }
          }
	 
	 }
	 
	 
	 /**					
	 * make the tamagoshi go to sleep so his energy and mood go up and hunger go down
	 * 
	 */
	 public void play(Games game){
	     if( energyPoints == maxEnergy){
	          System.out.println("I'm really tired dude !");
	     }
	     
	     else{
	          if (moodPoints == maxMood){
	               System.out.println("I'm really happy !");
	          }
	          else{
	               changeMoodPoints(game.getMood());
	               changeEnergyPoints(game.getFatigue());
	               changeHungerPoints(game.getHunger());
	               changeHealthPoints(game.getHealth());
	          }
	     }
	 }
     


     public boolean isDead(){
          if (healthPoints <= 0) return true;
          else return false;
     }
     
     
     public String toString(){
          String output = "My name is : "+name+
                              "\nI'm "+age+" years old!" +
                              "\n Health : " +healthPoints + "/100"+
                              "\n Energy : " +energyPoints + "/100"+
                              "\n Hunger : " +hungerPoints + "/100"+
                              "\n Mood : " + moodPoints + "/100";
                              
                              return output;
     }
     
     
     
     
     
     
     
     
     
     

}
