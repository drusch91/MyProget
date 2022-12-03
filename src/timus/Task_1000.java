package timus;

import java.util.Scanner;
public class Task_1000 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int x = 0;
        int y = 0;
        System.out.println("Введите число A:");
        x = in.nextInt();
        System.out.println("Введите число B:");
        y = in.nextInt();
        System.out.println("Сумма чисел " + x + " и " +  y + " Ровна " +(x+y));

    }
}
