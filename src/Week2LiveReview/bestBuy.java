package Week2LiveReview;

public class bestBuy {
    public static void main(String[] args) {

        int tvs =50;
        System.out.println("we have " + tvs +" TVs"
         );
        System.out.println("someone comes in to buy a tv");
        tvs -=1; //changes the number by given number. TVs will print as 49 next time.
        System.out.println("number of TVs is now: " +tvs);
        tvs -=1;
        System.out.println("someone else bought one, now there are " +tvs);
        System.out.println("person 3 came in and put tv in their cart" );
        System.out.println("how many TVs are still  in the store? there are " + tvs-- + " in the store"); //will show current number, then update the NEXT TIME the tvs variable is used with 1 less.
        System.out.println("now there are: " +tvs);

        tvs +=10;
        System.out.println("we just got 10 TVs into inventory. we now have: " + tvs);


    }
}
