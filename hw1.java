package org.example;

import java.util.Scanner;

public class hw1 {
    public static void main(String[] args) {
        inputFloat();
    }

    /**
     * Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное значение.
     * Ввод текста вместо числа не должно приводить к падению приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных.
     */
    public static void inputFloat() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите дробное число (типа float 24,5) испоьзуя разделитель ',' : ");

        if (in.hasNextFloat())
            System.out.print("Число: " + in.nextFloat());
        else {
            System.out.println("Ошибка");
            inputFloat();
        }


    }
}
