package LoopsReview;
import java.util.Scanner;
public class LoopsIntro1 {
    public static void main(String[] args) {

 //sum of all numbers 1-100:
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println(sum);


//print alphabet:
        for (char i = 'a'; i <= 'z'; i++) {
            System.out.print(i + " ");
        }


//Alphabet in reverse:
        System.out.println();
        for (char i = 'z'; i >= 'a'; i--) {
            System.out.print(i + " ");
        }
        System.out.println();


//string reverse:  (NOT CORRECT, NEED HELP)
        String str = "racecar backwards is racecar";
        for (int i = 0; i <= str.length() - 1; i++) {
            char ch = str.charAt(i);
            System.out.print(ch);
        }



        System.out.println();


//using loop with scanner:
        Scanner input = new Scanner(System.in);
int sum2= 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("enter a number 10 times:");
            sum2 += input.nextInt();

        }
        System.out.println(sum2);



    }
}

