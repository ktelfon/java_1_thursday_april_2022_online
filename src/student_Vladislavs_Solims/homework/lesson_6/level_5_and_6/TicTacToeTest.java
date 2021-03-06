package student_Vladislavs_Solims.homework.lesson_6.level_5_and_6;


public class TicTacToeTest {

    public static void main(String[] args) {
        TicTacToeTest ticTacToeTest = new TicTacToeTest();
       ticTacToeTest.shouldWinFirstHorizontal();
        ticTacToeTest.shouldLooseFirstHorizontal();
        ticTacToeTest.shouldWinSecondHorizontal();
        ticTacToeTest.shouldLooseFirst();
        ticTacToeTest.shouldWinSecondHorizontal();
        ticTacToeTest.shouldWinSecond();
        ticTacToeTest.shouldWinFirst();
        ticTacToeTest.shouldBeDraw();
        ticTacToeTest.shouldLooseFirstDiagonal();
        ticTacToeTest.shouldLooseFirstVertical();
        ticTacToeTest.shouldLooseSecond();
        ticTacToeTest.shouldLooseSecondDiagonal();
        ticTacToeTest.shouldLooseSecondHorizontal();
        ticTacToeTest.shouldLooseSecondVertical();
        ticTacToeTest.shouldNotBeDraw1();
        ticTacToeTest.shouldWinFirstDiagonal1();
        ticTacToeTest.shouldWinFirstDiagonal2();
        ticTacToeTest.shouldWinSecond1();
        ticTacToeTest.shouldWinSecondDiagonal1();
        ticTacToeTest.shouldWinSecondDiagonal2();
        ticTacToeTest.shouldWinSecondVertical();
        ticTacToeTest.shouldWinFirstVertical();
        ticTacToeTest.shouldNotBeDraw();
    }

    public void shouldWinFirstHorizontal() {
        int[][] table = {{1, 1, 1}, {0, 0, 0}, {1, -1, -1}};
        int player = 0;
        boolean expectedResult = true;
        TicTacToe testGame = new TicTacToe();
        checkTestResult(testGame.isWinPositionForHorizontals(table, player) == expectedResult, "First wins horizontal test:");
    }

    public void shouldLooseFirstHorizontal() {
        int[][] table = {{1, 1, 1}, {-1, -1, -1}, {1, -1, -1}};
        int player = 0;
        boolean expectedResult = false;
        TicTacToe testGame = new TicTacToe();
        checkTestResult(testGame.isWinPositionForHorizontals(table, player) == expectedResult, "First loses horizontal test:");
    }

    public void shouldWinSecondHorizontal() {
        int[][] table = {{1, 1, 1}, {0, 0, 0}, {1, -1, -1}};
        int player = 1;
        boolean expectedResult = true;
TicTacToe testGame = new TicTacToe();
        checkTestResult(testGame.isWinPositionForHorizontals(table, player) == expectedResult, "Second wins horizontal test:");
    }

    public void shouldLooseSecondHorizontal() {
        int[][] table = {{0, 0, 0}, {-1, -1, -1}, {1, -1, -1}};
        int player = 1;
        boolean expectedResult = false;
TicTacToe testGame = new TicTacToe();
        checkTestResult(testGame.isWinPositionForHorizontals(table, player) == expectedResult, "Second loses horizontal test:");
    }

    public void shouldWinFirstVertical() {
        int[][] table = {{0, 1, 0}, {0, 0, 0}, {0, -1, 0}};
        int player = 0;
        boolean expectedResult = true;
        TicTacToe testGame = new TicTacToe();
        checkTestResult(testGame.isWinPositionForVerticals(table, player) == expectedResult, "First wins vertical test:");
    }


    public void shouldLooseFirstVertical() {
        int[][] table = {{1, 1, 0}, {0, 0, -1}, {0, -1, 0}};
        int player = 0;
        TicTacToe testGame = new TicTacToe();
        boolean expectedResult = false;
        checkTestResult(testGame.isWinPositionForVerticals(table, player) == expectedResult, "First loses vertical test:");
    }

    public void shouldWinSecondVertical() {
        int[][] table = {{1, 1, 1}, {1, 1, 1}, {1, 1, 1}};
        int player = 1;
        TicTacToe testGame = new TicTacToe();
        boolean expectedResult = true;
        checkTestResult(testGame.isWinPositionForVerticals(table, player) == expectedResult, "Second wins vertical (all 1) test:");
    }

    public void shouldLooseSecondVertical() {
        int[][] table = {{-1, 1, 0}, {0, 0, -1}, {0, -1, 0}};
        int player = 1;
        TicTacToe testGame = new TicTacToe();
        boolean expectedResult = false;
        checkTestResult(testGame.isWinPositionForVerticals(table, player) == expectedResult, "Second loses vertical test:");
    }

    public void shouldWinFirstDiagonal1() {
        int[][] table = {{0, 1, 0}, {1, 0, 0}, {-1, -1, 0}};
        int player = 0;
        TicTacToe testGame = new TicTacToe();
        boolean expectedResult = true;
        checkTestResult(testGame.isWinPositionForDiagonals(table, player) == expectedResult, "First wins diagonal test 1:");
    }

