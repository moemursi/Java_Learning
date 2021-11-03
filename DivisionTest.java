public class DivisionTest {
    //main method
    public static void main(String[] args) {
        //create a new Division object
        Division division = new Division();
        //call the division method
        try {
            int result = division.divide();
            //print the result
            System.out.println("The result is " + result);

        } catch (Exception e) {
            //TODO: handle exception
            System.out.println("Error: " + e.getMessage());
        }
        //all operations are done
        System.out.println("All operations are done");
        //close input
        
    }
    
}
