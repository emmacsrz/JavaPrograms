package LoopsReview;
import java.util.Scanner;
//write a program that can reverse any given string
public class StringReverse {
    public static void main(String[] args) {

String str ="racecar spelled backwards is racecar";
String reverse= "";
        for (int i = str.length()-1; i >=0 ; i--) {
            reverse += str.charAt(i);
        }
        System.out.println(reverse);
        System.out.println(str);

        System.out.println();
        System.out.println();
        System.out.println("--------------------------------------------");
//try with scanner:

        Scanner input = new Scanner(System.in);
        System.out.println("enter a sentence: ");
        String str2 = input.nextLine();
        String reverse2 = "";
        for (int i = str2.length()-1; i >=0; i--) { //starts at the last index no. of the given string. Goes backwards until i =0.
            reverse2+=str2.charAt(i); //adds whichever char i represents on that iteration to the reverse variable
        }
        System.out.println("that sentence reversed is: ");
        System.out.println(reverse2);
        System.out.println();
        System.out.println();
        System.out.println("--------------------------------------------");

        System.out.println("enter another sentence:");
String str3 = reverse(input.nextLine());
        System.out.println("That sentence reversed is: ");
        System.out.println(str3);



    }
    //create custom method that can reverse a string:
public static String reverse (String str){
        String reverse= "";
        for (int i = str.length()-1; i>=0; i--){
            reverse+= str.charAt(i);
        }

        return reverse;
}

}