    public void shouldWinFirstDiagonal2() {
        int[][] table = {{1, 1, 0}, {1, 0, 0}, {0, -1, 1}};
        int player = 0;
        TicTacToe testGame = new TicTacToe();
        boolean expectedResult = true;
        checkTestResult(testGame.isWinPositionForDiagonals(table, player) == expectedResult, "First wins diagonal test 2:");

    }


    public void shouldWinSecondDiagonal1() {
        int[][] table = {{1, 1, 0}, {1, 1, 0}, {-1, -1, 1}};
        int player = 1;
        TicTacToe testGame = new TicTacToe();
        boolean expectedResult = true;
        checkTestResult(testGame.isWinPositionForDiagonals(table, player) == expectedResult, "Second wins diagonal test 1:");

    }

    public void shouldWinSecondDiagonal2() {
        int[][] table = {{1, 1, 1}, {1, 1, 1}, {1, 1, 1}};
        int player = 1;
        TicTacToe testGame = new TicTacToe();
        boolean expectedResult = true;
        checkTestResult(testGame.isWinPositionForDiagonals(table, player) == expectedResult, "Second wins diagonal test 2:");

    }

    public void shouldLooseFirstDiagonal() {
        int[][] table = {{1, 1, 0}, {1, 0, 0}, {-1, -1, 0}};
        int player = 0;
        TicTacToe testGame = new TicTacToe();
        boolean expectedResult = false;
        checkTestResult(testGame.isWinPositionForDiagonals(table, player) == expectedResult, "First loses diagonal test:");
    }

    public void shouldLooseSecondDiagonal() {
        int[][] table = {{-1, -1, 0}, {-1, 0, 0}, {-1, -1, 0}};
        int player = 1;
        TicTacToe testGame = new TicTacToe();
        boolean expectedResult = false;
        checkTestResult(testGame.isWinPositionForDiagonals(table, player) == expectedResult, "Second loses diagonal test:");
    }

    public void shouldWinFirst() {
        int[][] table = {{0, 1, 0}, {1, 0, 0}, {-1, -1, 0}};
        int player = 0;
        TicTacToe testGame = new TicTacToe();
        boolean expectedResult = true;
        checkTestResult(testGame.isWinPosition(table, player) == expectedResult, "First wins (diagonal1):");
    }

    public void shouldWinSecond() {
        int[][] table = {{0, 1, 1}, {1, 1, 0}, {1, -1, -1}};
        int player = 1;
        TicTacToe testGame = new TicTacToe();
        boolean expectedResult = true;
        checkTestResult(testGame.isWinPosition(table, player) == expectedResult, "Second wins (diagonal2):");
    }

    public void shouldWinSecond1() {
        int[][] table = {{0, 1, 1}, {0, 1, 1}, {-1, -1, 1}};
        int player = 1;
        TicTacToe testGame = new TicTacToe();
        boolean expectedResult = true;
        checkTestResult(testGame.isWinPosition(table, player) == expectedResult, "Second wins (vertical):");
    }

    public void shouldLooseSecond() {
        int[][] table = {{0, 1, 0}, {0, 1, 1}, {-1, -1, 1}};
        int player = 1;
        TicTacToe testGame = new TicTacToe();
        boolean expectedResult = false;
        checkTestResult(testGame.isWinPosition(table, player) == expectedResult, "Second loses:");
    }

    public void shouldLooseFirst() {
        int[][] table = {{0, 1, 0}, {0, 1, 1}, {-1, -1, 1}};
        int player = 0;
        TicTacToe testGame = new TicTacToe();
        boolean expectedResult = false;
        checkTestResult(testGame.isWinPosition(table, player) == expectedResult, "First loses:");
    }

    public void shouldBeDraw() {
        int[][] table = {{0, 1, 0}, {0, 1, 1}, {1, 0, 1}};
        TicTacToe testGame = new TicTacToe();
        boolean expectedResult = true;
        checkTestResult(testGame.isDrawPosition(table) == expectedResult, "Draw:");
    }

    public void shouldNotBeDraw() {
        int[][] table = {{0, 1, 0}, {0, -1, 1}, {1, 0, 1}};
        TicTacToe testGame = new TicTacToe();
        boolean expectedResult = false;
        checkTestResult(testGame.isDrawPosition(table) == expectedResult, "Not a draw (contains -1):");
    }

    public void shouldNotBeDraw1() {
        int[][] table = {{0, 1, 0}, {0, 0, 1}, {0, 0, 1}};
        TicTacToe testGame = new TicTacToe();
        boolean expectedResult = false;
        checkTestResult(testGame.isDrawPosition(table) == expectedResult, "Not a draw (winning field):");
    }

    public void checkTestResult(boolean result, String testName) {
        if (result) {
            System.out.println(testName + " OK");
        } else {
            System.out.println(testName + " FAIL");
        }
    }
}
