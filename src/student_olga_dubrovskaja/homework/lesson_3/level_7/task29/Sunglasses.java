package student_olga_dubrovskaja.homework.lesson_3.level_7.task29;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Sunglasses { // Солнечные очки
    private String lensColour;  //  цвет стекол
    private String frameColour;  // цвет рамы
    private boolean isOptical;  // оптические стекла

    Sunglasses() {
        this.lensColour="Black";
        this.frameColour="Black";
        this.isOptical = false;
        }
    Sunglasses(String lensColour, String frameColour, boolean isOptical) {
        this.lensColour= lensColour;
        this.frameColour = frameColour;
        this.isOptical = isOptical;
    }

    void setLensColour(String lensColour) {
        this.lensColour= lensColour;
    }

    void setFrameColour(String frameColour){
        this.frameColour=frameColour;
    }

    void setIsOptical(boolean isOptical) {
        this.isOptical = isOptical;
    }

    void previewSunglasses() {
        System.out.println("Current sunglasses:");
        System.out.println("Frame colour: " + this.frameColour);
        System.out.println("Lens colour: " + this.lensColour);

        if(isOptical){
            System.out.println("Glasses have optical lenses");
        } else System.out.println("Glasses have no optical lenses");
    }
}
