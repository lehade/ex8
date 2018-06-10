import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class ex0810 {

    public static void main(String[] args) {
        System.out.println(getTimeMsOfGet(fill(new ArrayList())));
        System.out.println(getTimeMsOfGet(fill(new LinkedList())));
    }

    public static List fill(List list) {
        for (int i = 0; i < 10000; i++) {
            list.add(new Object());
        }
        return list;
    }

    public static long getTimeMsOfGet(List list) {

        Date currentTime = new Date();
        get10000(list);
        Date newTime = new Date();
        long msDelay = newTime.getTime() - currentTime.getTime();
        return msDelay;

    }

    public static void get10000(List list) {
        if (list.isEmpty()) return;
        int x = list.size() / 2;

        for (int i = 0; i < 10000; i++) {
            list.get(x);
        }
    }

}