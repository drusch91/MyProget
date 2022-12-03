package lr1;


import java.util.Scanner;


public class Ex10 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Текущий год:");
        int x = in.nextInt();

        System.out.print("Ваш год рождения:");
        int g = in.nextInt();


        System.out.println("Ваш возраст:" + (x-g));
        in.close();
    }
}

//Напишите программу, в которой по году рождения определяется возраст пользователя.