package JavaPractice.JavaConcepts;

class GoodDog {

    private int size;

    public int getSize(){
        return size;
    }

    public void setSize(int s){
        size= s;

    }
    void bark(){
        if(size>60){
            System.out.println("Woof!Woof");
        }else if(size>14){
            System.out.println("Ruff!Ruff");
        }else{
            System.out.println("Yip!Yip");
        }
    }
    
}

public class Encap{
    public static void main(String[] args){

        GoodDog d= new GoodDog();
        d.setSize(70);
        GoodDog d1= new GoodDog();
        d1.setSize(8);
        System.out.println("Dog one :" + d.getSize());
        System.out.println("Dog Two :" + d1.getSize());
        d.bark();
        d1.bark();
    }
}