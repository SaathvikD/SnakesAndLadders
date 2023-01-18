import java.awt.*;
import javax.swing.*;

public class Player {
    public int spot;
    public String name;
    //private String col;



    public Player(String a){
        spot = 1;
        name = a;
        //col = color;
    }

    public boolean Winner(){
        if(spot == 100){
            return true;
        }
        return false;
    }

    public int getSpot() {
        return spot;
    }
    public String getName(){
        return name;
    }



    //plays a players turn, updates spot, and moves player, return true if they won
    public int turn() {
        int roll = (1 + (int) (Math.random() * 6));
        if (spot + roll > 100){
            System.out.println("You rolled too high loser");
            return spot;
        }
        spot += roll;


        switch(spot){
            case 4:
                spot = 25;
                break;
            case 13:
                spot = 46;
                break;
            case 27:
                spot = 5;
                break;
            case 33:
                spot = 49;
                break;
            case 40:
                spot = 3;
                break;
            case 42:
                spot = 63;
                break;
            case 43:
                spot = 18;
                break;
            case 50:
                spot = 69;
                break;
            case 54:
                spot = 31;
                break;
            case 62:
                spot = 81;
                break;
            case 66:
                spot = 45;
                break;
            case 74:
                spot = 90;
                break;
            case 76:
                spot = 58;
                break;
            case 89:
                spot = 53;
                break;
            case 99:
                spot = 41;
                break;

        }
        return (spot);
    }
}

