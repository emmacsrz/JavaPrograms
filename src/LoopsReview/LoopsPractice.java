package LoopsReview;
import java.util.Scanner;
//this class is for practicing removing duplicates, counting characters, and string reverse. Correct codes are in the comments at the bottom.


public class LoopsPractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        String result ="";








    }
}










    /* Removing duplicates:
       for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);
            if (result.contains(""+ ch)){
                continue;
            }
            result+=ch;
        }
        System.out.println(result);*/







/*Counting characters and printing answer without duplicates:
        for (int i = 0; i < str.length(); i++) {

            if (result.contains(""+ str.charAt(i))) {
                continue;
            }//if statement end
            int count=0; //count variable, local to the loop
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }//inner loop end
                result +=  ""+ count + str.charAt(i);

        }//outer loop end
        System.out.println(result);

 */