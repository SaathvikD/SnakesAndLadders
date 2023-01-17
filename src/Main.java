import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.*;

public class Main {
    String red,green,blue,yellow;
    public Player r,b,g,y;

    ArrayList<Player> ppl = new ArrayList<Player>();

    public Main(){

    }
    private void playGame() {
        boolean a = true;
        addPlayers();
        Scanner keyboard = new Scanner( System.in );
        int original;
        int turn;
        int diff;

        JFrame frame = new JFrame();
        BackgroundRunner panel = new BackgroundRunner();
        Image img2 = Toolkit.getDefaultToolkit().getImage("Board Layout.jpg");
        frame.add(panel);
        frame.setSize(600, 600);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        while(a){
            int z = ppl.size();
            if(z>0 && a==true){
                System.out.println(r.getName() + "'s Turn!");
                if(keyboard.next().equals( "r")){
                    BackgroundRunner.redMove(panel);
                    original = r.getSpot();
                    turn = r.turn();
                    diff = turn - original;
                    if (diff > 6){
                        System.out.println(r.getName() + " to --> " + turn + " with a ladder!");
                    }
                    else if (diff < 0){
                        System.out.println(r.getName() + " to --> " + turn + " by a snake!");
                    }
                    else {
                        System.out.println(r.getName() + " to --> " + turn);
                    }
                }
                if(r.getSpot() == 100){
                    System.out.println("The winner is " + r.getName() + "!");
                    a=false;
                }

                //----

                if(z>1 && a==true){
                    System.out.println(b.getName() + "'s Turn!");
                    if(keyboard.next().equals("b")){
                        original = b.getSpot();
                        turn = b.turn();
                        diff = turn - original;
                        if (diff > 6){
                            System.out.println(b.getName() + " to --> " + turn + " with a ladder!");
                        }
                        else if (diff < 0){
                            System.out.println(b.getName() + " to --> " + turn + " by a snake!");
                        }
                        else {
                            System.out.println(b.getName() + " to --> " + turn);
                        }
                        BackgroundRunner.blueMove(panel);

                    }
                    if(b.getSpot() == 100){
                        System.out.println("The winner is " + b.getName() + "!");
                        a=false;
                    }

                    //------

                    if(z>2 && a==true){
                        System.out.println(g.getName() + "'s Turn!");
                        if(keyboard.next().equals("g")){
                            original = g.getSpot();
                            turn = g.turn();
                            diff = turn - original;
                            if (diff > 6){
                                System.out.println(g.getName() + " to --> " + turn + " with a ladder!");
                            }
                            else if (diff < 0){
                                System.out.println(g.getName() + " to --> " + turn + " by a snake!");
                            }
                            else {
                                System.out.println(g.getName() + " to --> " + turn);
                            }
                            BackgroundRunner.greenMove(panel);

                        }
                        if(g.getSpot() == 100){
                            System.out.println("The winner is " + g.getName() + "!");
                            a=false;
                        }

                        //----

                        if(z>3 && a==true){
                            System.out.println(y.getName() + "'s Turn!");
                            if(keyboard.next().equals("y")){
                                original = y.getSpot();
                                turn = y.turn();
                                diff = turn - original;
                                if (diff > 6){
                                    System.out.println(y.getName() + " to --> " + turn + " with a ladder!");
                                }
                                else if (diff < 0){
                                    System.out.println(y.getName() + " to --> " + turn + " by a snake!");
                                }
                                else {
                                    System.out.println(y.getName() + " to --> " + turn);
                                }
                                BackgroundRunner.yellowMove(panel);

                            }
                            if(y.getSpot() == 100){
                                System.out.println("The winner is " + y.getName() + "!");
                                a=false;
                            }
                        }
                    }
                }
            }
            System.out.println("---");
         }
        //runGraphics();
    }

    private void runGraphics(){
    }

    private void addPlayers(){

        Scanner keyboard = new Scanner( System.in );
        System.out.println("How many people are playing?");
        int numOfPlayers = keyboard.nextInt();

        switch(numOfPlayers){
            case 1:
                System.out.println("Red player's name:" );
                red = keyboard.next();//gets a String
                r = new Player(red);
                ppl.add(r);
                break;
            case 2:
                System.out.println("Red players name:" );
                red = keyboard.next();//gets a String
                System.out.println("Blue players name:" );
                blue = keyboard.next();//gets a String
                r = new Player(red);
                b = new Player(blue);
                ppl.add(r);
                ppl.add(b);
                break;
            case 3:
                System.out.println("Red players name:" );
                red = keyboard.next();//gets a String
                System.out.println("Blue players name:" );
                blue = keyboard.next();//gets a String
                System.out.println("Green players name:" );
                green = keyboard.next();//gets a String
                r = new Player(red);
                b = new Player(blue);
                g = new Player(green);
                ppl.add(r);
                ppl.add(b);
                ppl.add(g);
                break;
            case 4:
                System.out.println("Red players name:" );
                red = keyboard.next();//gets a String
                System.out.println("Blue players name:" );
                blue = keyboard.next();//gets a String
                System.out.println("Green players name:" );
                green = keyboard.next();//gets a String
                System.out.println("Yellow players name:" );
                yellow = keyboard.next();//gets a String
                r = new Player(red);
                b = new Player(blue);
                g = new Player(green);
                y = new Player(yellow);
                ppl.add(r);
                ppl.add(b);
                ppl.add(g);
                ppl.add(y);
                break;
        }
        if (numOfPlayers > 4 || numOfPlayers < 1){
            System.out.println("This game is for 1 to 4 players!");
            addPlayers();
        }
    }
    public static void main(String[] args) throws InterruptedException {
        Main hi = new Main();
        System.out.println("Welcome to Snakes and Ladders");
        Thread.sleep(1000);
        System.out.println("The objective of this game is to get to Spot 100 first based off the rolls you get");
        Thread.sleep(1000);
        System.out.println("However if you land on a snake head you will go down spots and if you land on a ladder, you will go up");
        Thread.sleep(1000);
        System.out.println("This game can support up to 4 players and they are categorized in the following colors:");
        Thread.sleep(1000);
        System.out.println("Red Blue Green and Yellow");
        Thread.sleep(1000);
        System.out.println("When it is that players turn you push the key on the keyboard corresponding to your color then push enter, for example r for red b for Blue etc. (make sure it's lowercase)");
        Thread.sleep(1000);
        hi.playGame();
    }
    private int pixelX(int spot){
        if ((spot / 10) % 2 == 1) {
            return (28 + (spot*50));
        }
        else{
            return (525 - (spot*50));
        }
    }
    private int pixelY(int spot){
        if (spot > 0 && spot < 11){
            return 525;
        }
        if (spot > 10 && spot < 21){
            return 470;
        }
        if (spot > 20 && spot < 31){
            return 415;
        }
        if (spot > 30 && spot < 41){
            return 360;
        }
        if (spot > 40 && spot < 51){
            return 305;
        }
        if (spot > 50 && spot < 61){
            return 250;
        }
        if (spot > 60 && spot < 71){
            return 195;
        }
        if (spot > 70 && spot < 81){
            return 140;
        }
        if (spot > 80 && spot < 91){
            return 85;
        }
        if (spot > 90 && spot < 101){
            return 30;
        }
        return 0;
    }
}



