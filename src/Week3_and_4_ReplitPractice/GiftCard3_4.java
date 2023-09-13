package Week3_and_4_ReplitPractice;

import java.util.Scanner;


public class GiftCard3_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Hello, which item would you like?");
        String item = input.next();

        boolean isValid = true;
        int balance = 100;

        switch (item) {
            case "Blanket":
                balance -= 60;
                break;
            case "Charger":
                balance -= 5;
                break;
            case "Hat":
                balance -= 25;
                break;
            case "Headphones":
                balance -= 30;
                break;
            case "Laptop":
                System.out.println("Sorry, not enough funds on your gift card ");
                isValid=false;
                break;
            case "Pants":
                balance -= 50;
                break;
            case "Pillow":
                balance -= 40;
                break;
            case "Smartphone":
                System.out.println("Sorry, not enough funds on your gift card ");
                isValid = false;
                break;
            case "Socks":
                balance -= 5;
                break;
            case "USB cable":
                balance -= 10;
                break;
            default:
                System.out.println("Sorry, that is an invalid item");
                isValid = false;

        }

if(isValid){
    System.out.println("Thank you for your purchase \nYour current balance is: $" +balance);
}

        /*
        ### You got a $100 gift card for your birthday, but we can't use it yet. We need to build the application for the store in order to use our gift card.

#### The program will ask the user to enter the item they want to buy. Then it will check if that item is in the store inventory. If the item is available there will be a confirmation message displayed and the remaining balance on the gift card will be output as well. In some cases that item may not be available in the store and in other cases we may not have enough money on the gift card to buy an item so we must handle both of these conditions as well. We can only make one purchase at a time.

** List of items, with prices, available in the store:**

> - Blanket: $60
> - Charger: $5
> - Hat: $25
> - Headphones: $30
> - Laptop: $200
> - Pants: $50
> - Pillow: $40
> - Smartphone: $1000
> - Socks: $5
> - USB cable: $10

- If the item is not in the list, display message: `Sorry, that is an invalid item`
- If the price of the item we want is more than $100, display message: `Sorry, not enough funds on your gift card`
         */

    }
}
