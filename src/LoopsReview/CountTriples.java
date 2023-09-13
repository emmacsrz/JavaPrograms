package LoopsReview;
import java.util.Scanner;

public class CountTriples {
    public static void main(String[] args) {
Scanner input = new Scanner(System.in);
String str = input.nextLine();

int count =0;


        for (int i = 0; i < str.length()-2; i++) {
if (str.charAt(i)== str.charAt(i+1)&& str.charAt(i) ==str.charAt(i+2)){
    count++;
}
        }
        System.out.println(count);

/*
### Use a `loop` to count the number of triples in the given `str`. A triple is when the same character appears three times in a row. So if there is a specific character that is repeated three times, that will be counted as one triple. Print the total number of triples found in the String. The triples may overlap.
 */




    }
}
