package teacher.lesson_5_arrays_for_loop.lessoncode;

import teacher.lesson_4_if_statement.lessoncode.Cat;

public class VetClinic {

    private int[] freeCages = new int[10];
    private Cat[] cages = new Cat[10];

    public void receiveCat(Cat cat) {
        for (int i = 0; i < cages.length; i++) {
            if (cages[i] != null) {
                continue;
            }
            cages[i] = cat;
            break;
        }
    }

    public void dischargeCat(String name) {
        for (int i = 0; i < cages.length; i++) {
            Cat cat = cages[i];

            if (cat == null) {
                continue;
            }

            if (cat.getName().equals(name)) {
                cages[i] = null;
            }
        }
    }

    public void showPatients() {
        System.out.println("Currently admitted patients:");
        for (int i = 0; i < cages.length; i++) {
            if (cages[i] == null) {
                continue;
            }
            System.out.println(" - " + cages[i].getName());
        }
    }
}