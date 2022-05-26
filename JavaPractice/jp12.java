package JavaPractice;
//BeerSong 
public class jp12 {

    public static void main(String[] args){

        int beerNum=5;
        String word="bottles";

        while(beerNum>0){

            if(beerNum==1){
                word ="bottle";
            }
            System.out.println(beerNum + " " + word + "beer on the wall");
            System.out.println(beerNum + " " + word + " of beer.");
            System.out.println("Take one down");
            System.out.println("Pass it around");
            beerNum = beerNum - 1;

            if(beerNum>0){
                System.out.println(beerNum +" "+ word + " beer on the wall ");
            }else{

                System.out.println("No more bottle on the wall ");
            }
        }
    }
    
}
