package student_Vladislavs_Solims.class_exersizes.lesson_3;

import student_Vladislavs_Solims.class_exersizes.lesson_3.Cat;

public class CatDemo {
    public static void main(String[] agrgs) {

        Cat bestCat = new Cat("Musjka", 3);

        Cat bobik = new Cat("Bob", 18);

        System.out.println(bestCat.getName());
        System.out.println(bestCat.getAge());
        System.out.println(bobik.isHunger());

        System.out.println(bobik.getName());
        System.out.println(bobik.getAge());

        bestCat.makeNoise();
        bobik.makeNoise();

        int newAge = bestCat.make0lder(8);
        System.out.println(bestCat.getAge());

        bestCat.make0lder(8);
        System.out.println(bestCat.getAge());

        System.out.println(bestCat.make0lder(8));


    }
}
