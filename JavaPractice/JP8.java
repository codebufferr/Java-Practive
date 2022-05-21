package JavaPractice;
// If-Else PRactice

public class JP8 {

    public static void main(String args[]){

        boolean gameover=true;
        int score=5000;
        int levelcompleted= 5;
        int bonus= 100;

        if(gameover){
            int finalScore =score + (levelcompleted * bonus);
            finalScore +=100;
            System.out.println("Your final Score =" + finalScore);
        }

        score =10000;
        levelcompleted = 8;
        bonus= 200;
        
        if(gameover){

            int finalScore = score + (levelcompleted * bonus);
            System.out.println("You new Final Score is =" + finalScore);
        }
    }
    
}
