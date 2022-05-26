package JavaPractice.JavaConcepts;

public class loopExap2 {

    public static void main(String[] args) {
        int x=0;
        int y=30;
        for ( int a =0 ;a<3;a++){
            for(int b=4;b>1;b--){
                x=x+3;
                y=y-2;
                if(x==6){
                    break;
                }
                 x=x+3;
            }
            y=y-2;
        }
        System.out.println(x + " " + y);
    }
    
}
