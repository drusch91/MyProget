package lr1;

import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Введите первое число:");
        int x = in.nextInt();

        System.out.print("Введите второе число:");
        int y = in.nextInt();


        System.out.println("Сумма чисел = " + x + " + " + y  + " = " + (x+y));
        System.out.println("Разность чисел = " + x + "-" + y + "=" + (x-y));
        in.close();
    }
}
//Напишите программу, в которой Пользователь вводит два числа,
//а программой вычисляется и отображается сумма и разность этих чисел