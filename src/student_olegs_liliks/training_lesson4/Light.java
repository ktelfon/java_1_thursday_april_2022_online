package student_olegs_liliks.training_lesson4;

public class Light {
    public String detect(int wavelength) {
        if (wavelength > 379 && wavelength < 449) {
            return "Violet";
        } else if (wavelength > 450 && wavelength < 493) {
            return "Blue";
        } else{

        return "Invisible";}
    }
}

