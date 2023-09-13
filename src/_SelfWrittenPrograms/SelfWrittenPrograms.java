package _SelfWrittenPrograms;

import java.util.Scanner;
//write a program that will reverse the domain name of the email using  a custom method
    public class SelfWrittenPrograms {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int inhabitants = scan.nextInt();
            //WRITE YOUR CODE HERE:

            for(int day = 0; inhabitants>0; day++ ){
                System.out.println("Day " + day + " [" + inhabitants + "] ");
                inhabitants /=2;
            }


        }
}