import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class ex0809 {

    public static void main(String[] args) {
        System.out.println(getTimeMsOfInsert(new ArrayList()));
        System.out.println(getTimeMsOfInsert(new LinkedList()));
    }

    public static long getTimeMsOfInsert(List list) {

        Date currentTime = new Date();
        insert10000(list);
        Date newTime = new Date();
        long msDelay = newTime.getTime() - currentTime.getTime();
        return msDelay;

    }

    public static void insert10000(List list) {
        for (int i = 0; i < 10000; i++) {
            list.add(0, new Object());
        }
    }

}