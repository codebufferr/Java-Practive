package JavaPractice.JavaConcepts;
//Passing array to the method


public class arrayPractive1 {
  

    static void min(int arr[]){
        int min=arr[0];

        for(int i=0;i<arr.length;i++)
            if(min>arr[i])
                min=arr[i];
            
            System.out.println(min);
        
        }
    
    
    public static void main(String[] args) {
        int a[]={12,4,2,12,5};
        min(a);
    }


    
}
