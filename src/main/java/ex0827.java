import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import static java.lang.Math.toIntExact;

public class ex0827 {

    public static void main(String[] args) throws Exception{
        System.out.println(isDateOdd("MAY 1 2013"));

    }

    public static boolean isDateOdd(String date) throws Exception {

        DateFormat formatter = new SimpleDateFormat("MMM d yyyy");
        Date datea = formatter.parse(date);
        Date yearStartTime = new Date();
        yearStartTime.setDate(0);      // первое число
        yearStartTime.setMonth(0);
        int year = datea.getYear();
        yearStartTime.setYear(year);
        long ms = datea.getTime() - yearStartTime.getTime();
        long mss = ms / 1000 / 60 / 60 / 24;
        int days = toIntExact(mss);
        if ((days % 2) == 0)
        return true;
        else return false;

    }

}