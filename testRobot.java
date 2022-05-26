package JavaPractice.JavaConcepts;
//Class ,Object and constructor
public class testRobot {

    public static void main(String[] args){

       robot r1= new robot("Tom","Red",30);
      

       robot r2= new robot("Jerry","Blue",40);
     

       r1.introduceSelf();
       r2.introduceSelf();

       

    }
    
}
//Constructor 
class robot{

    String name;
    String color;
    int weight;

    robot(String givenName, String givenColor, int givenWeight){
        this.name=givenName;
        this.color=givenColor;
        this.weight=givenWeight;
    }

    void introduceSelf(){
        System.out.println("My name is = "+  this.name);
        System.out.println("My color is = "+ this.color);
        System.out.println("My weight is = " + this.weight);
    }
}
