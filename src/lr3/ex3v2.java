package lr3;
import java.util.Scanner;
public class ex3v2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x=1;
        int y=1;
        int z;
        int r;
        System.out.println("Введите количество итераций:");
        r = in.nextInt();
        for(int i =3;i<r;i++){
            z=x+y;
            x=y;
            y=z;
            System.out.println(z);
        }
    }
}
