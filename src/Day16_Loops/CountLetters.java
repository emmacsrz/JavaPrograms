package Day16_Loops;
import java.util.Scanner;
//the logic behind these loops is to go through each character in the user's input one by one, check if it has already been counted before, and if it hasn't, count how many times it appears in the user's input and add it to the "result" string. The loops are necessary because we need to go through each character in the user's input to count them all.
public class CountLetters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter characters:");
        String userInput = input.next(); //gets user's input
        String result = ""; // creates an empty string variable named result


        for (int i = 0 ; i <userInput.length(); i++){ //this starts a loop that will go through each charavter in the users input one by one
            if (result.contains(""+userInput.charAt(i))){ //checks to see if the character has already been counted before by checking if the "result"  string contains that character.  IF it does, it skips the rest of the loop for that character and moves to the next one using continue statement. --- basically this loop is responisble for isolating the different characters, the inner loop THEN COUNTS HOW MANY TIMES EACH SPECIFIC CHARACTER APPEARS.
                continue;
            }
            int count = 0;// creates a new variable named count, will be used to count how many times the current character appears in the user's input.
            for (int j = 0; j <userInput.length(); j++){  //starts another loop that will go through each character in the user's input one by one.
                if(userInput.charAt(i)==userInput.charAt(j)){//checks to see if the current character is the same as the character we're currently counting. if it is, it adds 1 tothe "count variable"
                    count++;
                }
            }
            result+=""+count + userInput.charAt(i);//add the count of the current character  and the characater itself to the result string

        }//outer loop end

        System.out.println(result);


    }
}
