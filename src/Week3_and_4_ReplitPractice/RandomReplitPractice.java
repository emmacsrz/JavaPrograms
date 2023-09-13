package Week3_and_4_ReplitPractice;
import java.util.Scanner;

public class RandomReplitPractice {
    public static void main(String[] args) {


        //DO NOT TOUCH FOLLOWING LINE/LINES
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        //WRITE YOUR CODE BELOW


        int middle =word.length()/2;

        if (middle==0) {
            System.out.println("" + word.charAt(middle - 1) + word.charAt(middle));
        } else {
            System.out.println(word.charAt(word.length() / 2));
        }
        if(word.length()/2 == 1){
            System.out.println(word.charAt(0) + word.charAt(1));
        }

        /*
        if (word.length() % 2 == 0) {
            System.out.println("" + word.charAt(word.length() / 2 - 1) + word.charAt(word.length()) / 2);
        } else {
            System.out.println(word.charAt(word.length() / 2));
        }
*/

    }

}
