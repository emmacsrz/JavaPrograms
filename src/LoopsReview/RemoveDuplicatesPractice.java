package LoopsReview;
import java.util.Scanner;
public class RemoveDuplicatesPractice {
    public static void main(String[] args) {

        System.out.println(removeDuplicates("aabbbcccdddeeeffkkkll"));
    }
    public static String removeDuplicates(String str){
String result ="";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (result.contains(""+ch)){
                continue;
            }
            result+=""+ ch;
        }
return result;
    }

}