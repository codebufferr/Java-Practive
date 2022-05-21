package JavaPractice;


public class JP6 {
    //Operator =,-,*,/ 

    public static void main(String[] args) {
        
        int number1= 4;
        int number2= 5;

        int total = number1 + number2;

        System.out.println("Total = " + total);

        int result = total - 1;

        System.out.println("Result = " + result);

        result = result * 10;

        System.out.println("Multiplication Result = "+ result);

        result = result / 5;

        System.out.println("Division Result =" + result);

        result = result % 3;//To get Remainder 

        System.out.println("Remainder = " + result);
    }
    
}
