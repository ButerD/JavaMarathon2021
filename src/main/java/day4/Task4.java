package day4;

import java.util.Arrays;
import java.util.Random;


public class Task4 {
    public static void main(String[] args) {
        int[] array = new int[10];
        int maxSum = 0;
        int sum;
        int index = 0;
        Random random = new Random();

        for (int i = 0; i < 10; i++)
           array[i] = random.nextInt(10000);
        for (int i = 1; i < array.length - 1; i++) {
            sum = array[i-1] + array[i] + array[i+1];
            if (sum > maxSum){
                maxSum = sum;
                index = i;
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Сумма - " + maxSum + "    Индекс - " + (index + 1));

    }
}
