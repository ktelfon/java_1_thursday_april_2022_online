package student_artemijs_talamajevs.level_5;

import java.util.Scanner;

public class LightColorDetector {
    public String detect(int wavelength) {


        if (wavelength < 380) {
            return "Iviseble Light";
        } else if (wavelength <= 449) {
            return "Violet";
        } else if (wavelength <= 494){
            return "Blue";
        } else if (wavelength <= 569) {
            return "Gren";
        } else if (wavelength <= 589) {
            return "Yelow";
        } else if (wavelength <= 619) {
            return "Orange";
        } else if (wavelength <= 750) {
            return "Red";
        } else {
            return "Ivisiible Light";
        }
    }
}
