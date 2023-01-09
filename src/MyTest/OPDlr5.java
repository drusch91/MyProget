package MyTest;
import java.util.Scanner;
public class OPDlr5 {
    public static void main(String[] args){
        float[] oneDis, eventHand, busObject, addNewBusMethod;
        oneDis = getClock("Введите статистические данные для одного экрана:");
        eventHand = getClock("Введите данные для одного обработчика событий:");
        busObject = getClock("Введите данные для одного бизнес-объекта:");
        addNewBusMethod = getClock("Введите данные для добавления нового бизнес-метода:");
        int[] numberElement = getNumberElement();
        float e = avComOfCod(oneDis) * numberElement[0] + avComOfCod(eventHand) * numberElement[1] + avComOfCod(busObject)
                * numberElement[2] + avComOfCod(addNewBusMethod) * numberElement[3];
        float cko =(float) (Math.pow(avDeviation(oneDis), 2)*numberElement[0] + Math.pow(avDeviation(eventHand), 2)*
                numberElement[1] + Math.pow(avDeviation(busObject), 2) * numberElement[2] +
                Math.pow(avDeviation(addNewBusMethod), 2) * numberElement[3]);
        cko = (float) Math.sqrt(cko);
        float e95 = e + 2 * cko;
        float delta = (cko/e)*100;
        float esum = e95*4;
        float ncm = esum / 132;
        double t = 3;
        t = 1 / t;
        t = (float) (Math.pow((ncm), (t)));
        t = (float) (t * 2.5);
        float kav = (float) (ncm / t);


        System.out.println("Eui="+avComOfCod(oneDis) + " (чел.*час)");
        System.out.println("EAct="+avComOfCod(eventHand) + " (чел.*час)");
        System.out.println("Ebo="+avComOfCod(busObject) + " (чел.*час)");
        System.out.println("Eui="+avComOfCod(addNewBusMethod) + " (чел.*час)");
        System.out.println();
        System.out.println("CKOui="+avDeviation(oneDis) + " (чел.*час)");
        System.out.println("CKOAct="+avDeviation(eventHand) + " (чел.*час)");
        System.out.println("CKObo="+avDeviation(busObject) + " (чел.*час)");
        System.out.println("CKObm="+avDeviation(addNewBusMethod) + " (чел.*час)");

        System.out.println("E=" + e + " (чел.*час)");
        System.out.println("СКО=" + cko + " (чел.*час)");
        System.out.println("E95=" + e95 + " (чел.*час)");
        System.out.println("Δ="+delta + " (%)");
        System.out.println("Esum="+esum + " чел.*час");
        System.out.println("Nm=" + ncm + " (чел. * месяцах_");
        System.out.println("T=" + t + " (месяцев)");
        System.out.println("K=" + kav + " (человек)");
    }
    static float[] getClock(String message){
        /// Указываем время необходимое для разработки и отладки
        System.out.println(message);
        Scanner in = new Scanner(System.in);
        float[] array = new float[3];
        for (int i=0; i < array.length; i++){
            array[i] = in.nextInt();
        }
        return array;
    }

    static int[] getNumberElement(){
        int[] array = new int[4];
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество пользовательских экранов:");
        array[0] = in.nextInt();
        System.out.println("Введите количество обработчиков событий:");
        array[1] = in.nextInt();
        System.out.println("Введите количество новых бизнес объектов:");
        array[2] = in.nextInt();
        System.out.println("Введите количество новых или мод-ых бизнес объектов:");
        array[3] = in.nextInt();

        return array;
    }

    static float avComOfCod(float[] array){ // Оценка средней трудоемкости по каждому элементарному пакету
        float result;
        result = (array[1] + 4 * array[2] + array[0])/6;

        return result;
    }

    static float avDeviation(float[] array){
        float result;
        result = (array[1] - array[0])/6;
        return result;
    }

//    static float sumAvComOfCod();
}
