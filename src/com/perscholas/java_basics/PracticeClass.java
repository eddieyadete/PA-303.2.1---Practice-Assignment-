package com.perscholas.java_basics;

public class PracticeClass {
    int x;
    int y;
    int results;

    /**
     * Write a program that declares two integer variables, assigns an integer to each,
     * and adds them together. Assign the sum to a variable. Print out the result.
     */
    public void addInteger(){
        x=12;
        y=16;
        results= x+y;
        System.out.println(results);
    }

    /**
     * declares two double variables, assigns a number to each
     */
    public void addDouble(){
        double s = 12.3;
        double d = 16.3;
        double sum = s+d;
        System.out.println( sum );
    }
    //3
    public void addTwoDataType(){
        int a = 12;
        double b = 16.33;
        double result = (float)a*b;
        System.out.printf("the result is: %.2f ", result );
    }
    //4
    public void divideTwoDataType(){
        double x = 54.2;
        y = 4;
        double results = x/y;
        System.out.println(results);

    }
    public void divideTwoIntDouble(){
        double x = 54.2;
        double y = 4.5;
        double results = x/y;
        System.out.println(results);
        //double 13.55
        //int incompatible types: possible lossy conversion from double to int
    }
    public void castIntToDouble(){
        int x = 5;
        int y = 6;
        double q = y/x;
        System.out.println(q);
        //int = 1, double = 1.0
    }
    public void constantName(){
        final double CONVERSION_FACTOR = 5.0/9.0;
        final int FREEZING_POINT_F = 32;

        int fahrenheit = 98;
        double celsius = (fahrenheit - FREEZING_POINT_F)*CONVERSION_FACTOR;
        System.out.println(fahrenheit + "f is equivalent to " + celsius +" c");
    }

    public void totalSale(){
        double coffee = 4.50;
        double soda = 2.25;
        double cake = 5.25;

        int coffeeAmount = 3;
        int sodaAmount = 4;
        int cakeAmount = 2;

        final double SALES_TAX = 0.07;

        double subTotal =(coffee * coffeeAmount) + (soda*sodaAmount) + (cake*cakeAmount);
        double totalSale = subTotal + (subTotal * SALES_TAX);

        System.out.printf("subtotal: %.2f ", subTotal);
        System.out.printf("total sale (with tax): %.2f%n", totalSale);



    }

}
