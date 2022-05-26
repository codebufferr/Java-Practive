package JavaPractice.JavaConcepts;

public class AdditionofMultiDArray {

    public static void main(String[] args){
          int rows=2,coloumns=3;
        int a[][]={{1,2,3},{4,5,6}};
        int b[][]={{7,8,9},{10,11,12}};

        int c[][]= new int[rows][coloumns];

        for(int i=0;i<rows;i++){
            for(int j=0;j<coloumns;j++){
                c[i][j]= a[i][j] + b[i][j];

                System.out.print(c[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
    
}
