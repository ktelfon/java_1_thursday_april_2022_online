package student_Vladislavs_Solims.class_exersizes.lesson_16;

public class Writer extends Thread {
    private Counter counter;

    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 50; i++) {
            System.out.println("Hello from Writer" +i);
        }
    }
}
