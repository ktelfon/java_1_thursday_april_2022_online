package student_igor_peresunko.classwork.lesson5;

import student_igor_peresunko.cardemo.Cat;


public class VetClinic {


    private int[] freeCages = new int[10];

    private Cat[] cages = new Cat[10];

    public void receiveCat(Cat cat) {
        for (int i = 0; i < cages.length; i++) {
            if (isCageEmpty(i)) {
                continue;
            }
            if (cages[i].equals(cat)) {
                System.out.println("this animal is already here");
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
        System.out.println("Currently admitted patients");
        for (int i = 0; i < cages.length; i++) {
            if (cages[i] == null) {
                continue;
            }
            System.out.println("-" + cages[i]);
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

    private boolean isCageEmpty(int cageIndex){
        return cages [cageIndex] == null;
    }


}
