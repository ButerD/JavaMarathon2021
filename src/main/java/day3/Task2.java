package day3;

import java.util.Scanner;

/*
Реализовать программу, которая пока работает, принимает на вход от пользователя два числа - делимое и делитель.
 Для этих двух чисел программа рассчитывает результат деления и выводит его в консоль.
  Программа останавливает свою работу тогда, когда пользователь вводит 0 в качестве делителя.
(для этих вещественных чисел необходимо использовать тип double и метод nextDouble() у Scanner’а соответственно).

 */
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double num, div;

        while(true){
            num = scanner.nextDouble();
            div = scanner.nextDouble();
            if(div == 0) break;
            else
                System.out.println(num / div);
        }
    }
}
