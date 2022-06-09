package student_olga_dubrovskaja.homework.lesson_6.level_7.task_33;

import teacher.codereview.CodeReview;

import java.util.Arrays;

@CodeReview(approved = true)
class ComputerPlayerTest {
    public static void main(String[] args) {
        ComputerPlayerTest test = new ComputerPlayerTest();
        test.shouldWinVertical();
        test.shouldWinHorizontal();
        test.testDiagonal1();
        test.testDiagonal2();
    }

    public void shouldWinVertical() {
        ComputerPlayer player = new ComputerPlayer();
        int[][] test = {{0, 1, 0}, {-1, 1, 0}, {-1, -1, -1}};
        int[] expectedResult = {2, 1};
        int[] realResult = player.checkForWinVertical(test, 1);
        System.out.println(Arrays.toString(realResult));
    }

    public void shouldWinHorizontal() {
        ComputerPlayer player = new ComputerPlayer();
        int[][] test = {{-1, 1, 1}, {0, 1, -1}, {-1, -1, 0}};
        int[] expectedResult = {0, 0};
        int[] realResult = player.checkForWinHorizontal(test, 1);
        System.out.println(Arrays.toString(realResult));
    }

    public void testDiagonal1() {
        ComputerPlayer player = new ComputerPlayer();
        int[][] test = {{1, -1, 1}, {0, 1, 0}, {-1, -1, -1}};
        int[] expectedResult = {2, 2};
        int[] realResult = player.checkForWinDiagonal1(test, 1);
        System.out.println(Arrays.toString(realResult));
    }

    public void testDiagonal2() {
        ComputerPlayer player = new ComputerPlayer();
        int[][] test = {{1, -1, 1}, {0, 1, 0}, {-1, -1, 0}};
        int[] expectedResult = {2, 0};
        int[] realResult = player.checkForWinDiagonal2(test, 1);
        System.out.println(Arrays.toString(realResult));
    }
}
