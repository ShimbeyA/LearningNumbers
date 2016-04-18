package sassie.greenrivertech.net.learningnumbers;

import java.util.Random;

/**
 * Created by Sassie on 4/14/2016.
 */
public class LearningNumbersModel {
    private int button1;
    private int button2;
    private int gamesPlayed;
    private int gamesWon;
    public static final int LeftFirst = 0;
    public static final int LeftSecond = 1;


    public LearningNumbersModel() {
        generateNumber();
        gamesPlayed = 0;
        gamesWon = 0;


    }


    public boolean play(int choice) {
        gamesPlayed++;

        if (choice == LeftFirst && button1 > button2) {
            gamesWon++;
            return true;
        } else if (choice == LeftSecond && button2 < button1) {
            gamesWon++;
            return true;
        } else {
            return false;
        }


    }

    public int getButton1() {
        return button1;

    }

    public int getButton2() {
        return button2;

    }
    public int getGamesPlayed() {
        return gamesPlayed;

    }
    public int getGamesWon(){
        return gamesWon;
    }

    public void generateNumber() {
        Random rand = new Random();
        button1 = rand.nextInt(10) + 1;
        button2 = rand.nextInt(10) + 1;


    }
}