import java.util.Map;
import java.util.HashMap;

public class ex0821 {

    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {
        //напишите тут ваш код
        Map<String, String> Map = new HashMap<String, String>();

        Map.put("sekSurname", "kekName1");
        Map.put("sekSurname2", "kekName3");
        Map.put("sekSurname3", "kekName3");
        Map.put("sekSurname", "kekName");
        Map.put("sekSurname5", "kekName5");
        Map.put("sekSurname", "kekName");
        Map.put("sekSurname7", "kekName");
        Map.put("sekSurname8", "kekName8");
        Map.put("sekSurname9", "kekName");
        Map.put("sekSurname", "kekName");

        return Map;
    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }

}