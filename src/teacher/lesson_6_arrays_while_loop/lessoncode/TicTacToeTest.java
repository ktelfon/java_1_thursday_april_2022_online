package teacher.lesson_6_arrays_while_loop.lessoncode;

public class TicTacToeTest {
    public static void main(String[] args) {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] field = {
                {-1, -1, -1},
                {0, 0, 0},
                {1, 1, -1}
        };
        boolean result = ticTacToe.isWinPositionForHorizontals(field, 0);
        if (result) {
            System.out.println("isWinPositionForHorizontals PASSED");
        } else {
            System.out.println("isWinPositionForHorizontals FAILED");
        }
    }
}
