package Week2LiveReview;

public class OperatorExamples {
    public static void main(String[] args) {
        int age= 10;
        age ++;
        System.out.println(age);
        System.out.println(age++); //post increment, updates on the next line, prints the value of age FIRST, then will update the next one.
        System.out.println(age);
int num = 5;
        System.out.println(++num); //pre increment.  ++before will update the num bfore it runs.
// ------------
        int x = 15;
        int y = x++;
        System.out.println(x);
        System.out.println(y); //assigns y to be 15, b/c y =  x BEFORE the increment.
// ------------
        int z = 90;
        int w = --z; //predecriment, subtracts 1 right away
        System.out.println(z);
        System.out.println(w);
// ------------
        int a =3;
        int b=5;
        a++;
        int c= a + b;
        System.out.println(c);






    }
}
