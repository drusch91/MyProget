package lr4;

public class ex2 {
    public static void main(String[] args) {
        int figure = 15; // число столбцов которое необходимо вывести
        int i ; // переменная задает число, необходимое для расчета количества строк
        int j ; // переменная задает число, необходимое для расчета количества колонок (символов в строке)
        int z=0; // переменная необходима для вывода служебного сообщения о количестве символов в строке;
        for (i = 1 ; i <= figure; i++){
            System.out.print("номер строки: " + i + " ");
            for (j = 0; j <=z; j++){
                System.out.print("+");
            }
            z = z + 1;
            System.out.println(" Количество символов в строке " + z);
        }
    }
}
