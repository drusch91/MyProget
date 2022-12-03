package lr1;

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {

    Scanner in = new Scanner(System.in);

    System.out.println("Введите текущий день недели:");
    String day = in.nextLine();

    System.out.println("Введите текущий месяц:");
    String month = in.nextLine();

    System.out.println("Введите текущую дату:");
    int data = in.nextInt();

    System.out.println("Текущий день:" + day);
    System.out.println("Текущая дата:" + data);
    System.out.println("Текущий месяц:" + month);
    in.close();

    }
}
//Напишите программу, в которой Пользователь последовательно вводит название текущего дня недели,
//название месяца и дату (номер дня в месяце).
//Программа выводит сообщение о сегодняшней дате (день недели, дата, месяц).