import java.util.Scanner;

public class Except {

    public static void main(String[] args) {
        int num = 0;
        int den = 0;
        try {
            //scanner
            Scanner input = new Scanner(System.in);
            System.out.println("Math calculator");
            //enter a numerator
            System.out.println("Enter a numerator: ");
            num = input.nextInt();
            //enter a denominator
            System.out.println("Enter a denominator: ");
            den = input.nextInt();
            //calculate the quotient
            System.out.println("The quotient is: " + num / den);
            //close input
            input.close();
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        //PRODUCT IS

        System.out.println("The product is: " + num * den);
        // print operation done
        System.out.println("Operation done");
    }

    //end of main
    }
//end of class
