package lr1;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите свое имя");
        String name = in.nextLine();

        System.out.println("Введите свой возраст");
        int g = in.nextInt();

        System.out.println("Ваше имя: " + name + " Ваш возраст: " + g);
        in.close();

    }
}


//Напишите программу, в которой Пользователь вводит имя и год рождения,
//в программа отображает сообщение содержащее имя пользователя и его возраст.