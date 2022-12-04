package lr3;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int day = 0;
        System.out.println("Введите номер дня в неделе:\n\n");
        day = in.nextInt();
        switch (day) {
            case 1:
                System.out.println("1 День - Понедельник");
            break;
            case 2:
                System.out.println("2 День - Вторник");
            break;
            case 3:
                System.out.println("3 День - Среда");
            break;
            case 4:
                System.out.println("4 День - Четверг");
            break;
            case 5:
                System.out.println("5 День - Пятница");
            break;
            case 6:
                System.out.println("6 День - Суббота");
            break;
            case 7:
                System.out.println("7 День - Воскресенье");
                break;
            default:
                System.out.println("Введен несуществущий номер дня в неделе, введите от 1 до 7!");
        }
    }
}
