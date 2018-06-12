import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

public class ex0815 {

    public static HashMap<String, String> createMap() {

        HashMap<String, String> Map = new HashMap<String, String>();

        Map.put("kekSurname1", "kekName1");
        Map.put("kekSurname2", "kekName3");
        Map.put("kekSurname3", "kekName3");
        Map.put("kekSurname4", "kekName");
        Map.put("kekSurname5", "kekName5");
        Map.put("kekSurname6", "kekName");
        Map.put("kekSurname7", "kekName");
        Map.put("kekSurname8", "kekName8");
        Map.put("kekSurname9", "kekName");
        Map.put("kekSurname10", "kekName");

        return Map;

    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        //напишите тут ваш код
        int counterSmeName = 0;
        for (String n : map.values()){
            if(n.equals(name)){
                counterSmeName++;
            }
        }
        return counterSmeName;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        //напишите тут ваш код
        int counterSmelastname = 0;
        for (String n : map.keySet()){
            if(n.equals(lastName)){
                counterSmelastname++;
            }
        }
        return counterSmelastname;
    }
    public static void main(String[] args) {

    }

}