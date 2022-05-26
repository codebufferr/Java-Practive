package JavaPractice.JavaConcepts;



class clock {
    String time;


void setTime(String t){
    time =t;

}
String getTime(){
    return time;
}

}
public class ClockTestDrive {
    public static void main(String[] args){

        clock c= new clock();

        c.setTime("1232");

        String tod= c.getTime();

        System.out.println("Time: "+ tod);


    }
}
    

