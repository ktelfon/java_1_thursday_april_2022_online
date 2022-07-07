package student_igor_peresunko.homework.lesson_6.TicTacToe;

public class TicTacToeDemo {
    public static void main(String[] args) {
        TicTacToe ticTacToe = new TicTacToe();
        int [][] filed = {
                {0,0,0},
                {-1,-1,-1},
                {1,1,-1}
        };
        boolean result = ticTacToe.isWinPositionForHorizontals(filed, 0);
        if(result){
            System.out.println("isWinPositionForHorizontal Passed");
        } else {
            System.out.println("isWinPositionForHorizontal Fallied");

        }
    }
}
