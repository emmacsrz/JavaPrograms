package Week3_and_4_ReplitPractice;

import java.util.Scanner;

public class Calendar3_4_23 {
    public static void main(String[] args) {
        // DO NOT TOUCH BELOW
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter month number:");
        int monthNum = scan.nextInt();

        //WRITE YOUR CODE BELOW:

        String month = "";

        switch (monthNum) {
            case 1:
                month = "January";
                break;

            case 2:
                month = "February";
                break;

            case 3:
                month = "March";
                break;

            case 4:
                month = "April";
                break;

            case 5:
                month = "May";
                break;

            case 6:
                month = "June";
                break;

            case 7:
                month = "July";
                break;

            case 8:
                month = "August";
                break;

            case 9:
                month = "September";
                break;

            case 10:
                month = "October";
                break;

            case 11:
                month = "November";
                break;

            case 12:
                month = "December";
                break;

            default:
                System.out.println("Invalid month number");

        }

        System.out.println(month);

        /*

        Scanner input = new Scanner(System.in);


        String monthNum = " ";
        String month = " ";
        System.out.println("Enter month number:");
        String monthnum = input.next();

        switch (monthnum) {
            case "1":
                month = "January";
                break;

            case "2":
                month = "February";
                break;

            case "3":
                month = "March";
                break;

            case "4":
                month = "April";
                break;

            case "5":
                month = "May";
                break;

            case "6":
                month = "June";
                break;

            case "7":
                month = "July";
                break;

            case "8":
                month = "August";
                break;

            case "9":
                month = "September";
                break;

            case "10":
                month = "October";
                break;

            case "11":
                month = "November";
                break;

            case "12":
                month = "December";
                break;

            default:
                System.out.println("invalid month");
        }

        System.out.println(month);

       input.close();

        /*
        ### Use a `switch statement` to display the month name when given an `int` `monthNum`. If an invalid `monthNum` is given print `Invalid month number`

Main topics: switch statements, primitive variables

** Example Flows:**
```
Ex:
  Enter month number:
  5
  May
```
```
Ex:
  Enter month number:
  1
  January
```
```
Ex:
  Enter month number:
  20
  Invalid month number
```

         */


    }
}