package Week3_and_4_ReplitPractice;
import java.util.Scanner;

public class ReverseIt3_6 {
    public static void main(String[] args) {
        //DO NOT TOUCH FOLLOWING LINE/LINES
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        //WRITE YOUR CODE BELOW
if(word.length() <5 ) {
    System.out.println("Too short!");
}else if(word.length()>5){
    System.out.println("Too long!");
}else if(word.length()==5){
    System.out.print(word.charAt(4));
    System.out.print(word.charAt(3));
    System.out.print(word.charAt(2));
    System.out.print(word.charAt(1));
    System.out.print(word.charAt(0));
}else{

}








    }
}
