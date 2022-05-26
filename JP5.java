package JavaPractice;

public class JP5 {

    //Char and String 

    public static void main(String[] args) {
        
        char myChar ='D';
        char myUnicodeChar = '\u0044';//Unicode representation

        System.out.println(myChar);
        System.out.println(myUnicodeChar);

        //String - Class "Sequence of Character"

        String myString="Hello";
        System.out.println(myString);

        myString = myString + "World";

        System.out.println(myString);

        String myNumber= "20";

        myNumber=  myNumber + "22";
        //Appending value 
        System.out.println(myNumber);

        myNumber = myNumber + " , Welcome";

        System.out.println(myNumber);

        

    }
    
}
