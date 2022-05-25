package student_olga_dubrovskaja.homework.lesson_4.level_7.task25;

class LightColorDetectorTest {
    public static void main(String[] args) {
        LightColorDetectorTest lightColorDetector = new LightColorDetectorTest();

        lightColorDetector.testViolet(405);
        lightColorDetector.testBlue(475);
        lightColorDetector.testGreen(505);
        lightColorDetector.testYellow(585);
        lightColorDetector.testOrange(619);
        lightColorDetector.testRed(620);
        lightColorDetector.testInvisible(760);
    }


    public void testResult(boolean isTrue, String testName){
        if(isTrue){
            System.out.println(testName + "OK");
        } else {
            System.out.println(testName + "FAIL");
        }
    }
    public void testViolet(int wavelength) {
        LightColorDetector lightColorDetector = new LightColorDetector(wavelength);
        testResult(lightColorDetector.detect().equals("Violet"), "LightColorDetector test - Violet: ");
    }
    public void testBlue(int wavelength) {
        LightColorDetector lightColorDetector = new LightColorDetector(wavelength);
        testResult(lightColorDetector.detect().equals("Blue"), "LightColorDetector test - Blue: ");
    }
    public void testGreen(int wavelength) {
        LightColorDetector lightColorDetector = new LightColorDetector(wavelength);
        testResult(lightColorDetector.detect().equals("Green"), "LightColorDetector test - Green: ");
    }
    public void testYellow(int wavelength) {
        LightColorDetector lightColorDetector = new LightColorDetector(wavelength);
        testResult(lightColorDetector.detect().equals("Yellow"), "LightColorDetector test - Yellow: ");
    }
    public void testOrange(int wavelength) {
        LightColorDetector lightColorDetector = new LightColorDetector(wavelength);
        testResult(lightColorDetector.detect().equals("Orange"), "LightColorDetector test - Orange: ");
    }
    public void testRed(int wavelength) {
        LightColorDetector lightColorDetector = new LightColorDetector(wavelength);
        testResult(lightColorDetector.detect().equals("Red"), "LightColorDetector test - Red: ");
    }
    public void testInvisible(int wavelength) {
        LightColorDetector lightColorDetector = new LightColorDetector(wavelength);
        testResult(lightColorDetector.detect().equals("Invisible Light"), "LightColorDetector test - Invisible: ");
    }
}
