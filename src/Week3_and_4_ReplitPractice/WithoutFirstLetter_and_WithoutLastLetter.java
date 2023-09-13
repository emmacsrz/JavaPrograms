package Week3_and_4_ReplitPractice;

import java.util.Scanner;

public class WithoutFirstLetter_and_WithoutLastLetter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word1 = scan.next();
        String word2 = scan.next();

        //WRITE YOUR CODE BELOW
        if (word1.length() == 3 && word2.length() == 3 ){
            String merged= "";
            merged +=word1.charAt(0); //gives merged + first character of word1, stores in variable.
            merged +=word2.charAt(0);
            merged +=word1.charAt(1);
            merged +=word2.charAt(1);
            merged +=word1.charAt(2);
            merged +=word2.charAt(2);
            System.out.println(merged);
            } else {
                System.out.println("cannot merge");
            }




    }
}