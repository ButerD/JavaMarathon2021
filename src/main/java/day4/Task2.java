package day4;

import java.util.Random;

/*
2. Создать новый массив размера 100 и заполнить его случайными числами из диапазона от 0 до 10000.
Затем, используя циклы for each вывести в консоль:
наибольший элемент массива
наименьший элемент массива
количество элементов массива, оканчивающихся на 0
сумму элементов массива, оканчивающихся на 0

 */
public class Task2 {
    public static void main(String[] args) {
        int[] array = new int[100];
        int max, min;
        int numZero = 0, sumZero = 0;
        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            array[i] = random.nextInt(1000);
        }
        max = array[0];
        min = array[0];
        for(int i : array){
            if(i > max) max = i;
            if(i < min) min = i;
            if(i % 10 == 0){
                numZero++;
                sumZero += i;
            }
        }

        System.out.println(max + " - наибольший элемент массива");
        System.out.println(min + " - наименьший элемент массива");
        System.out.println(numZero + " - количество элементов массива, оканчивающихся на 0");
        System.out.println(sumZero + " - сумму элементов массива, оканчивающихся на 0");

    }
}
