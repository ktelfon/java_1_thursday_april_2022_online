package student_Vladislavs_Solims.homework.lesson_3.level_7.task_29;

import java.util.Scanner;

public class NotebookDemo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Notebook notebook = new Notebook();
        notebook.setModel(scanner.next());
        System.out.println(notebook.getModel());
        notebook.setDisplaySize(scanner.nextInt());
        System.out.println(notebook.getDisplaySize());
        System.out.println(notebook.isCharged());
    }
}
