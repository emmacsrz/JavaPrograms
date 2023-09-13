package Week3_and_4_ReplitPractice;

import java.util.Scanner;

public class AndroidVersions3_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String output = " ";
        String version = input.next();


        switch (version) {
            case "1.5":
                output = "Cupcake";
                break;

            case "1.6":
                output = "Donut";
                break;

            case "2.1":
                output = "Eclair";
                break;

            case "2.2":
                output = "Froyo";
                break;

            case "2.3":
                output = "Gingerbread";
                break;

            case "3.1":
                output = "Honeycomb";
                break;

            case "4.0":
                output = "Ice Cream Sandwich";
                break;

            case "4.1":
                output = "Jelly Bean";
                break;

            case "5.0":
                output = "Lollipop";
                break;

            case "8.0":
                output = "Oreo";
                break;

            case "9.0":
                output = "pie";
                break;

            default:
                System.out.println("Not a valid version");
                break;
        }

        System.out.println(output);
        /*

**Versions**
> - 1.5 - Cupcake
> - 1.6 - Donut
> - 2.1 - Eclair
> - 2.2 - Froyo
> - 2.3 - Gingerbread
> - 3.1 - Honeycomb
> - 4.0 - Ice Cream Sandwich
> - 4.1 - Jelly Bean
> - 4.4 - KitKat
> - 5.0 - Lollipop
> - 8.0 - Oreo
> - 9.0 - Pie
> - Any other number is invalid and should display: Not a valid version

#### Note: Its possible to use if statements to complete this, but use switch statement for practice. Or for even more practice, complete the task twice, once using each different conditional statement.

Main topics: switch statements, primitive variables, Scanner

Examples:
```
Ex:
  Input:
    1.5

  Output:
    Cupcake
```
```
Ex:
  Input:
    9.0

  Output:
    Pie
```
```
Ex:
  Input:
    11.0

  Output:
    Not a valid version
```
         */


    }


}
