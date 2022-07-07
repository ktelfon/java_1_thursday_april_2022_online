package student_igor_peresunko.homework.lesson_6.TicTacToe;

public class TicTacToe {
    public boolean isWinPositionForHorizontals(int[] [] filed, int playerToCheck){
        boolean result = false;
        boolean foundNotMatchingSymbol = false;
        for (int i = 0; i < filed.length; i++) {
            for (int j = 0; j < filed.length; j++) {
                if (filed [i] [j] != playerToCheck) {
                    foundNotMatchingSymbol = true;
                    break;
                }
            }
            if(foundNotMatchingSymbol){
                foundNotMatchingSymbol =  false;
                continue;
            }
            result = true;
        }
        return result;
    }
}
