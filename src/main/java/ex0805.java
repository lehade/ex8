import java.util.HashMap;
import java.util.Map;

public class ex0805 {
    public static void main(String[] args) throws Exception {
        HashMap<String, String> map1 = new HashMap<String, String>();
        map1.put("Sim1", "Sim");
        map1.put("Tom", "Tom");
        map1.put("Arbus", "Arbus");
        map1.put("Baby", "Baby");
        map1.put("Cat", "Cat");
        map1.put("Dog", "Dog");
        map1.put("Eat", "Eat");
        map1.put("Food", "Food");
        map1.put("Gevey", "Gevey");
        map1.put("Hugs", "Hugs");

        printKeys(map1);
    }

    public static void printKeys(Map<String, String> map) {
        //напишите тут ваш код
        for (Map.Entry<String, String> pair : map.entrySet()) {

                String value = pair.getValue();
                System.out.println(value);
            }
        }

    }