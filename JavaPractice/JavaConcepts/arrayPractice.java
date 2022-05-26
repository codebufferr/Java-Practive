package JavaPractice.JavaConcepts;
//Passing annymous array 
public class arrayPractice {

    static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++)
        System.out.println(arr[i]);
    }
    public static void main(String[] args) {
        printArr(new int[]{10,22,11,14});
        int array[]=get();
        for(int j=0;j<array.length;j ++){
            System.out.println(array[j]);
        }
    }

    static int[] get(){
        return new int[]{19,11,32,112}; 
    }

}
