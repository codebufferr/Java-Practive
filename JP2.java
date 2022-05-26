//To check Minimum & Maximum value of DT

package JavaPractice;

public class JP2 {

    public static void main(String[] args) {
        //same for byte ,short , long & double 

        
        int myMaxValue = Integer.MAX_VALUE;
        int myMinValue = Integer.MIN_VALUE;

        System.out.println("Maximum Value = " + myMaxValue);
        System.out.println("Minimum value = "+ myMinValue);

        //Overflow

        System.out.println("Busted Min Value = " + (myMinValue -1 ));
        System.out.println("Busted Max Value = " + (myMaxValue + 1));


        
    }
    
}
