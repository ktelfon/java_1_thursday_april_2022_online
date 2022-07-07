package teacher.lesson_6_arrays_while_loop.lessoncode;

public class TicTacToe {

    public boolean isWinPositionForHorizontals(int[][] field, int playerToCheck){
        boolean result = false;
        boolean foundNotMatchingSymbol = false;
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                if(field[i][j] != playerToCheck){
                    foundNotMatchingSymbol = true;
                    break;
                }
            }
            if(foundNotMatchingSymbol){
                foundNotMatchingSymbol = false;
                continue;
            }
            result = true;
        }
        return result;
    }
}
