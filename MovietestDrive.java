package JavaPractice.JavaConcepts;

class Movie{
    String title;
    String genra;
    int rating;

    void PlayIt(){

        System.out.println("Playing for you ");
        System.out.println("Genra: "+ genra);
        
    }
}

public class MovietestDrive {

    public static void main(String[] args){

        Movie one = new Movie();
        one.title="Doctor Strange";
        one.genra="Avenger Stuff";
        one.rating= 6;
        one.PlayIt();

        Movie two = new Movie();
        two.title="Spiderman";
        two.genra="No way Home";
        two.rating= 9;
        two.PlayIt();

        Movie three = new Movie();
        three.title="Indian Polity";
        three.genra="She/Her";
        three.rating=9;
        three.PlayIt();

    }
    
}
