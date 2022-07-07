package student_igor_peresunko.vet;

import java.util.ArrayList;
import java.util.List;

public class VetClinic {


    private List<Animal> patients = new ArrayList<>();

    public void receiveAPatient(Animal animal) {
        if (patients.contains(animal)) {
            System.out.println("This animal is already here!");
            return;
        }
        patients.add(animal);
    }

    public void dischargeCat(String name) {
        for (int i = 0; i < patients.size(); i++) {
            if (patients.get(i).getName().equals(name)) {
                patients.remove(patients.get(i));
                return;
            }
        }
    }

    public void showPatients() {
        System.out.println("Currently admitted patients:");
        System.out.println(patients);
    }

    public int patientCount() {
        return patients.size();
    }



}
