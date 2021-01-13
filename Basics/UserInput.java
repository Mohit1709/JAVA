
// for Taking input from user we have to
// import Scanner object from java.util pacakage 
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        // Creating a Scanner object
        Scanner input = new Scanner(System.in);

        // Declaring constant variable of double type
        final double METER_PER_FOOT = 0.305;

        System.out.print("\nEnter A value for feet : ");
        // using nextDouble method of scanner object
        // only for storing input of double type
        double feet = input.nextDouble();

        // After the use of Scanner is finised, remember to Close it
        // as Closing Scanner is mandatory
        input.close();

        // Convert feet into meters
        double meters = feet * METER_PER_FOOT;

        // Printing result
        System.out.println(feet + " feet is " + meters + "meters\n");

    }
}
