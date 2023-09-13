import java.util.Scanner;

public class QuickPractice {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int items = 1;
        double totalPrice =0.00;
        String answer ="no";
        String list = "SHOPPING LIST:";


        do{
            System.out.println("Enter the name of item " + items++);
            String item =input.next();

            System.out.println("Enter the price of the " + item);
            double price = input.nextDouble();

            System.out.println("How many "+item+" will you buy?");
            int quantity = input.nextInt();
            double eachItemPrice = price * quantity;
            list+= "\n"+item+" x "+quantity+" - $"+ eachItemPrice;
            totalPrice +=  eachItemPrice;
            System.out.println("Do you want to add more items to the shopping list?");
            answer= input.next();
        }while (answer.equals("yes"));

        System.out.println(list+ "\nTotal cost: $"+totalPrice);
    }
}