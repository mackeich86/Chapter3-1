package org.example;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Создаем массив из 20 элементов
        int[] array = new int[20];

        // Заполняем массив случайными значениями
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(21) - 10; // Генерируем случайные целые числа в диапазоне от -10 до +10
        }

        // Выведите весь массив целиком
        System.out.println("Сгенерированный массив:");
        System.out.println(Arrays.toString(array));

        // Находим наибольшее отрицательное число и наименьшее положительное число
        int maxNegative = Integer.MIN_VALUE;
        int minPositive = Integer.MAX_VALUE;

        for (int num : array) {
            if (num < 0 && num > maxNegative) {
                maxNegative = num;
            }
            if (num > 0 && num < minPositive) {
                minPositive = num;
            }
        }

        // Выводим наибольшее отрицательное число и наименьшее положительное число
        System.out.println("Наибольшее отрицательное число: " + (maxNegative != Integer.MIN_VALUE ? maxNegative : "Нет отрицательных чисел"));
        System.out.println("Наименьшее положительное число: " + (minPositive != Integer.MAX_VALUE ? minPositive : "Нет положительных чисел"));

        // Меняем местами найденные значения
        if (maxNegative != Integer.MIN_VALUE && minPositive != Integer.MAX_VALUE) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] == maxNegative) {
                    array[i] = minPositive;
                } else if (array[i] == minPositive) {
                    array[i] = maxNegative;
                }
            }

            // Выводим наибольшее отрицательное число и наименьшее положительное число после замены
            System.out.println("Наибольшее отрицательное число число после обмена: " + maxNegative);
            System.out.println("Наименьшее положительное число после обмена: " + minPositive);

            // Выводим массив с замененными значениями
            System.out.println("Замененный массив:");
            System.out.println(Arrays.toString(array));
        } else {
            System.out.println("Не удалось найти наибольшее отрицательное или наименьшее положительное число。");
        }
    }
}
