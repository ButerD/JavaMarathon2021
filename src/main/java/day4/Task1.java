package day4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numMore8 = 0;
        int numOne = 0;
        int numEven = 0;
        int numOdd = 0;
        int sum = 0, n;

        n = scanner.nextInt();
        int[] array = new int[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            array[i] = random.nextInt(10);
            sum += array[i];
            if(array[i] > 8) numMore8++;
            if(array[i] % 2 == 0) numEven++;
                else
                    numOdd++;
            if(array[i] == 1) numOne++;
        }

        System.out.println(Arrays.toString(array));

        System.out.println("Длина массива: " + n);
        System.out.println("Количество чисел больше 8: " + numMore8);
        System.out.println("Количестао чисел равных 1: " + numOne);
        System.out.println("Количество четных чисел: " + numEven);
        System.out.println("Количество нечетных чисел: " + numOdd);
        System.out.println("Сумма всех элементов массива: " + sum);
    }
}
