package lr1;

import java.util.Scanner;


public class Ex14 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Введите число:");
        int x = in.nextInt();

        System.out.println(x-1);
        System.out.println(x);
        System.out.println(x+1);
        System.out.println((x-1+x+x+1)*(x-1+x+x+1));

        in.close();

    }
}

//Напишите программу, в которой пользователь вводит число, а программой отображается последовательность из четырех чисел: число, на единицу меньше введённого,
//введенное число и число, на единицу больше введенного. Четвертое число должно быть квадратом суммы первых трех чисел