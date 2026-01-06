package app;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // 1. Створюємо масив з 15 елементів (зробила як у прикладі в цей раз)
        int[] a = {45, 32, 78, 12, 88, 2, 65, 34, 98, 7, 55, 23, 67, 41, 91};

        // 2. Виводимо початковий масив
        System.out.println("Початковий вигляд масиву: " + Arrays.toString(a));

        // 3. Сортування масиву методом вставки (Insertion Sort)
        for (int i = 1; i < a.length; i++) {
            int key = a[i];      // елемент, який вставляємо
            int j = i - 1;

            while (j >= 0 && a[j] > key) {
                a[j + 1] = a[j];
                j = j - 1;
            }

            a[j + 1] = key;
        }

        // 4. Виводимо відсортований масив
        System.out.println("Відсортований масив: " + Arrays.toString(a));

        // 5. ВВедіть число для пошуку
        Scanner sc = new Scanner(System.in);
        System.out.print("Введіть число для пошуку: ");
        int target = sc.nextInt();

        // 6. Бінарний пошук
        int left = 0;
        int right = a.length - 1;
        int index = -1;

        while (left <= right) {
            int middle = (left + right) / 2;

            if (a[middle] == target) {
                index = middle;
                break;
            } else if (a[middle] < target) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }

        // 7. Виводимо результат пошуку в консоль
        if (index != -1) {
            System.out.println("Індекс числа " + target + " у відсортованому масиві: " + index);
        } else {
            System.out.println("Число не знайдено у масиві");
        }
    }
}