package JavaPractice.JavaConcepts;

public class Clonearrary {

    public static void main(String [] args){

        int arr[]={1,23,1212,21};

        System.out.println("Printing Array");

        for(int i :arr)

            System.out.println("Array is: "+ i);
        
            System.out.println("Cloning of an Array");

            int clone[]=arr.clone();

            for(int j:clone){

                System.out.println(j);
            }




    }
    
}
