package student_olga_dubrovskaja.homework.lesson_6.level_6.task_27_to_task_31;

import java.util.Arrays;

class TicTacToeTest {
    public static void main(String[] args) {
        TicTacToeTest test = new TicTacToeTest();
        test.shouldCreateField();
    }

    public void shouldCreateField(){
        TicTacToe ticTacTest = new TicTacToe();
        int[][] testResult = ticTacTest.createField();
        int[][] expectedResult = {{-1,-1,-1},{-1,-1,-1},{-1,-1,-1}};
        checkTestResult(Arrays.deepEquals(testResult, expectedResult), "Field created test:");
    }



    public void checkTestResult(boolean result, String testName) {
        if (result) {
            System.out.println(testName + " OK");
        } else {
            System.out.println(testName + " FAIL");
        }
    }
}
