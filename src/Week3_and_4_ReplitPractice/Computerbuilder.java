package Week3_and_4_ReplitPractice;

import java.util.Scanner;

public class Computerbuilder {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        double totalPrice = 0.00;


        System.out.println("Select screen size:");
        String screenSize = input.next();


        switch (screenSize) {
            case "13.3":
                totalPrice += 200;
                break;

            case "15.0":
                totalPrice += 300;
                break;

            case "17.3":
                totalPrice += 400;
                break;

        }


        System.out.println("Select CPU type:");
        String cpuType = input.next();


        switch (cpuType) {
            case "i3":
                totalPrice += 150;
                break;

            case "i5":
                totalPrice += 250;
                break;

            case  "i7":
                totalPrice += 350;
                break;

        }


        System.out.println("Select RAM size:");
        int ramSize = input.nextInt();
        int ramUpcharge = ((ramSize / 4) * 50);
        totalPrice += ramUpcharge;


        input.nextLine();
        System.out.println("Select storage type:");
        String storageType = input.next();
        System.out.println("Select storage size:");
        int storageSize = input.nextInt();

        switch (storageType) {
            case "HDD":
                totalPrice += ((storageSize / 500) * 50);
                break;

            case "SSD":
                totalPrice += ((storageSize / 500) * 100);
                break;
        }


        input.nextLine();
        System.out.println("Select screen resolution:");
        String screenRes = input.next();

        switch (screenRes) {
            case "FULLHD":
                totalPrice += 100;
                break;

            case "4K":
                totalPrice += 200;
                break;
        }


        input.nextLine();
        System.out.println("Final price is: $" + totalPrice);

        input.close();
    }

}
