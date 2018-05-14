import java.util.HashSet;

public class ex0801 {
    public static void main(String[] args) throws Exception {

        HashSet<String> set = new HashSet<String>();
        set.add("арбуз");
        set.add("банан");
        set.add("вишня");
        set.add("груша");
        set.add("дыня");
        set.add("ежевика");
        set.add("женьшень");
        set.add("земляника");
        set.add("ирис");
        set.add("картофель");
        for (String text : set)
        {
            System.out.println(text);
        }

    }
}
