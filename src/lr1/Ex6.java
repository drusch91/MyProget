package lr1;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Your name");
        String name = in.nextLine();

        System.out.println("Your name:" + name);
        in.close();
    }
}
