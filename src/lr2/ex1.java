package lr2;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int x = 0;
        System.out.println("Введите число");
        x = in.nextInt();

        if (x % 3 == 0)
            System.out.println(x + " - Делится на 3");
        else
            System.out.println(x + " - Не делится на 3");
        System.out.println();

//Напишите программу которая проверяет, делиться ли введеное пользываетелм число на 3


    }
}
