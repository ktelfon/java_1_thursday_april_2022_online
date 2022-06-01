package student_olga_dubrovskaja.homework.lesson_5.level_5_and_6.task31_to_40;

/*
Task 32
Создайте класс ArrayUtilTest.
В этом классе напишите автоматический тест
для метода int[] createArray(int arrayLength)
из предыдущего задания.
 */
class ArrayUtilTest {
    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
        test.shouldFindMaxNumber();
        test.shouldFindMinNumber();
    }

    public void shouldCreateArray() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int testLength = 8;
        int[] testArray = arrayUtil.createArray(testLength);
        System.out.print("Array length test:");
        compareResults(testLength, testArray.length);
    }

    /*
        Task 36
        В классе ArrayUtilTest напишите автоматический тест
        для метода int findMaxNumber(int[] array)
        из предыдущего задания.
    */
    public void shouldFindMaxNumber() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] array = {1, 2, 3, 4, 5};
        int maxNumber = arrayUtil.findMaxNumber(array);
        System.out.print("ArrayUtil max number test:");
        compareResults(5, maxNumber);
    }

    /*
    Task 38
    В классе ArrayUtilTest напишите автоматический тест
    для метода int findMinNumber(int[] array)
    из предыдущего задания.
     */
    public void shouldFindMinNumber() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] array = {1, 2, 3, 4, 5};
        int minNumber = arrayUtil.findMinNumber(array);
        System.out.print("ArrayUtil min number test:");
        compareResults(1, minNumber);
    }

    public void compareResults(int expectedResult, int testResult) {
        if (expectedResult == testResult) {
            System.out.println(" OK");
        } else {
            System.out.println(" FAIL");
        }
    }

}
