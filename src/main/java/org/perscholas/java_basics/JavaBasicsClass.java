package org.perscholas.java_basics;
import java.text.DecimalFormat;  //Imported DecimalFormat Library for decimal formatting precision

public class JavaBasicsClass {
    public static void main(String[] args) {

        /*
        * Write a program that declares two integer variables,
        * assigns an integer to each, and adds them together.
        * Assign the sum to a variable. Print out the result.
        * */


        int myFirstIntNumber = 10;
        int mySecondIntNumber = 50;
        int addNumbers = myFirstIntNumber + mySecondIntNumber;

        System.out.println(addNumbers);

        /*
        * Write a program that declares two double variables,
        * assigns a number to each, and adds them together.
        * Assign the sum to a variable. Print out the result.
        * */

        double myFirstDoubleNumber = 3.678;
        double mySecondDoubleNumber = 8.139;
        double addMyDoubleNumbers = myFirstDoubleNumber + mySecondDoubleNumber;

        System.out.println(addMyDoubleNumbers);


        /*
        * Write a program that declares an integer variable and a double variable,
        * assigns numbers to each, and adds them together. Assign the sum to a variable.
        * Print out the result. What variable type must the sum be?
        * */

        int integerNumber = 4;
        double deciminalNumber = 4.67;
        double addMyMixedNumbers = integerNumber + deciminalNumber; // Double type must be the `Sum` variable type


        System.out.println(addMyMixedNumbers);

        /*
        Write a program that declares two integer variables, assigns an integer to each,
        and divides the larger number by the smaller number.
        Assign the result to a variable. Print out the result.
        Now change the larger number to a decimal.
        What happens? What corrections are needed?
        */

        double largeDivisionNumber = 80.7;
        double smallDivisionNumber = 2;
        double divideMyNumbers = largeDivisionNumber / smallDivisionNumber;

        System.out.println(divideMyNumbers);

        /* Answers: When changing the assignment of an int variable to a deciminal number
                    a syntax error occurs.  To correct this issue, a developer must change
                    the variable type from int to double.
         */

        /*
        * Write a program that declares two double variables,
        * assigns a number to each, and divides the larger by the smaller number.
        * Assign the result to a variable. Print out the result.
        * Now, cast the result to an integer. Print out the result again.
        * */

        double dividingAndCastingNumber1 = 3.45;
        double dividingAndCastingNumber2 = 7.48;
        double dividingAndCastingNumbers = dividingAndCastingNumber2 / dividingAndCastingNumber1;
        int castedNumber = (int) dividingAndCastingNumbers;

        System.out.println(dividingAndCastingNumbers);
        System.out.println(castedNumber);

        /*
        * Write a program that declares two integer variables, x and y,
        * and assigns the number 5 to x and the number 6 to y.
        * Declare a variable q and assign y/x to it and print q.
        * Now, cast y to a double and assign it to q. Print q again.
        * */

        int x = 5;
        int y =6;
        int q = y/x;


        System.out.println(q);


        /*
        * Write a program that declares a named constant and uses it in a calculation.
        * Print the result.
        * */

        final int daysOfTheWeek = 7;  //Days of the week
        final int weeksInAYear = 52; //Weeks in a year

        int daysInAYear = daysOfTheWeek * weeksInAYear;

        System.out.println(daysInAYear);

        /*
        * Write a program where you create three variables that represent products at a cafe.
        * The products could be beverages like coffee, cappuccino, espresso, green tea, etc.
        * Assign prices to each product.
        * Create two more variables called subtotal and totalSale and complete an “order” for three items of the first product,
        * four items of the second product, and two items of the third product. Add them all together to calculate the subtotal.
        * Create a constant called SALES_TAX and add sales tax to the subtotal to obtain the totalSale amount.
        * Be sure to format the results to two decimal places.
        * */

        double coffee = 1.79;
        double cappuccino = 2.39;
        double espresso = 2.59;
        double customerOrder = (coffee * 3) + (cappuccino * 4) + (espresso * 2);
        DecimalFormat df = new DecimalFormat("#.00");  //DecimalFormat is a Data Type

        final double SALES_TAX = 0.03;

        double subtotal = customerOrder;
        double totalSale = (SALES_TAX * customerOrder + customerOrder);

        System.out.println(df.format(totalSale));  /* df.format is a method that can be called on
                                                    System.out.println to round the decimal to 2 decimal places*/







    }
}
