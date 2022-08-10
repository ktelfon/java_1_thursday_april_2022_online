package student_olegs_liliks.training_lesson4;

public class LightTest {
    public static void main(String[] args) {
        LightTest test = new LightTest();
        test.test1(200);


    }
    public String test1(int wavelength){
        String expectedResult = "Invisible";
        LightTest test = new LightTest();
        String realResult = test.test1(200);
        if(expectedResult == realResult){
            System.out.println("TEST PASS");
        }
        else{
            System.out.println("TEST FAILED");
        }
        return expectedResult;
    }

}
