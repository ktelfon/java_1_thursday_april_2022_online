package student_olga_dubrovskaja.homework.lesson_9.level_1.task_1_to_task4;

public class DefaultConstructorV3Demo {

    public static void main(String[] args) {
        DefaultConstructorV3 constructorV3 = new DefaultConstructorV3();
        System.out.println("name: " + constructorV3.getFullName());
        System.out.println("age: " + constructorV3.getAge());
        System.out.println("male: " + constructorV3.isMale());
        System.out.println("female: " + constructorV3.isFemale());
    }
}
