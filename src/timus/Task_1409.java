package timus;

import java.util.Scanner;

public class Task_1409 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x,y,s;
        x=input.nextInt();
        y=input.nextInt();
        s=x+y-1;
        System.out.println(s-x);
        System.out.println(s-y);

    }
}
