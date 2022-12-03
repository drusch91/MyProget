package lr1;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {

            Scanner in = new Scanner(System.in);

            System.out.print("Текущий год:");
            int x = in.nextInt();

            System.out.print("Ваш возраст:");
            int g = in.nextInt();


            System.out.println("Ваш год рождения:" + (x-g));
            in.close();

    }
}
//Напишите программу, в которой по возрасту определяется год рождения.