package Week3_and_4_ReplitPractice;

import java.util.Scanner;
/*

Patient personal information
Full name: James May
Address: 7925 Jones Branch Dr, McLean, VA 22102
Contact: work phone number: 7896542314, personal phone number: 2406542314, email: jamesmay@gmail.com
Age: 35
Height: 5.1
Weight: 173.2 pounds
Married: true
 */
public class PatientInformation3_4 {
    public static void main(String[] args) {         Scanner scan = new Scanner(System.in);
        System.out.println ("Welcome to the patient portal!\nPlease enter your personal information");
        System.out.println("Enter your first name");
        String firstName = scan.nextLine();

        System.out.println("Enter your last name");
        String lastName = scan.nextLine();

        // this part is already provided DO NOT CHANGE
        System.out.println("Enter your email");
        String email = scan.next();

        scan.nextLine();//to capture Enter key press
        System.out.println("Enter your street");
        String street = scan.nextLine();
        // continue for city

        System.out.println("Enter your city");
        String city = scan.nextLine();

        System.out.println("Enter your state");
        String state = scan.nextLine();

        System.out.println("Enter your zip code");
        int zipCode = scan.nextInt();

        System.out.println("Enter your work phone number");
        String workPhoneNo = scan.nextLine();

        System.out.println("Enter your personal phone number");
        String personalPhoneNo = scan.nextLine();

        System.out.println("Enter your age");
        int age = scan.nextInt();

        System.out.println("Enter your height");
        double height = scan.nextDouble();

        System.out.println("Enter your weight");
        double weight = scan.nextDouble();

        System.out.println("Are you married?");
        boolean isMarried= scan.nextBoolean();

        String address = street + ", " + city + ", " + state + " " + zipCode;
        String contact = "work phone number: " + workPhoneNo + ", personal phone number: " + personalPhoneNo + ", "+ email;
        System.out.println("Patient personal information" +
                "\nFull name: " + firstName + " " +lastName+
                "\nAddress: " + address+
                "\nContact: " + contact+
                "\nAge: " + age+
                "\nHeight: " + height+
                "\nWeight: " + weight + " pounds" +
                "\nMarried: " + isMarried);
        scan.close();
    }
}

/*


    //Enter your code here






         Scanner scan = new Scanner(System.in);
    System.out.println ("Welcome to the patient portal! \nPlease enter your personal information");
        System.out.println("Enter your first name");
        String firstName = scan.nextLine();

        System.out.println("Enter your last name");
        String lastName = scan.nextLine();

        // this part is already provided DO NOT CHANGE
        System.out.println("Enter your email");
        String email = scan.next();

        scan.nextLine();//to capture Enter key press
        System.out.println("Enter your street");
        String street = scan.nextLine();
        // continue for city

        System.out.println("Enter your city");
        String city = scan.nextLine();

        System.out.println("Enter your state");
        String state = scan.nextLine();

        System.out.println("Enter your zip code");
        int zipCode = scan.nextInt();

        System.out.println("Enter your work phone number");
        long workPhoneNo = scan.nextLong();

        System.out.println("Enter your personal phone number");
        long personalPhoneNo = scan.nextLong();

        System.out.println("Enter your age");
        int age = scan.nextInt();

        System.out.println("Enter your height");
        double height = scan.nextDouble();

        System.out.println("Enter your weight");
        double weight = scan.nextDouble();

        System.out.println("Are you married?");
        boolean isMarried= scan.nextBoolean();

String address = street + ", " + city + ", " + state + " " + zipCode;
String contact = "work phone number: " + workPhoneNo + ", personal phone number: " + personalPhoneNo + ", "+ email;
        System.out.println("Patient personal information" +
        "\nFull name: " + firstName + " " +lastName+
        "\nAddress: " + address+
        "\nContact: " + contact+
        "\nAge: " + age+
        "\nHeight: " + height+
      "\nWeight: " + weight + " pounds" +
      "\nMarried: " + isMarried);
    scan.close();
 */
