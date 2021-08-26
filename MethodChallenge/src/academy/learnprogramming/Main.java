package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        int results = calculateHighScorePosition(1500);
        displayHighScorePosition("Abhinay", results);

        displayHighScorePosition("Abhinay", calculateHighScorePosition(900));

        displayHighScorePosition("Abhinay", calculateHighScorePosition(400));

        displayHighScorePosition("Abhinay", calculateHighScorePosition(50));
    }

    public static int calculateHighScorePosition(int score) {
        int position = 4;
        if (score >= 1000) {
            position = 1;
        }
        else if (score >= 500) {
            position = 2;
        }
        else if (score >= 100) {
            position = 3;
        }
        return position;
    }
    public static void displayHighScorePosition(String name, int position) {
        System.out.println(name + " managed to get to " + position + " on the high school table.");
    }
}
























