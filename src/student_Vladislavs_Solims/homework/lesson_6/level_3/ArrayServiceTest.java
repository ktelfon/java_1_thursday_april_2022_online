package student_Vladislavs_Solims.homework.lesson_6.level_3;

import java.util.Objects;

public class ArrayServiceTest {
    public static void main(String[] args) {
        ArrayServiceTest arrayServiceTest = new ArrayServiceTest();
        arrayServiceTest.containsTest();
        arrayServiceTest.howMuchContainsTest();
        arrayServiceTest.replaceFirstNumberTest();
        arrayServiceTest.replaseAnyNumber();
        arrayServiceTest.turnAroundTest();

    }

    void containsTest() {
        int[] arr = {10, 20, 10, 30, 50};
        boolean expectedResult = true;
        ArrayService arrayService = new ArrayService();
        if (expectedResult == arrayService.contains(arr, 10)) {
            System.out.println(" contains test OK");
        } else {
            System.out.println("False");
        }
    }

    void howMuchContainsTest() {
        int[] arr = {10, 20, 30, 10, 10, 50};
        int expectedResult = 3;
        ArrayService arrayService = new ArrayService();
        if (expectedResult == arrayService.howMuchContains(arr, 10)) {
            System.out.println("HowMuchContainsTest OK");
        } else {
            System.out.println("False");
        }
    }
    void replaceFirstNumberTest(){
        int[] arr = {10,20,30,40,50};
        boolean expectedResult=true;
        ArrayService arrayService = new ArrayService();
        if(expectedResult==arrayService.replaceFirstNumber(arr,10,15)){
            System.out.println("replaceFirstNumberTest OK");
        }else{
            System.out.println("FALSE");
        }
    }
    void replaseAnyNumber(){
        int[] arr = {10,20,30,40,50};
        boolean expectedResult = true;
        ArrayService arrayService = new ArrayService();
        if(expectedResult==arrayService.replaceAnyNumber(arr,30,35)){
            System.out.println("replaseAnyNumber Test OK");
        }else{
            System.out.println("FALSE");
        }
    }
    void turnAroundTest() {
        int[] arr = {10,20,30,40,50};
        int[] expectedResult = {50,40,30,20,10};
        ArrayService arrayService = new ArrayService();
        arrayService.turnAroundArray(arr);
        if(expectedResult==arr){
            System.out.println("OK");
        }else{
            System.out.println("FALSE");
        }
    }
}
