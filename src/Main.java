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
        frame.setSize(650, 650);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        while(a){
            int z = ppl.size();
            if(z>0 && a==true){
                System.out.println(r.getName() + "'s Turn!");
                if(keyboard.next().equals( "r")){

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
                    BackgroundRunner.redMove(panel,pixelX(r.getSpot()), pixelY(r.getSpot()));
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
                        BackgroundRunner.blueMove(panel,pixelX(b.getSpot()), pixelY(b.getSpot()));

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
                            BackgroundRunner.greenMove(panel,pixelX(g.getSpot()), pixelY(g.getSpot()));

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
                                BackgroundRunner.yellowMove(panel,pixelX(y.getSpot()), pixelY(y.getSpot()));

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
        if(spot == 1 || spot == 20 || spot ==21||spot == 40||spot ==41||spot==60||spot==61||spot == 80||spot==81||spot ==100){
            return 55;
        }
        if(spot == 2 || spot == 19 || spot ==22||spot == 39||spot ==42||spot==59||spot==62||spot == 79||spot==82||spot ==99){
            return 110;
        }
        if(spot == 3 || spot == 18 || spot ==23||spot == 38||spot ==43||spot==58||spot==63||spot == 78||spot==83||spot ==98){
            return 165;
        }
        if(spot == 4 || spot == 17 || spot ==24||spot == 37||spot ==44||spot==57||spot==64||spot == 77||spot==84||spot ==97){
            return 220;
        }
        if(spot == 5 || spot == 16 || spot ==25||spot == 36||spot ==45||spot==56||spot==65||spot == 76||spot==85||spot ==96){
            return 275;
        }
        if(spot == 6 || spot == 15 || spot ==26||spot == 35||spot ==46||spot==55||spot==66||spot == 75||spot==86||spot ==95){
            return 330;
        }
        if(spot == 7 || spot == 14 || spot ==27||spot == 34||spot ==47||spot==54||spot==67||spot == 74||spot==87||spot ==94){
            return 385;
        }
        if(spot == 8 || spot == 13 || spot ==28||spot == 33||spot ==48||spot==53||spot==68||spot == 73||spot==88||spot ==93){
            return 440;
        }
        if(spot == 9 || spot == 12 || spot ==29||spot == 32||spot ==49||spot==52||spot==69||spot == 72||spot==89||spot ==92){
            return 495;
        }
        if(spot == 10 || spot == 11 || spot ==30||spot == 31||spot ==50||spot==51||spot==70||spot == 71||spot==90||spot ==91){
            return 550;
        }
        return 0;
    }
    private int pixelY(int spot){
        if (spot > 0 && spot < 11){
            return 545;
        }
        if (spot > 10 && spot < 21){
            return 490;
        }
        if (spot > 20 && spot < 31){
            return 435;
        }
        if (spot > 30 && spot < 41){
            return 380;
        }
        if (spot > 40 && spot < 51){
            return 325;
        }
        if (spot > 50 && spot < 61){
            return 270;
        }
        if (spot > 60 && spot < 71){
            return 215;
        }
        if (spot > 70 && spot < 81){
            return 160;
        }
        if (spot > 80 && spot < 91){
            return 105;
        }
        if (spot > 90 && spot < 101){
            return 55;
        }
        return 0;
    }
}



