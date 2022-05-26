package student_Vladislavs_Solims.class_exersizes.lesson_5;

import student_Vladislavs_Solims.class_exersizes.lesson_4.Cat;

public class VetClinicDemo {

    public static void main(String[] args) {

        VetClinic clinic = new VetClinic();
        clinic.receveCat(new Cat("Korzik" , 18));
        clinic.receveCat(new Cat("Rizik" , 18));
        clinic.receveCat(new Cat("Musja" , 18));
        clinic.receveCat(new Cat("Alisa" , 18));
        clinic.receveCat(new Cat("Durak" , 18));
        clinic.receveCat(new Cat("Persik" , 18));
        clinic.showPatients();
    }
}
