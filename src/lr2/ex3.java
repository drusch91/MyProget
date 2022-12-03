package lr2;

import java.util.Scanner;
public class ex3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите число:");
        int x = in.nextInt();
        int y = x % 4;

        if (x > 10){
            System.out.println("Введеное число делиться на 4 и не меньше 10");
        } else {
            System.out.println("Введеное число меньше 10");
        }

    }
}

//Напишите программу котрая проверяет удволетворяет ли введеное
//число следующим критерия: число делиться на 4, и при этом оно
//не меньше 10.