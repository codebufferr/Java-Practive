package JavaPractice.JavaConcepts;

class Dog{

    int size;
    String breed;
    String name;
    
    void bark(){
        System.out.println("Ruff, Ruff");
        System.out.println(" Name : "+ name );
    }
}

public class DogtestDrive {
    public static void main(String[] args){

        Dog d= new Dog();
        d.size=40;
        d.bark();
        Dog b = new Dog() ;
        b.name="Labra";
        
        b.bark();
    
    }    
}
