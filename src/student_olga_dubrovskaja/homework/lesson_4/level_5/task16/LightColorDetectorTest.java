package student_olga_dubrovskaja.homework.lesson_4.level_5.task16;

import java.util.Random;

class LightColorDetectorTest {
    public static void main(String[] args) {
        LightColorDetectorTest detectorTest = new LightColorDetectorTest();
        detectorTest.testViolet(380);
        detectorTest.testBlue(450);
        detectorTest.testGreen(569);
        detectorTest.testYellow(570);
        detectorTest.testOrange(619);
        detectorTest.testRed(620);
        detectorTest.testUltra(379);
        detectorTest.testInfra(751);
    }

    public void testViolet(int wavelength){
        String expectedResult = "Violet";
        LightColorDetector detector = new LightColorDetector();
        String realResult = detector.detect(wavelength);
        if (expectedResult.equals(realResult)){
            System.out.println("detector test with Violet = OK");
        } else {
            System.out.println("detector test with Violet = FAIL");
        }
    }
    public void testBlue(int wavelength){
        String expectedResult = "Blue";
        LightColorDetector detector = new LightColorDetector();
        String realResult = detector.detect(wavelength);
        if (expectedResult.equals(realResult)){
            System.out.println("detector test with Blue = OK");
        } else {
            System.out.println("detector test with Blue = FAIL");
        }
    }
    public void testGreen(int wavelength){
        String expectedResult = "Green";
        LightColorDetector detector = new LightColorDetector();
        String realResult = detector.detect(wavelength);
        if (expectedResult.equals(realResult)){
            System.out.println("detector test with Green = OK");
        } else {
            System.out.println("detector test with Green = FAIL");
        }
    }
    public void testYellow(int wavelength){
        String expectedResult = "Yellow";
        LightColorDetector detector = new LightColorDetector();
        String realResult = detector.detect(wavelength);
        if (expectedResult.equals(realResult)){
            System.out.println("detector test with Yellow = OK");
        } else {
            System.out.println("detector test with Yellow = FAIL");
        }
    }

    public void testOrange(int wavelength){
        String expectedResult = "Orange";
        LightColorDetector detector = new LightColorDetector();
        String realResult = detector.detect(wavelength);
        if (expectedResult.equals(realResult)){
            System.out.println("detector test with Orange = OK");
        } else {
            System.out.println("detector test with Orange = FAIL");
        }
    }
    public void testRed(int wavelength){
        String expectedResult = "Red";
        LightColorDetector detector = new LightColorDetector();
        String realResult = detector.detect(wavelength);
        if (expectedResult.equals(realResult)){
            System.out.println("detector test with Red = OK");
        } else {
            System.out.println("detector test with Red = FAIL");
        }
    }
    public void testUltra(int wavelength){
        String expectedResult = "Invisible light";
        LightColorDetector detector = new LightColorDetector();
        String realResult = detector.detect(wavelength);
        if (expectedResult.equals(realResult)){
            System.out.println("detector test with Ultra = OK");
        } else {
            System.out.println("detector test with Ultra = FAIL");
        }
    }
    public void testInfra(int wavelength){
        String expectedResult = "Invisible light";
        LightColorDetector detector = new LightColorDetector();
        String realResult = detector.detect(wavelength);
        if (expectedResult.equals(realResult)){
            System.out.println("detector test with Infra = OK");
        } else {
            System.out.println("detector test with Infra = FAIL");
        }
    }
}
