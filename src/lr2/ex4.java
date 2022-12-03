package lr2;

import java.util.Scanner;
public class ex4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int x = 0;
        int y = x;
        System.out.println("Введите число");
        x = in.nextInt();
        if ( x >=5 )  if (x <= 10 ) {
         System.out.println("Число " + x + " попадает в диапозон от 5 до 10");}
        else { System.out.println("Число " + x + " не попадает в диапозон от 5 до 10");
        }

    }
}

//Напишите программу котрая проверяет, попадет ли введеное число пользователем
//в диапозон от 5 до 10 включительно.