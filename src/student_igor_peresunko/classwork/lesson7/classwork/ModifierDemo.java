package student_igor_peresunko.classwork.lesson7.classwork;

public class ModifierDemo {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Dog dog2 = new Dog();
        dog.setName("Archi");
        dog2.setName("Archi");

        System.out.println(dog.equals(dog2));
        System.out.println(dog);
        System.out.println(dog2);
    }
}
