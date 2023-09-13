package LoopsReview;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

/*
4. Write a program that can return the factorial number of any given number

            Ex:
                input: 5
                output: 120

                	( because: 5! = 5 * 4 * 3 * 2* 1 = 120 )
 */
//done as a custom method
public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a number: ");
        int num = input.nextInt();
        System.out.println("the factorial of that number is:");
        System.out.println(factorial(num));




    }
    public static int factorial(int num){
        int factorial = 1; //this cannot be set to 0, because any number multiplied by 0 will be 0

        for (int i = num; i>=1; i--) {
            factorial *=i;

        }

        return factorial;
    }
}
