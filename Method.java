package JavaPractice.JavaConcepts;

public class Method {

    public static void main(String[] args){

        boolean gameOver= true;
        int score =800;
        int levelCompleted=5;
        int bonus=100;
        

        int highScore= calculateScore(gameOver, score, levelCompleted,bonus);
        System.out.println("Your Final Score wass: " + highScore);

        score=10000;
        levelCompleted = 8;
        bonus=200;

        highScore= calculateScore(gameOver , score, levelCompleted, bonus);
        System.out.println("Your final Score is "+ highScore);

        int highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Tahir" , highScorePosition);

        highScorePosition = calculateHighScorePosition(500);
        displayHighScorePosition("Divya " , highScorePosition);

        highScorePosition = calculateHighScorePosition(10000);
        displayHighScorePosition("Piysuh" , highScorePosition);

        highScorePosition = calculateHighScorePosition(1203);
        displayHighScorePosition("Isha" , highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Kapil" , highScorePosition);
    }

    public static void displayHighScorePosition(String playerName, int highScorePosition){
        System.out.println(playerName + " managed to get into postion "+ highScorePosition + " on the high score table");
    }

    public static int calculateHighScorePosition(int playerScore){
        if(playerScore >=1000){
            return 1;
        }else if(playerScore>=500 && playerScore <1000){
            return 2;
        }else if(playerScore>=100 && playerScore<500){
            return 3;
        }else if (playerScore < 100) {
            return 0;

        }else {
            return 4;
        }
    }

    public static int calculateScore(boolean gameOver,int score , int levelCompleted, int bonus){

    if(gameOver){
        int finalScore= score + (levelCompleted * bonus);
        finalScore= finalScore + 2000;
        return finalScore;
    }

    return -1;
}

    
}   
   