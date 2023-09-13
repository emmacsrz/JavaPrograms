package Week2LiveReview;

public class CellPhone {
    public static void main(String[] args) {

        String brand = "Apple",
                model = "iPhone X",
                color = "black";
        double price = 1200.99;
        int storage = 128;
        boolean hasCamera = true;
        char simType = 'A';
//turning the ad into a string variable to make it more reusable:

        String ad = "We have a brand new " + model + " from " + brand +
                "\nIt comes in the color " + color + " and has " + storage + "gb memory." +
                "\nIt has a camera, " + hasCamera + ", and operates with the \"" + simType + "\" type sim. " +
                "\nGet your very own " + model + " for only $" + price;

        //printing ad using that string variable:
        System.out.println(ad);
    }
}
