import java.util.Iterator;
import java.util.Set;
import java.util.HashSet;

public class ex0819 {

    public static void main(String[] args) {
        Set<Cat> cats = createCats();

        Iterator<Cat> it = cats.iterator();
        it.next();
        it.remove();

        printCats(cats);
    }

    public static Set<Cat> createCats() {
        //напишите тут ваш код. step 2 - пункт 2

        HashSet<Cat> cats = new HashSet<Cat>(3);

        for (int i = 0; i < 3; i++) {
            Cat cat = new Cat();
            cats.add(cat);
        }

        return cats;
    }

    public static void printCats(Set<Cat> cats) {
        // step 4 - пункт 4
        for (Cat cat : cats){
            System.out.println(cat);
        }
    }

    public static class Cat {

    }

}