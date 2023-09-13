package Week3_and_4_ReplitPractice;

import java.util.Scanner;

public class ConfirmationBot3_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String message = " ";
        System.out.println("Enter command:");
        char response = input.next().charAt(0);
        ;

        switch (response) {
            case 'y':
                message = "Your request is being processed";
                break;

            case 'n':
                message = "Thank you for your consideration";
                break;

            case 'h':
                message = "Sorry, no live agents are currently available";
                break;

            default:
                System.out.println("Invalid entry, please try again");
                break;

        }

        System.out.println(message);

        input.close();



        /*
        ### Use a `switch statement` to create a confirmation bot. Given a `response` value as a `char`, output a message based on the following:

> - if the response is `y` print the message: `Your request is being processed`
> - if the response is `n` print the message: `Thank you for your consideration`
> - if the response is `h` print the message: `Sorry, no live agents are currently available`
> - if the response is anything other than `y, n, or h` print: `Invalid entry, please try again`

Main topics: switch statements, primitive variables

** Example Flows:**
```
Ex:
  Enter command:
  y
  Your request is being processed
```
```
Ex:
  Enter command:
  a
  Invalid entry, please try again
```
```
Ex:
  Enter command:
  n
  Thank you for your consideration
         */
    }
}
