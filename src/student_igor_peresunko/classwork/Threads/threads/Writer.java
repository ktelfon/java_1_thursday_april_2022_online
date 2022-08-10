package student_igor_peresunko.classwork.Threads.threads;

public class Writer extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println("Hello from writer " + i);
        }
    }
}
