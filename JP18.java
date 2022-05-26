package JavaPractice;

public class JP18 {

    public static void main(String[] args){
        

        int[] index= new int[4];
        index[0]=1;
        index[1]=3;
        index[2]=0;
        index[3]=2;

        String[] islands = new String[4];
        islands[0]="Noida";
        islands[1]="Delhi";
        islands[2]="Lucknow";
        islands[3]="Mumbai";

        int y=0;
        
        while(y<4) {
        

            int ref = index[y];
            System.out.print("island = ");
            System.out.println(islands[ref]);
            y=y+1;
            
            
            

        }




    }
    
}
