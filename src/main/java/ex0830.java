import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ex0830 {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] array = new String[3];
        for (int i = 0; i < array.length; i++) {
            array[i] = reader.readLine();
        }

        sort(array);

        for (String x : array) {
            System.out.println(x);
        }
    }

    public static void sort(String[] array) {
        //напишите тут ваш код

        Arrays.sort(array);
       isGreaterThan("a", "b");
        // System.out.println(Arrays.toString(array));

    }

    //Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b) {
        return true;
    }

}