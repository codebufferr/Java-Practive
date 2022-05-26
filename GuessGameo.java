package JavaPractice.JavaConcepts;



 class GuessGameer {

    layer p1;
    layer p2;
    layer p3;
    
    public void startGame(){
        p1= new layer();
        p2=new layer();
        p3= new layer();

        int g1=0;
        int g2=0;
        int g3=0;

        boolean p1isRight= false;
        boolean p2isRight=false;
        boolean p3isRight=false;

        int targetNumber =(int)(Math.random()*10);
        System.out.println("I'm thinking of a number between 0 and 9 ...");

        while(true){
            System.out.println("Number to guess is "+ targetNumber);

            p1.guess();
            p2.guess();
            p3.guess();

            g1 = p1.number;
            System.out.println("Player One Guessed: " + g1);

            g2=p2.number;
            System.out.println("Player Two Guesses : "+ g2);

            g3=p3.number;
            System.out.println("Player Three Guessed : "+ g3);
            
            if(g1==targetNumber){
                p1isRight =true;
            }
            if(g2==targetNumber){
                p2isRight=true;

            }
            if(g3==targetNumber){
                p3isRight= true;

            }

            if(p1isRight || p2isRight || p3isRight){

                System.out.println("We have a winner ");
                System.out.println(" Player one got it RIght? " + p1isRight);
                System.out.println("Player got it right? : "+ p2isRight);
                System.out.println("Player three is got right? "+ p3isRight);
                System.out.println("Game over ");
                break;
            }else{
                System.out.println("Player have to guess again");
            }
        }
    }


    
}
 class layer{
    int number=0;


public void guess(){
    number = (int)(Math.random()*10);
    System.out.println("I'm Guessing :" + number);
}
}
public class GuessGameo{
    public static void main (String args[]){
        GuessGameer game= new GuessGameer();
        game.startGame();
    }
}
