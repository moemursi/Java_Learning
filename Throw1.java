import java.util.Scanner;
public class Throw1 {
    //main method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = 0 ,den = 0;
    //try block
    try {
        System.out.print("Enter a numerator: ");
        num = input.nextInt();
        System.out.print("Enter a denominator: ");
        den = input.nextInt();
        //if denominator is 0, throw exception
        if (den == 0) {
            throw new ArithmeticException("Denominator cannot be 0");
        }
        //if denominator is not 0, print the result
        else {
            System.out.println("Result: " + num / den);
        }
        
    }catch (ArithmeticException e) {
        System.out.println(e);
    }
    catch (Exception e) {
        System.out.println("Invalid input");
    }
    finally {
        System.out.println("Program terminated");
        input.close();
    }
    }

}