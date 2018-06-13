import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ex0817 {

    public static HashMap<String, String> createMap() {

        HashMap<String, String> Map = new HashMap<String, String>();

        Map.put("sekSurname1", "kekName1");
        Map.put("sekSurname2", "kekName3");
        Map.put("sekSurname3", "kekName3");
        Map.put("sekSurname4", "kekName");
        Map.put("sekSurname5", "kekName5");
        Map.put("sekSurname6", "kekName");
        Map.put("sekSurname7", "kekName");
        Map.put("sekSurname8", "kekName8");
        Map.put("sekSurname9", "kekName");
        Map.put("sekSurname10", "kekName");

        return Map;

    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {

        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()){
            int freqeuncy = Collections.frequency(copy.values(), pair.getValue());
            if (freqeuncy > 1){
                removeItemFromMapByValue(map, pair.getValue());
            }
        }

    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {

    }

}