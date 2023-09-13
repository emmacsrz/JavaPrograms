package day04_PrimitiveCastings_Concatenations;

public class SalaryCalculator2 {
    public static void main(String[] args) {
        int hourlyRate =50;
        int weeklyHours=45;
        double stateTax=0.06;
        double fedTax=.26;
        int weeklysalary= hourlyRate*weeklyHours;
        double yearlySalary= weeklysalary*52;
        double yearlySalaryStatetax=yearlySalary*stateTax;
        double yearlySalaryFedtax=yearlySalary*fedTax;
        double netIncome= yearlySalary-yearlySalaryFedtax-yearlySalaryStatetax;

        System.out.println("yearly salary before tax: " + yearlySalary);
        System.out.println("State tax on yearly salary: "+ yearlySalaryStatetax);
        System.out.println("Fed tax on yearly salary: "+ yearlySalaryFedtax);
        System.out.println("Net income is:  " + netIncome);

        /*
        7. Create a class named SalaryCalculator, and declare the following variables:
                hourlyRate
                weeklyHours
                stateTaxRate
                federalTaxRate

    7.1 Use the given info above to calculate the followings:
                salaryBeforeTax
                stateTax
                federalTax
                totalTax
                salaryAfterTax

    7.2 Display each of the above in the following format:
        Ex:
              hourlyRate = $50
              weeklyHours = 45
              stateTax = 6  (given as percentage)
              federalTax = 26 (given as percentage)

        output:
               Gross pay is: $117000
                    Federal tax is: $30420
                    State tax is: $7020
                    Total tax is: $37440
                     Net income is: $79560
         */
    }
}
