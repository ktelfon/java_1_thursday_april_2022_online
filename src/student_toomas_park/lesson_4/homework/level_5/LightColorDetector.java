package student_toomas_park.lesson_4.homework.level_5;

class LightColorDetector {
    public String detect(int wavelength) {
        if (wavelength < 380) {
            return "Ivisible Light";
        } else if (wavelength <= 449) {
            return "Violet";
        } else if (wavelength <= 494){
            return "Blue";
        } else if (wavelength <= 569) {
            return "Green";
        } else if (wavelength <= 589) {
            return "Yellow";
        } else if (wavelength <= 619) {
            return "Orange";
        } else if (wavelength <= 750) {
            return "Red";
        } else {
            return "Ivisible Light";
        }
    }
}

