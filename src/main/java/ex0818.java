import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ex0818 {

    public static HashMap<String, Integer> createMap() {

        HashMap<String, Integer> Map = new HashMap<String, Integer>();

        Map.put("ekSurname1", 123);
        Map.put("ekSurname2", 234);
        Map.put("ekSurname3", 345);
        Map.put("ekSurname4", 654);
        Map.put("ekSurname5", 465);
        Map.put("ekSurname6", 767);
        Map.put("ekSurname7", 474);
        Map.put("ekSurname8", 789);
        Map.put("ekSurname9", 697);
        Map.put("ekSurname10", 987);

        return Map;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        //напишите тут ваш код
        HashMap<String, Integer> copy = new HashMap<String, Integer>(map);
        for (Map.Entry<String, Integer> pair : copy.entrySet()) {
            if (pair.getValue() < 500)
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {

    }

}