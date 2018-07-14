import java.io.*;
import java.util.*;

public class ex0829 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //list of addresses
        Map<String, String> addresses = new HashMap<String, String>();
        while (true) {
            String city = reader.readLine();
            if (city.isEmpty()) break;
            String family = reader.readLine();

            addresses.put(city, family);
        }

        //read home number
        //int houseNumber = Integer.parseInt(reader.readLine());

        String city = reader.readLine();

        //if (0 <= city && city < addresses.size()) {
        String familySecondName = addresses.get(city);

        for (Map.Entry<String, String> entry : addresses.entrySet()) {
            if (entry.getKey().equals(city)) {
                System.out.println(familySecondName);
            }
        }

        //}
    }

}