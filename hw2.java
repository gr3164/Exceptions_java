package org.example;

public class hw2 {
    public static void main(String[] args) {
        int[] intArray = { 4, 6, 333, 444, 655, 711, 823, 9 };

        try {
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException " + e);
        }

    }
}
