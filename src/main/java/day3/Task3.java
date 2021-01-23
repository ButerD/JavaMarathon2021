package day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double num, div;

        for (int i = 0; i < 5; i++) {
            num = scanner.nextDouble();
            div = scanner.nextDouble();
            if (div == 0) {
                System.out.println("Деление на 0");
                continue;
            }
                System.out.println(num / div);
        }
    }
}
