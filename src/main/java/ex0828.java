import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.Month;
import java.util.HashMap;
import java.util.Map;

public class ex0828 {

    public static void main(String[] args) throws IOException {
        //напишите тут ваш код

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //int month = Integer.parseInt(reader.readLine());

        /*Month month = Month.valueOf(reader.readLine());
        System.out.println(month + " is the " + month.getValue() + " month");*/


        String month = reader.readLine();

        Map<Integer, String> Map = new HashMap<Integer, String>();
        Map.put(1, "January");
        Map.put(2, "February");
        Map.put(3, "March");
        Map.put(4, "April");
        Map.put(5, "May");
        Map.put(6, "June");
        Map.put(7, "July");
        Map.put(8, "August");
        Map.put(9, "September");
        Map.put(10, "October");
        Map.put(11, "November");
        Map.put(12, "December");

        for (java.util.Map.Entry<Integer, String> entry : Map.entrySet()) {
            if (entry.getValue().equals(month)) {
                System.out.println(month + " is the " + entry.getKey() + " month");
            }
        }

    }

}