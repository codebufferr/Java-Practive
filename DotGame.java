package JavaPractice.JavaConcepts;

public class DotGame {


    public static void main (String[] args ){

        SimpleDotGame dot = new SimpleDotGame();

        int[] location ={2,3,4};

        dot.setLocationCells(location);

        String userGuess="5";

        String result =dot.checkYourself(userGuess);
    }
}

