package Week2LiveReview;

public class CastingExample {
    public static void main(String[] args) {

        int i = 30;
        long l = i;

        long l2 = 100;
        byte b2 = (byte) l2;
        double d3 = 15.99;
        int i3 = (int) d3;
        System.out.println(i3);

        int i4 = 1_000_000;
        byte b4 = (byte) i4;// you cannot cast a byte to 1000000.  That is too large of anumber
        //there is a formula that causes it to be prited as this:
        System.out.println(b4); //dont worry about that formula. Just know there is a data loss. Computer does the calculations for you.

        //float f5=10.23; //trying to store a double into a float - you can't do this automatically. That's why you have to add F:
        float f5=10.23f;
        System.out.println(f5);






    }
}
