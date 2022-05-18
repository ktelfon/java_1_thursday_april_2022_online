package student_artemijs_talamajevs;

public class CatDemo {
    public static void main(String[] args) {
        Cat bestCat = new Cat("Musjka",3);

        Cat bobik = new Cat("Bob", 18, true);

        System.out.println(bobik.getName());
        System.out.println(bobik.getAge());
        System.out.println(bobik.isHunger());

        System.out.println(bestCat.getAge());
        System.out.println(bestCat.getName());

        bestCat.makeNoise();
        bobik.makeNoise();

        int newAge = bestCat.makeOlder(8);
        System.out.println(newAge);

        bestCat.makeOlder(8);
        System.out.println(bestCat.getAge());

        System.out.println(bestCat.makeOlder(8));
    }
}
