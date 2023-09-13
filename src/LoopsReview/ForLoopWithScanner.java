package LoopsReview;
import java.util.Scanner;

public class ForLoopWithScanner {
    public static void main(String[] args) {
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
