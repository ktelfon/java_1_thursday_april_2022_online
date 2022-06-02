package student_Vladislavs_Solims.homework.lesson_4.level_5;

import java.sql.SQLOutput;

public class LightColorDetectorTest {

    public static void main(String[] args) {
        LightColorDetectorTest lightColorDetectorTest = new LightColorDetectorTest();
        lightColorDetectorTest.testViolet(449);
        lightColorDetectorTest.testBlue(450);
        lightColorDetectorTest.testGreen(500);
        lightColorDetectorTest.testOrange(600);
        lightColorDetectorTest.testYellow(570);
        lightColorDetectorTest.testRed(625);
        lightColorDetectorTest.testInvisible(200);

    }

    void testViolet(int waveLength) {
        String expectedResult = "Violet";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(waveLength);
        if (expectedResult == result) {
            System.out.println("testViolet PASSED");
        } else {
            System.out.println("testViolet FAILED");
        }
    }

    void testBlue(int waveLength) {
        String expectedResult = "Blue";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(waveLength);
        if (expectedResult == result) {
            System.out.println("testBlue PASSED");
        } else {
            System.out.println("testBlue FAILED");
        }
    }

    void testGreen(int waveLength) {
        String expectedResult = "Green";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(waveLength);
        if (expectedResult == result) {
            System.out.println("testGreen PASSED");
        } else {
            System.out.println("testGreen FAILED");
        }
    }

    void testYellow(int waveLength) {
        String expectedResult = "Yellow";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(waveLength);
        if (expectedResult == result) {
            System.out.println("testYellow PASSED");
        } else {
            System.out.println("testYellow FAILED");
        }
    }

    void testOrange(int waveLength) {
        String expectedResult = "Orange";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(waveLength);
        if (expectedResult == result) {
            System.out.println("testOrange PASSED");
        } else {
            System.out.println("testOrange FAILED");
        }
    }

    void testRed(int waveLength) {
        String expectedResult = "Red";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(waveLength);
        if (expectedResult == result) {
            System.out.println("testRed PASSED");
        } else {
            System.out.println("testRed FAILED");
        }
    }

    void testInvisible(int waveLength) {
        String expectedResutl = "Invisible light";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(waveLength);
        if (expectedResutl == result) {
            System.out.println("testInvisibleLight PASSED");
        } else {
            System.out.println("testInvsibleLight FAILED");
        }
    }
}
