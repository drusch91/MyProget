package lr1;
import java.util.Random;
import java.util.Arrays;
public class Test2
{
    public static void nextBytes(byte[]a) {
        byte[] arr = new byte[10];
        Random r = new Random();
        r.nextBytes(arr);
        for (byte x: arr)
        System.out.print(x + "");


    }
}
