import java.util.Scanner;

public class Driv {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int courses = 0;
        double [] marks ;
        System.out.println("Enter number of courses : ");  // based on number of courses
        courses = keyboard.nextInt();
        marks = new double[courses];
        int no = 0;
        if(no< marks.length){
            for (int i=0;i<marks.length;i++) {
                System.out.println("Enter mark " + (i + 1));
                marks[i] = keyboard.nextDouble();
                no+=1;
            }
        }
        int sum =0;
        for (double mark:marks) sum += mark;
        System.out.println(sum);
        System.out.print(marks.length);
        double gpa =0.0;
        final double MAX_GPA = 4.0;
        final int MARKS = 100;
        double percentage = sum/marks.length;
         gpa = percentage/MARKS * MAX_GPA;

        System.out.println("GPA IS "+ gpa);
    }
    
}
