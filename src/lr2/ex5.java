package lr2;

import java.util.Scanner;
public class ex5 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите число:");
        int x= in.nextInt();

        System.out.println("Тысяч в числе: " + (x/1000));


        }

    }

//Напишите программу котрая проверяет сколько тысяч в веденном пользователе числе
//(определяется четвертая цифра справа в дисятичном представлении число).