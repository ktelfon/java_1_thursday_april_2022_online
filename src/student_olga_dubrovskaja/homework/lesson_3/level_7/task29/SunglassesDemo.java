package student_olga_dubrovskaja.homework.lesson_3.level_7.task29;

class SunglassesDemo {
    public static void main(String[] args) {
        Sunglasses glass1 = new Sunglasses();
        glass1.previewSunglasses();

        glass1.setFrameColour("Gold");
        glass1.setLensColour("Brown");
        glass1.setIsOptical(true);
        glass1.previewSunglasses();

        Sunglasses glass2 = new Sunglasses("Green", "Silver", false);
        glass2.previewSunglasses();

    }
}
