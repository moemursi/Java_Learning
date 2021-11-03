import java.util.Scanner;

public class Division {
    //class division
    //scanner
    Scanner input = new Scanner(System.in);
    //divide method
    public int divide() throws ArithmeticException
     {

        //prompt user for input
        System.out.print("Enter a number: ");
        //get input
        int num1 = input.nextInt();
        //prompt user for input
        System.out.print("Enter another number: ");
        //get input
        int num2 = input.nextInt();
        //divide num1 by num2
        int result = num1 / num2;
        //return result
        return result;

        
    }


    
}
