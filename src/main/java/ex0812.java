import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ex0812 {

    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < 10; i++) {
            list.add(Integer.parseInt(reader.readLine()));
        }

        int result = 1, tmpResult = 0, prevNum = Integer.MIN_VALUE;
        for (Integer currentNum : list) {
            if (prevNum != currentNum) {
                tmpResult = 1;
                prevNum = currentNum;
                continue;
            }

            tmpResult++;
            if (result < tmpResult)
                result = tmpResult;
        }

        System.out.println(result);

    }

}