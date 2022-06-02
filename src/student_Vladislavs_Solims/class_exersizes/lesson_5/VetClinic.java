package student_Vladislavs_Solims.class_exersizes.lesson_5;

import student_Vladislavs_Solims.class_exersizes.lesson_4.Cat;

public class VetClinic {


    private int[] freeCages = new int[10];

    private Cat[] cages = new Cat[10];

    public void receveCat(Cat cat) {
        for (int i = 0; i < cages.length; i++) {
            if (cages[i] != null) {
                continue;
            }
            cages[i]=cat;
            break;
        }
    }
    public void showPatients() {
        System.out.println("Currently admitted patients :");
        for (int i = 0; i < cages.length; i++) {
            if (cages[i] == null) {
                continue;
            }
            System.out.println("-" + cages[i].getName());
        }
    }

}

