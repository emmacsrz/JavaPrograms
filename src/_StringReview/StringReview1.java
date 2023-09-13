package _StringReview;

import java.util.Scanner;

public class StringReview1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = "Java";
        System.out.println("Javalava");
        System.out.println();

        String first = str.substring(0, 1).toLowerCase() + str.substring(1, str.length()).toUpperCase();

        System.out.println(first);
        System.out.println(first.length());


        String s1 = "wooden spoon";
        char f = s1.charAt(0);
        int lastIndexNum = s1.length() - 1;
        char l = s1.charAt(Character.toUpperCase(lastIndexNum)); //making the last character uppercase

        System.out.println(f +" " + l);
    }
}
