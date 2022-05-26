package student_igor_peresunko.classwork.lesson5;

import student_igor_peresunko.cardemo.Cat;

public class VetClinicDemo {

    public static void main(String[] args){
        VetClinic clinic = new VetClinic();
        clinic.receiveCat(new Cat("Cezar", 12));
        clinic.receiveCat(new Cat("rig", 12));
        clinic.receiveCat(new Cat("Bob", 12));
        clinic.receiveCat(new Cat("Dori", 12));
        clinic.receiveCat(new Cat("Alpha", 12));
        clinic.receiveCat(new Cat("Kleo", 12));

        clinic.showPatients();
    }
}
