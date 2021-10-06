/*Name:Yujia JI
Student Number:A00246407
Program Description: DiceGame is a small command-line application that can create die objects
with String name, int number of sides, and int current side. In DiceGame.java, a new Die can be
created with three functions. With .setRollSide(), .setRollMax(). The upper side of the dice
can be changed. The final part is a for loop function to calculate the number of times to get
 5 of a kind.
*/
public class DiceGame{
    public static void main(String[] args){

       System.out.println("Ready to create 3 dice... ");
       Die bb6 = new Die();
       Die dd8 = new Die(8);
       Die yy10 = new Die("d10",10);
       Die[] diceArray = {bb6,dd8,yy10};
       //set 3 dice & make the object array

       System.out.println("Creating a default " +bb6.getName());
       System.out.println("Creating a default " +dd8.getName());
       System.out.println("Creating a default " +yy10.getName());
       bb6.setRollSide();
       dd8.setRollSide();
       yy10.setRollSide(); //dice currentside initialization -currentSide
       System.out.println("The current side up for " +bb6.getName() + " is " +bb6.getCurrent());
       System.out.println("The current side up for " +dd8.getName() + " is " +dd8.getCurrent());
       System.out.println("The current side up for " +yy10.getName() + " is " +yy10.getCurrent());

       System.out.println('\n'+"Testing the roll method"+'\n');
       bb6.setRollSide();
       dd8.setRollSide();
       yy10.setRollSide(); //set random side up - currentSide
       System.out.println("Rolling the " + bb6.getName() +'\n'+ "The new value is " + bb6.getCurrent());
       System.out.println("Rolling the " + dd8.getName() +'\n'+ "The new value is " + dd8.getCurrent());
       System.out.println("Rolling the " + yy10.getName() +'\n'+ "The new value is " + yy10.getCurrent()+'\n');

       int index = (int) (Math.random() *3); //choose random object to set setRollMax
       System.out.println("Setting the " + diceArray[index].getName() +" to show "+diceArray[index].getNumSides() +'\n');
       diceArray[index].setRollMax();//set numSides (maximun) = currentSide
       System.out.println("The side up is now " + diceArray[index].getCurrent()+'\n');

       //YAHTZEE
       System.out.println("Creating 5 d6...");
       Die[] dice5 = {new Die(),new Die(),new Die(),new Die(),new Die()};//object array

       int count = 0;
       for(int i=0;i<(6*6*6*6*6);i++){
           dice5[0].setRollSide();
           dice5[1].setRollSide();
           dice5[2].setRollSide();
           dice5[3].setRollSide();
           dice5[4].setRollSide();
           if (dice5[0].getCurrent() == dice5[1].getCurrent() && dice5[1].getCurrent() == dice5[2].getCurrent() && dice5[2].getCurrent() == dice5[3].getCurrent() && dice5[3].getCurrent() == dice5[4].getCurrent())
            {// if dice 0=1=2=3=4
                System.out.println("YAHTZEE! It took " +count +" rolls.");
                break;
            }
           count++;// null to finish 6^5
       }//end of for loop

   }//end of public static
}
