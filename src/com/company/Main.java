package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static void evenNumb(int[] arrey) { // четные числа
        for (int k : arrey) {
            if ((k % 2) == 0)
                System.out.print(k + " ");
        }
        System.out.println();
    }

    static void oddNumb(int[] arrey) {  // нечетные числа
        for (int k : arrey) {
            if ((k % 2) != 0)
                System.out.print(k + " ");
        }
        System.out.println();
    }

    static int maxNumb(int[] arrey) {  // наибольшее число
        int max = arrey[0];
        for (int i = 0; i < arrey.length; i++) {
            if (max < arrey[i])
                max = arrey[i];
        }
        return max;
    }

    static int minNumb(int[] arrey) {  // наименьшее число
        int min = arrey[0];
        for (int i = 0; i < arrey.length; i++) {
            if (min > arrey[i])
                min = arrey[i];
        }
        return min;
    }

    static void divByN(int[] arrey, int n) { //  деление на N без остатка
        for (int k : arrey) {
            if ((k % n) == 0)
                System.out.print(k + " ");
        }
        System.out.println();
    }


    public static void main(String[] args) {

        // 1. Приветствовать любого пользователя при вводе его имени через командную строку

        /*
        System.out.println("Введите, пожалуйста, Ваше имя.");
        Scanner userNameScan = new Scanner(System.in);
        String userName = userNameScan.next();
        System.out.println("Привет, " + userName + "!");
        userNameScan.close();
        */

        // 2. Отобразить в окне консоли аргументы командной строки в обратном порядке.

        /*
        for (int i = args.length-1; i >=0 ; i--) {
            System.out.println("Аргумент командной строки = " + args[i]);
        }
        */

        // 3. Вывести заданное количество случайных чисел с переходом и без перехода на новую строку.

        /*
        int a = 3, b = 5, c = 10;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.print(a + " ");
        System.out.print(b + " ");
        System.out.print(c + " ");
        */

        // 4. Ввести пароль из командной строки и сравнить его со строкой-образцом.

        /*
        String sample = "Пароль";
        System.out.println("Введите, пожалуйста, слово-пароль.");
        Scanner passwordScan = new Scanner(System.in);
        String password = passwordScan.next();
        System.out.println( sample.equals(password));
        passwordScan.close();
        */

        // 5. Ввести целые числа как аргументы командной строки,
        // подсчитать их суммы (произведения) и вывести результат на консоль

        /*
        int sum = 0;
        int mult = 1;
        for (int i = 0; i < args.length; i++) {
            sum += Integer.parseInt(args[i]);
            mult *= Integer.parseInt(args[i]);
        }
        System.out.println("Сумма аргументов = " + sum);
        System.out.println("Произведение аргументов = " + mult);
        */

        // 6. Ввести с консоли n целых чисел. На консоль вывести:

        System.out.println("Введите количество чисел N");
        Scanner inputScan = new Scanner(System.in);
        int sizeOfArr = inputScan.nextInt();
        int[] arrey = new int[sizeOfArr];
        System.out.println("Введите последовательность из N целых чисел");
        for (int i = 0; i < arrey.length; i++) {
            arrey[i] = inputScan.nextInt();
        }
        inputScan.close();
        //System.out.println(Arrays.toString(arrey));

            // 6.1 Четные и нечетные числа.
        System.out.print("Четные числа: ");
        evenNumb(arrey);
        System.out.print("Нечетные числа: ");
        oddNumb(arrey);

            // 6.2. Наибольшее и наименьшее число.
        System.out.println("Наибольшее число: " + maxNumb(arrey));
        System.out.println("Наименьшее число: " + minNumb(arrey));

            // 6.3. Числа, которые делятся на 3 или на 9.
        System.out.print("Делятся на 3: ");
        divByN(arrey, 3);
        System.out.print("Делятся на 9: ");
        divByN(arrey, 9);

            // 6.4. Числа, которые делятся на 5 и на 7.
        System.out.print("Делятся на 5: ");
        divByN(arrey, 5);
        System.out.print("Делятся на 7: ");
        divByN(arrey, 7);

            // 6.5. Все трехзначные числа, в десятичной записи которых нет одинаковых цифр.
        System.out.print("Трехзначные числа, состоящие из разных цифр: ");
        for (int k : arrey) {
            String tmp = Integer.toString(k);
            if (tmp.length() == 3 && tmp.charAt(0)!= tmp.charAt(1)
                                  && tmp.charAt(0)!= tmp.charAt(2)
                                  && tmp.charAt(1)!= tmp.charAt(2))
                System.out.print(tmp + " ");
        }
        System.out.println();

        // 6.6. «Счастливые» числа.
        System.out.print("'Счастливые' числа: ");
        for (int k : arrey) {
            String tmp = Integer.toString(k);
            int sum1 = 0;
            int sum2 = 0;
            if ((tmp.length() > 3) && (tmp.length() % 2 == 0)) {
                for (int i = 0; i < tmp.length()/2; i++) {
                    char l = tmp.charAt(i);
                    sum1 += Integer.parseInt(String.valueOf(l));
                }
                for (int i = tmp.length()/2; i < tmp.length(); i++) {
                    char m = tmp.charAt(i);
                    sum2 += Integer.parseInt(String.valueOf(m));
                }
                if (sum1 == sum2)
                    System.out.print(tmp + " ");
            }
        }
        System.out.println();


            // 6.7. Элементы, которые равны полусумме соседних элементов.
        System.out.print("Числа, равные полусумме соседних чисел: ");
        for (int i = 1; i < arrey.length-1; i++) {
            if (arrey.length < 3)
                break;
            if(arrey[i] == (arrey[i-1] + arrey[i+1])/2)
                System.out.print(arrey[i]);
        }
        System.out.println();
    }
}
