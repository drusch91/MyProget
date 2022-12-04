package MyTest;
import java.util.Arrays;
public class Test {
    public static void main(String[] args) {
        int[] arr = {3, 7 ,11, 1, 20};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void sort(int[] arr) {
        int tmp = 0, k = arr.length -2;
        boolean is_swap = false;
        for (int i = 0; i<=k; i++) {
            is_swap = false;
            for (int j =k; j >=i; j--) {
                if (arr[j] >arr[j] +1){
                    tmp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = tmp;
                    is_swap = true;
                }
            }
            if (is_swap == false) break;
        }
    }

    }
