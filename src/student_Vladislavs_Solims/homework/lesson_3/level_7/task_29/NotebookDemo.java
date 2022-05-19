package student_Vladislavs_Solims.homework.lesson_3.level_7.task_29;

public class NotebookDemo {
    public static void main(String[] args) {


        Notebook notebook = new Notebook();
        notebook.setModel("Asus");
        System.out.println(notebook.getModel());
        notebook.setDisplaySize(15);
        System.out.println(notebook.getDisplaySize());
        System.out.println(notebook.isCharged());
    }
}
