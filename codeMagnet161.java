package JavaPractice.JavaConcepts;

import java.util.*;

public class codeMagnet161 {

    public static void main(String[] args){

        ArrayList<String> a = new ArrayList<String>();
        a.add(0,"Zero");
        a.add(1,"One");
        a.add(2,"Two");
        a.add(3,"Three");

        System.out.println(a);
        
        if(a.contains("Three")){
            a.add("Four");

        }
        a.remove(2);
        if(a.indexOf("Four") != 4){
            a.add(4,"4.2");
        }

        if(a.contains("Two")){
            a.add("2.2");
        }
       
        System.out.println(a);

    }

       public static void  printAl(ArrayList<String> al) {
           for(String element:al){
               System.out.print(element + " ");
           }
           System.out.println();
            

          
       


    }
    

}