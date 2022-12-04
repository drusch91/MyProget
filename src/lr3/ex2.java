package lr3;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            String day;
            System.out.println("Введите название дня в неделе:");
            day = in.nextLine();
            switch (day) {
                case "Понедельник":
                    System.out.println("1 День");
                    break;
                case "Вторник":
                    System.out.println("2 День");
                    break;
                case "Среда":
                    System.out.println("3 День");
                    break;
                case "Четверг":
                    System.out.println("4 День");
                    break;
                case "Пятница":
                    System.out.println("5 День");
                    break;
                case "Суббота":
                    System.out.println("6 День");
                    break;
                case "Воскресенье":
                    System.out.println("7 День");
                    break;
                default:
                    System.out.println("Введено несуществующие название дня в неделе\nвведите от Понедельника до Пятницы!");
            }
        }
    }
