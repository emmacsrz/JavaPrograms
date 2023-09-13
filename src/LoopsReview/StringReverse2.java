package LoopsReview;
import java.util.Scanner;
public class StringReverse2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("please enter a sentence:");
        String str = input.nextLine();
        String reverse= "";

        for (int i = str.length()-1; i >=0 ; i--) {
            char ch = str.charAt(i);
            reverse+=ch;

        }
        System.out.println(reverse);



    }
}
