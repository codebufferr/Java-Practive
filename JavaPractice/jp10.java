package JavaPractice;

//Basic while loop 
public class jp10 {
    
    public static void main(String [] args){

        int x= 1;

        System.out.println("Before the loop");

        while(x<4){

            System.out.println("In the loop");

            System.out.println("Value of x "+ x);
            x=x+1;
        }
        System.out.println("This is after loop");
    }
    
}
