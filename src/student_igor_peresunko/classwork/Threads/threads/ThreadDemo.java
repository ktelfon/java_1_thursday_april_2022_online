package student_igor_peresunko.classwork.Threads.threads;

public class ThreadDemo {
    public static void main(String[] args) throws InterruptedException {

       Counter counter = new Counter();

        Thread lambdaPrinterThread = new Thread(new Printer(counter), "lambda");
        Thread printerThread = new Thread( new Printer(counter), "printer");
        Thread printerJoinThread = new Thread( new Printer(counter), "joiner");


        TimePrinter timePrinter =  new TimePrinter();
        Thread timeThread = new Thread(timePrinter);
//        timeThread.start();
//        Thread.sleep(1000);
//        timePrinter.setRunning(false);
        printerJoinThread.start();
        timeThread.join();
        lambdaPrinterThread.setPriority(Thread.MAX_PRIORITY);
        lambdaPrinterThread.start();
        printerThread.start();









    }
}
