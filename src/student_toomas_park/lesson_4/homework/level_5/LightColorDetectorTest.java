package student_toomas_park.lesson_4.homework.level_5;


import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class LightColorDetectorTest {
    public static void main(String[] args) {
        LightColorDetectorTest LightColorDetectorTest = new LightColorDetectorTest();
        LightColorDetectorTest.detect();
    }
    public void detect() {
        int wavelength = 579;
        String expectedResult = "Green";
        LightColorDetector LightColorDetector = new LightColorDetector();
        String realResult = LightColorDetector.detect(wavelength);
        if (realResult == expectedResult) {
            System.out.println("Light test = OK! Expect : " + expectedResult + " Real :  " + realResult);
        } else {
            System.out.println("even test = FAIL! Expect : " + expectedResult + " , Real :  " + realResult);
        }
    }

}
