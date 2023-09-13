package LoopsReview;
import java.util.Scanner;
public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a string of characters:");
        String str =input.next();

String result = "";

        for (int i = 0; i <= str.length()-1 ; i++) {
            char ch = str.charAt(i);
            if (result.contains(""+str.charAt(i))) {
                continue;
            }
            result+=ch;
        }
        System.out.println(result);

        System.out.println(noDuplicates("aabbbcccddd"));
    }


//turning the above program into a custom method:
    public static String noDuplicates (String str){
        String result= "";
        for (int i = 0; i <= str.length()-1 ; i++) {
            char ch = str.charAt(i);
            if (result.contains(""+str.charAt(i))) {
                continue;
            }
            result+=ch;
        }
    return result;
    }
}
