/*Name:Yujia JI
Student Number:A00246407
Projects doc: Die.java, DiceGame.java
*/
public class Die{
    private String name;
    private int numSides;
    private int currentSide;

    public String getName(){return name;};
    public int getNumSides(){return numSides;};
    public int getCurrent(){return currentSide;};

    //constructor A0:
    public Die(){
        name = "d6";
        numSides = 6;
        // currentSide = (int)(Math.random()*numSides + 1);
    }
    //A1
    public Die(int numSides){
        this.name = "d"+ numSides;
        this.numSides = numSides;
        // this.currentSide = (int)(Math.random()*numSides + 1);
    }
    //A2
    public Die(String name, int numSides){
        this.name = name;
        this.numSides = numSides;
        // this.currentSide = (int)(Math.random()*numSides + 1);
    }

    public void setRollSide (){
        currentSide = (int)(Math.random()*numSides + 1);// = [1,numsides]
    }
    public void setRollMax(){
        currentSide = numSides;// set max num side up
    }

}
