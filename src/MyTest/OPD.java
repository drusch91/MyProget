package MyTest;
import java.util.Scanner;
public class OPD {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Плановый бюджет:");
        float a = in.nextInt();
        System.out.println("Запланированный срок:");
        float b = in.nextInt();
        System.out.println("Время проверки на 'Сегодня':");
        float c = in.nextInt();
        System.out.println("Готовность на 'Сегодня':");
        float d = in.nextInt();
        System.out.println("Расходы на 'Сегодня':");
        float f = in.nextInt();

        float g = OPD.GetEstimation(c, 100f, d);
        float x = OPD.GetOverrun(g, b);
        System.out.println("Задержка срока: " + x);

        float k = OPD.GetEstimation(g, f, c);
        float y = OPD.GetOverrun(k, a);
        System.out.println("Перерасход бюджета: " + y);
    }

    static float GetEstimation(float a, float b, float c) {
        return (a*b)/c;
    }

    static float GetOverrun(float a, float b) {
        return a-b;
    }
}
