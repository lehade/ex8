import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class ex0816 {

    public static HashMap<String, Date> createMap() throws ParseException {
        DateFormat df = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        HashMap<String, Date> map = new HashMap<String, Date>();

        map.put("Stallone", df.parse("JUNE 1 1980"));
        map.put("Qwer", df.parse("February 1 1980"));
        map.put("ZXcv", df.parse("March 1 1980"));
        map.put("ASddd", df.parse("April 1 1980"));
        map.put("dfghd", df.parse("May 1 1980"));
        map.put("DGgsdgf", df.parse("JUNE 1 1980"));
        map.put("cvbnncn", df.parse("July 1 1980"));
        map.put("xvvvv", df.parse("August 1 1980"));
        map.put("dikitu", df.parse("September 1 1980"));
        map.put("dgfhhh", df.parse("OCTOBER 1 1980"));

        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        //напишите тут ваш код

        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()) {
            HashMap.Entry<String, Date> pair = iterator.next();
            if (pair.getValue().getMonth() > 5 & pair.getValue().getMonth() < 7)
                iterator.remove();
        }

    }

    public static void main(String[] args) {

    }

}