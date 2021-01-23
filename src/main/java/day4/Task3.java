package day4;

import java.util.Random;

/*
Заполнить двумерный массив (матрицу) случайными числами от 0 до 50.
Размер матрицы задать m=12, n=8 (m - размерность по строкам, n - размерность по колонкам).
В консоль вывести индекс строки, сумма чисел в которой максимальна.
Если таких строк несколько, вывести индекс последней из них.
Пример сгенерированной матрицы (для простоты m=3, n=5):

3 2 1 5 7 	// сумма - 18
1 2 5 6 2 	// сумма - 16
3 4 9 6 4	// сумма - 26

Ответ: 2 (индекс строки, сумма чисел в которой максимальна)

 */
public class Task3 {
    public static void main(String[] args) {
        int[][] array = new int[12][8];
        int[] arrSum = new int[12];
        int sum = 0;
        int index = 0;
        int max, min;
        Random random = new Random();

        for (int i = 0; i < 12; i++) {
            sum = 0;
            for (int j = 0; j < 8; j++) {
                array[i][j] = random.nextInt(50);
                sum += array[i][j];
            }
            arrSum[i] = sum;
        }

        for (int i = 0; i < 12; i++) {
            max = array[i][0];
            min = array[i][0];
            if(sum <= arrSum[i]) {
                sum = arrSum[i];
                index = i;
            }
            for (int j = 0; j < 8; j++) {
                array[i][j] = random.nextInt(50);
            }
        }
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.print("     // сумма   - " + arrSum[i]);
            System.out.println();
        }
        System.out.println("Ответ: " + (index + 1)+ " (индекс строки, сумма чисел в которой максимальна)");
    }
}
