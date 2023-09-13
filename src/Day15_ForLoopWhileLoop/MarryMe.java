package Day15_ForLoopWhileLoop;
import java.util.Scanner;

public class MarryMe {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Will you marry me?");
        String response = input.next();

        while(!(response.equals("yes") || response.equals("no"))){
            System.out.println("invalid response, please re-enter:");
            response= input.next();
        }

        if (response.equals("yes")){
            System.out.println("congrats.");
        }else{
            System.out.println("Goodbye.");
        }





        /*
        1.  Create a class named Marriage proposal and Write a program for the  marriage proposal program asking the user, "Will you marry me?"
        if the answer is yes, print "Congrats."
        if the answer is no, print "Goodbye"
        if the answer is neither yes nor no, print "Invalid answer, please re-enter" and repeat it until the user enters either yes or no
*/
    }
}
