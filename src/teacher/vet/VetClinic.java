package teacher.vet;

import teacher.lesson_4_if_statement.lessoncode.Cat;

public class VetClinic {

    private Cat[] cages = new Cat[10];

    public void receiveCat(Cat cat) {
        for (int i = 0; i < cages.length; i++) {
            if (isCageEmpty(i)) {
                continue;
            }
            if (cages[i].equals(cat)) {
                System.out.println("This animal is already here!");
                return;
            }
        }

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
            if (isCageEmpty(i)) {
                continue;
            }

            if (cages[i].getName().equals(name)) {
                cages[i] = null;
            }
        }
    }

    public void showPatients() {
        System.out.println("Currently admitted patients:");
        for (int i = 0; i < cages.length; i++) {
            if (isCageEmpty(i)) {
                continue;
            }
            System.out.println(" - " + cages[i]);
        }
    }

    public int patientCount() {
        int counter = 0;
        for (int i = 0; i < cages.length; i++) {
            if (isCageEmpty(i)) {
                continue;
            }
            counter++;
        }
        return counter;
    }

    private boolean isCageEmpty(int cageIndex) {
        return cages[cageIndex] == null;
    }
}
