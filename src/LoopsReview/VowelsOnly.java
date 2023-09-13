package LoopsReview;

import java.util.Scanner;
public class VowelsOnly {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();

        //WRITE YOUR CODE BELOW
        String result ="";
        for(int i = 0; i <word.length(); i++){
            char ch = word.charAt(i);
            if(!(ch == 'a' || ch == 'e'||ch == 'i' ||ch == 'o'|| ch == 'u')){
                continue;
            }
            result +=ch;
        }
        System.out.println(result);




    }
}
