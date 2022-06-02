package student_artemijs_talamajevs.lesson_4.level_5;

public class LightColorDetectorTest {
    public static void main(String[] args) {
        LightColorDetectorTest lightColorDetectorTest = new LightColorDetectorTest();
        lightColorDetectorTest.detect();

    }

    public void detect() {
        int wavelength= 571 ;
        String expectedResult = "Yellow";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(wavelength);
        if (realResult.equals(expectedResult)) {
            System.out.println("ightColorDetectorTest=OK");
        } else {
            System.out.println("ightColorDetectorTest=FAIL");
        }
    }
}


