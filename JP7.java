package JavaPractice;

public class JP7 {

    public static void main(String [] args )
     {
         double First = 20.00;
         double second = 80.00;

         double result = 100 * (First + second);
        
         System.out.println("Result = " + result );
         double remainder = (result % 40.00 );

         System.out.println("Remainder = " + remainder);

         boolean value = (remainder == 0 ) ? true: false;

         System.out.println("is Remainder =" + value);

         if (remainder == 0){
             System.out.println(value);
             
         }
         else {
             System.out.println("Got some Remainder");
         }
        
    }
    
}
