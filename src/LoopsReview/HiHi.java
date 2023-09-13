package LoopsReview;
import java.util.Scanner;

public class HiHi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String str = input.nextLine();

        int frequency=0;
        while(str.contains("hi")){
str = str.replaceFirst("hi","");
frequency++;
            }

        System.out.println(frequency);

/*
### Use a `loop` to count how many times the characters `hi` are found in the given String `str`. Only consider the lowercase characters for `hi`.

Main topics: loops, primitive datatypes, operators, Scanner, String, if statements

```
Ex:
  Input:
    abc hi how

  Output:
    1
```
```
Ex:
  Input:
    hihi bye

  Output:
    2
 */
        input.close();
    }

}
