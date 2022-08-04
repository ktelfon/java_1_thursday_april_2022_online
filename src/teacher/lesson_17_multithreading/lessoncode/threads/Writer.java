package teacher.lesson_17_multithreading.lessoncode.threads;

public class Writer extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println("Hello from writer " + i);
        }
    }
}
