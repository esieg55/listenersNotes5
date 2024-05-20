import javax.swing.*;

public class Guessing {

    private int starter;
    private int level = 1;


   //private int eachIncrease = 10;

    public Guessing(int s, int l){
        starter = s;
        //position = p;
        level =l;
        //eachIncrease = eI;
    }


    public String startLevel(){
        int eachIncrease = 5;

       if(level == 1){
        starter= (int)(Math.random()*10)+1;
                //+eachIncrease;
        return "New random number created, attempt your guesses"; }
       else {

           starter= (int)(Math.random()*10)+eachIncrease;
// random not working right talk to seaver
           level= level+1;
           return "New random number created, attempt your guesses"; }
       }



    public void setLevel(int set) {
        level = set;

    }
public int getLevel(){
        return level;
}



    public String guess(int g) {
        String position = " ";
            if (g == starter) {
                position = "You won the game";
                JOptionPane.showMessageDialog(null,"WINNER");


            } else if (g > starter) {
                position = "Too high guess again";
            }
        else{
            position="Too low guess again.";
            }
return position;
    }




}
