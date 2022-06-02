package teacher.lesson_5_arrays_for_loop.lessoncode;

import teacher.lesson_4_if_statement.lessoncode.Cat;

public class VetClinicDemo {
    public static void main(String[] args) {
        VetClinic clinic = new VetClinic();
        clinic.receiveCat(new Cat("Korzhik", 18));
        clinic.receiveCat(new Cat("Karamelka", 18));
        clinic.receiveCat(new Cat("Musja", 18));
        clinic.receiveCat(new Cat("Lusi", 18));
        clinic.receiveCat(new Cat("Mjauli", 18));
        clinic.showPatients();
    }
}
