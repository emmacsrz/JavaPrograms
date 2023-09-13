package Week2LiveReview;

public class MyName {
    public static void main(String[] args) {
   char e = 'E', m = 'm', a = 'a';
   String myName = "My name is "  + e +m + m + a; //you have to use " "  some string of text in order to make this valid. you cannot do just e + m +m +a.

        System.out.print(e);
        System.out.print(m);
        System.out.print(m);
        System.out.println(a);
        //or, use the string variable for more efficiency:
        System.out.println(myName);
        //if you do just char + char + char + char, you will get adition of the assigned ascii numbers to those letters. see below;
        System.out.println(e+m+m+a); //prints as 384




    }
}
