package org.example;

public class hw3 {
    public static void main(String[] args) throws Exception {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = {1, 2};
            abc[3] = 9;
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!" + ex);
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!" + ex);
        } catch (Throwable ex) {
            System.out.println("Что-то пошло не так..." + ex);
        }

    }

    public static void printSum(Integer a, Integer b) {
        System.out.println(a + b);
    }
}
