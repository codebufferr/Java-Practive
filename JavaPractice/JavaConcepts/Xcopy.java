package JavaPractice.JavaConcepts;

public class Xcopy {
    public static void main(String[] args) {

        int orignal= 42;
         
        Xcopy x= new Xcopy();


        int y=x.go(orignal);

        System.out.println(orignal + " " + y);
        
    }
    int go(int arg){
        arg= arg*2;

        return arg;

    }
    
}
