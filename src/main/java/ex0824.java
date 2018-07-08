import java.util.ArrayList;

public class ex0824 {

    public static void main(String[] args) {
        //напишите тут ваш код

        ArrayList<Human> children = new ArrayList<>();
        children.add(new Human("Vasya", true,10));
        children.add(new Human("Lena", false, 13));
        children.add(new Human("Vanya", true, 12));

        ArrayList<Human> parents = new ArrayList<>();
        Human ma = new Human("Mama", false,30, children);
        parents.add(ma);
        ArrayList<Human> parents1 = new ArrayList<>();
        Human pa = new Human("Papa", true,33, children);
        parents1.add(pa);

        ArrayList<Human> gparents1 = new ArrayList<>();
        gparents1.add (new Human("Babka", false, 65, parents));
        gparents1.add (new Human("Ded", true, 67, parents));
        gparents1.add (new Human("Babka1", false, 67, parents1));
        gparents1.add (new Human("Ded1", true, 67, parents1));

        for (int i = 0; i < children.size(); i++) {
            System.out.println(children.get(i).toString());
        }
        for (int i = 0; i < parents.size(); i++) {
            System.out.println(parents.get(i).toString());
        }
        for (int i = 0; i < parents1.size(); i++) {
            System.out.println(parents1.get(i).toString());
        }
        for (int i = 0; i < gparents1.size(); i++) {
            System.out.println(gparents1.get(i).toString());
        }
    }

    public static class Human {
        //напишите тут ваш код

        String name;
        Boolean sex;
        int age;
        ArrayList<Human> children= new ArrayList<>();

         Human(String name, boolean sex, int age, ArrayList<Human> children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        Human(String name, boolean sex,int age ){
            this.name=name;
            this.sex=sex;
            this.age=age;

        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }

}