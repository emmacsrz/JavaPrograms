package Week3_and_4_ReplitPractice;

import java.util.Scanner;


public class DayOfWeek3_4_23 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter day number: ");
        int dayNumber = input.nextInt();
        String day = " ";

        switch (dayNumber){
        case 1:
        day = "Monday";
        break;

        case 2:
        day = "Tuesday";
        break;

        case 3:
        day = "Wednesday";
        break;

        case 4:
        day = "Thursday";
        break;

        case 5:
        day = "Friday";
        break;

        case 6:
        day = "Saturday";
        break;

        case 7:
        day = "Sunday";
        break;

        default:
        System.out.println("Invalid day number");
    }
        System.out.println(day);



    }
}
