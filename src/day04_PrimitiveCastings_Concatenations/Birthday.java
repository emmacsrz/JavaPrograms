package day04_PrimitiveCastings_Concatenations;

public class Birthday {
    public static void main(String[] args) {

        String name = "Emma";
        int birthDay=14;
        String birthMonth ="June";
        int birthMonthInt=6;
        int birthYear=1993;



        System.out.println("Emma was born on " + birthMonth + " " + birthDay + ", " + birthYear );
        //or:
        System.out.println("or, written as: ");
        System.out.println("Emma was born on " + birthMonthInt + "/" + birthDay + "/" + birthYear );
        /*
        2. Create a class called BirthDay and create the following variable
             name, birthDay(int), birthMonth(String), birthYear(int)

          use concatenation to display the birthday of the person

                 if  name = "John"
                     birthDay = 25
                     birthMonth = "April"
                     birthYear = 1995;

                 output:
                     John was born on April/25/1995.
         */
    }
}
