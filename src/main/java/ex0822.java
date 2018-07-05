import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ex0822 {

    public static void main(String[] args) throws Exception {
        List<Integer> integerList = getIntegerList();
        System.out.println(getMinimum(integerList));
    }

    public static int getMinimum(List<Integer> array) {
        // find minimum here — найти минимум тут

        int min = array.get(0);

        for (Integer i: array) {
            if (i < min)
                min = i;
        }

        return min;
    }

    public static List<Integer> getIntegerList() throws IOException {
        //create and initialize a list here - создать и заполнить список тут

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(reader.readLine());

        ArrayList<Integer> array = new ArrayList<Integer>();

        for (int i = 0; i < size; i++)
        {
            array.add(Integer.parseInt(reader.readLine()));
        }

        return array;
    }

}