package day2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        Double x = scaner.nextDouble();
        Double y = 0.0;
        if( (x > -3) && (x < 5))    y = (x + 3.0)*(x*x - 2.0);
        if(x >= 5)                  y = (x*x - 10.0)/(x + 7.0);
        if(x < -3)                  y = 420.0;
        System.out.println(y);
    }
}
