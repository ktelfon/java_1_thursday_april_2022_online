package student_igor_peresunko.classwork.Threads.threads;

import java.time.LocalDateTime;

public class TimePrinter implements Runnable {

    private volatile boolean running = true;

    @Override
    public void run() {
        while(running){
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
