package student_Vladislavs_Solims.homework.lesson_17.level2;

public class Demo {
    public static void main(String[] args) {

        Task4 generator = new Task4();
        for (int i = 0; i < 5; i++) {
            new Thread(() ->{
                for (int j = 0; j < 10; j++) {
                    generator.nextId();
                    System.out.println(generator.nextId());
                }
            }).start();
        }
        System.out.println(generator.getId());
    }
}
