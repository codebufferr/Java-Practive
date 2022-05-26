package JavaPractice.JavaConcepts;

import java.util.ArrayList;

public class Arraylist {

    public static void main(String[] args){

        ArrayList<String> myList= new ArrayList<>();

        //Adding an object to arraylist

        String a= new String("Whoooo");
        myList.add(a);

        String b= new String("OKOKOKO");
        myList.add(b);
        //Adding directly

        
        myList.add("12");

        myList.add("Wooof!!");

        System.out.println("Elements in List=" + myList);

        //Check the size

        int theSize= myList.size();

        System.out.println("Size of the List= " + theSize);

        //Get Element from the list

        Object o=myList.get(1);

        System.out.println("Object at index 1 =" + o);

        //Remove Element 

        myList.remove(2);
        int size=myList.size();

        System.out.println(size);

        //check whether element has been removed or not 

        System.out.println("New Array List: "+ myList);

        //Access the List element

        String access=myList.get(0);

        System.out.println("First Element: "+ access);

        //Set Element at index

        myList.set(1,"No No");

        System.out.println("Updated List: "+ myList);
        
    }
    
}
