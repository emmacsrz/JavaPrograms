package Week4LiveReview;

public class convertFromDollar {
    public static void main(String[] args) {


        System.out.println(convertFromDollar("yen", 1));
    }

    public static double convertFromDollar(String currency, double dollars) {
        double result = 0.00;
        switch (currency.toLowerCase().trim()) {
            case "euro":
                result = dollars * 0.91;
                break;
            case "yen":
                result = dollars * 121.03;
                break;
            case "lira":
                result = dollars * 14.85;
                break;
            case "won":
                result = dollars * 1217.52;
                break;
            case "rupee":
                result = dollars * 181.45;
                break;
        }
return result;
    }
}
