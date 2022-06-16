package teacher.vet;

import teacher.vet.animals.Animal;

public class VetClinic {

    private Animal[] cages = new Animal[10];

    public void receiveAPatient(Animal animal) {
        for (int i = 0; i < cages.length; i++) {
            if (isCageEmpty(i)) {
                continue;
            }
            if (cages[i].equals(animal)) {
                System.out.println("This animal is already here!");
                return;
            }
        }

        for (int i = 0; i < cages.length; i++) {
            if (cages[i] != null) {
                continue;
            }
            cages[i] = animal;
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
