package lr1;

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {

            Scanner in = new Scanner(System.in);

            System.out.print("Введите первое число:");
            int x = in.nextInt();

            System.out.print("Введите второе число:");
            int y = in.nextInt();


            System.out.println(x + " + " + y  + " = " + (x+y));
            in.close();
    }
}

//Напишите программу для вычисления суммы двух чисел. Оба числа вводятся пользователем.
// Для вычисления суммы используйте оператор +