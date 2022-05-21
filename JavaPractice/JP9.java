package JavaPractice;
//Method in Java
public class JP9 {

    public static void main(String args[]){

        boolean gameover=true;
        int score = 2000;
        int levelcompleted= 5;
        int bonus = 100;

        calculateScore(gameover,score,levelcompleted,bonus);

        score= 1000;
        levelcompleted=9;
        bonus=1000;

        calculateScore(gameover,score,levelcompleted,bonus);

    }

    public static int  calculateScore(boolean gameover,int score,int levelcompleted,int bonus){
        if(gameover){
            int finalScore= score +(levelcompleted*bonus);
            finalScore +=1000;
            System.out.println("Your final Score is =" + finalScore);
            return finalScore;
        
        }
    return -1;
    
    }
    
}
