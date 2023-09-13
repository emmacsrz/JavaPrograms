package Week3_and_4_ReplitPractice;

import java.util.Scanner;


public class FindLength3_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word:");
        String word = input.next();

        input.close();

        System.out.println("Length is: "+ word.length());



/*
### Use `String methods` to find the number of characters for the given `word` variable. The value of the `word` will be input from a Scanner, but you only need to interact with the String variable. Output in the following format:

#### Length is: $length

Main topics: String manipulation, Scanner, methods, primitive datatypes

```
Ex:
  Input:
    java

  Output:
    Length is: 4
```
```
Ex:
  Input:
    apple

  Output:
    Length is: 5
 */
    }
}
