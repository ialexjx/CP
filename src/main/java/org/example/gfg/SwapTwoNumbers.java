package org.example.gfg;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        swapValuesUsingThirdVariable(a, b);
        System.out.println("**********************************************************");
        System.out.println("\n\n");
        swapValuesWithoutUsingThirdVariable(a, b);
    }

    public static void swapValuesUsingThirdVariable(int x, int y) {
        System.out.println("***************\nswapping numbers using the third variable :-");
        System.out.println("The numbers are : x = " + x + " and y = " + y);
        int c = x;
        x = y;
        y = c;

        System.out.println("Numbers after swapping :- x = " + x);
        System.out.println("Numbers after swapping :- y = " + y);
    }

    public static void swapValuesWithoutUsingThirdVariable(int x, int y) {
        System.out.println("***************\nswapping numbers without using the third variable :-");
        System.out.println("The numbers are : x = " + x + " and y = " + y);
        x = x - y;
        y = x + y;
        x = y - x;

        System.out.println("Numbers after swapping :- x = " + x);
        System.out.println("Numbers after swapping :- y = " + y);
    }
}
