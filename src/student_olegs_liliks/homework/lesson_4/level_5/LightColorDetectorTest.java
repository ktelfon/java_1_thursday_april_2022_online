package student_olegs_liliks.homework.lesson_4.level_5;

public class LightColorDetectorTest {
    public static void main(String[] args) {
        LightColorDetectorTest LightColorDetectorTest = new LightColorDetectorTest();
        LightColorDetectorTest.detect();

    }
    public void detect() {
        int wavelength = 500;
        String expectedResult = "Green";
        LightColorDetector LightColorDetector = new LightColorDetector();
        String realResult = LightColorDetector.detect(wavelength);
         if (realResult == expectedResult) {
            System.out.println("Light test is OK");
        }
       else {
            System.out.println("Light test is BAD");}


    }
}
