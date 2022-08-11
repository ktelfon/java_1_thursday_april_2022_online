package student_Vladislavs_Solims.class_exersizes.lesson_16;

import java.time.LocalDateTime;

public class TimePrinter implements Runnable{

    private boolean running = true;

    @Override
    public void run() {
        while(running) {
            System.out.println(LocalDateTime.now());
        }
    }

    public boolean isRunning() {
        return running;
    }

    public void setRunning(boolean running) {
        this.running = running;
    }
}
