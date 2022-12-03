package lr1;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Ваше фамилия:");
        String fam = in.nextLine();

        System.out.println("Имя:");
        String name = in.nextLine();

        System.out.println("Ваше отчество:");
        String ot = in.nextLine();

        System.out.println("Hello " +  fam + ", " + name + ", " + ot);
        in.close();
    }
}
//Напишите программу, в которой Пользователь
//вводит сначала фамилию, затем имя, затем отчество.
//После ввода программа выводит сообщение «Hello <фамилия, имя, отчество>»