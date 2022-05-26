package student_olegs_liliks;

public class CatDemo {
    public static void main(String[] args) {
        Cat bestCat = new Cat("Musjka",3);

        Cat bobik = new Cat("Bob",18, true );


        System.out.println(bestCat.getAge());
        System.out.println(bestCat.getName());
        System.out.println(bestCat.isHunger());

        System.out.println(bobik.getAge());
        System.out.println(bobik.getName());
        System.out.println(bobik.isHunger());

        bestCat.makeNoise();
        bobik.makeNoise();
        int newAge = bestCat.makeOlder(8);
        System.out.println(newAge);
    }
}
