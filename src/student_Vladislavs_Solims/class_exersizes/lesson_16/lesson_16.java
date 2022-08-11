package student_Vladislavs_Solims.class_exersizes.lesson_16;

public class lesson_16 {

    public static void main(String[] args) throws InterruptedException {

        Counter counter = new Counter();

        Thread lambdaPrinterThred = new Thread(new Printer(counter));
        Thread printerThred = new Thread(new Printer(counter));

        lambdaPrinterThred.start();
        printerThred.start();
        Writer writer = new Writer();

        TimePrinter timePrinter= new TimePrinter();
        Thread timeThread = new Thread(timePrinter);
        timeThread.start();
       Thread.sleep(1000);
       timePrinter.setRunning(false);

    }
}
