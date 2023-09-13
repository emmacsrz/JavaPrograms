package LoopsReview;
import java.util.Scanner;

public class CatsAndDogs {
    public static void main(String[] args) {
        //DO NOT TOUCH FOLLOWING LINE/LINES
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int dogCount = 0;
        int catCount =0;
while(str.contains ("dog")) {
    str = str.replaceFirst("dog", "");
    dogCount++;
}
while(str.contains("cat")){
    str = str.replaceFirst("cat","");
    catCount++;
}
        if (catCount == dogCount){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
        //WRITE YOUR CODE BELOW



        /*
        ### Use a `loop` to count how many times the characters `cat` and `dog` are found in the given String `str`. Output `true` if `cat` and `dog` appear the same number of times, otherwise output `false`
Main topics: loops, primitive datatypes, operators, Scanner, String, if statements

```
Ex:
  Input:
    catdog

  Output:
    true
```
```
Ex:
  Input:
    catcat

  Output:
    false
```
```
Ex:
  Input:
    cat-cheetah-dog-cat

  Output:
    false
```
         */
    }
}
