package student_olegs_liliks.classwork.lesson_5;
import teacher.lesson_4_if_statement.lessoncode.Cat;
public class VetClinicDemo {
    public static void main(String[] args) {
        VetClinic clinic = new VetClinic();
        clinic.receiveCat(new Cat("Korzhik",18));
        clinic.showPatients();
    }

}
