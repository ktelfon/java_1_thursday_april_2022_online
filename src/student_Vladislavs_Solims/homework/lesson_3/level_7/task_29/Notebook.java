package student_Vladislavs_Solims.homework.lesson_3.level_7.task_29;

public class Notebook {

    String model;
    int displaySize;
    boolean charged = true;

    void setModel(String model) {
        this.model = model;
    }

    String getModel() {
        return model;
    }

    public void setDisplaySize(int displaySize) {
        this.displaySize = displaySize;
    }

    public int getDisplaySize() {
        return displaySize;
    }

    public void setCharged(boolean charged) {
        this.charged = charged;
    }

    public boolean isCharged() {
        return charged;
    }
}