package lr2;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите число:");
        int x = in.nextInt();
        int y = x % 5;

        if (x == 2){
            System.out.println("Введеное число делится на 5 с остатком 2" + x);
        } else {
            System.out.println("Введеное число не делится на 5 без остатка 2");
        }

    }
}
//Напишите программу котрая проверяет, удволетворяет ли введенное пользователем число следующим критериям
//при делении на 5 в остатке получается 2, а при делении на 7 в остатке получется 1.


