package JavaPractice.JavaConcepts;

//Dog object using array 
public class DogObject {

    String name;
    public static void main(String[]  args){

        Dog d1= new Dog();
        d1.bark();
        d1.name="UNO";

        Dog[] myDogs= new Dog[3];

        myDogs[0]= new Dog();
        myDogs[1]= new Dog();
        myDogs[2]= d1;

        myDogs[0].name="Nilay";
        myDogs[1].name="Paawan";

        System.out.println("Last DOg's name is ");
        System.out.println(myDogs[2].name);

        int x= 0;
        while (x<myDogs.length){
            myDogs[x].bark();
            x=x+1;
        }
        }
        public void bark(){
            System.out.println(name + " Says Ruff" );
        }
    
}
