package JavaPractice.JavaConcepts;

public class arrayPractive {

    public static void main(String[] args ){

        int a[]= new int[5];//or int a[]={1,2,3,1,2,123,}

        a[0]=12;
        a[1]=21;
        a[2]=231;
        a[3]=1221;
        a[4]=124;
        //a[5]=152;

        for(int i=0;i<a.length;i++){

            System.out.println(a[i]);
        }
    }
    
}
