package student_olga_dubrovskaja.homework.lesson_6.level_5.task_22_to_task_26;

class TicTacToe {

    public boolean isWinPositionForHorizontals(int[][] field, int playerToCheck) {
        boolean isWinHorizontal = false;
        int counter;
        for (int[] rows : field) {
            counter = 0;
            for (int cell : rows) {
                if (cell == playerToCheck) {
                    counter++;
                }
            }
            if (counter == field.length) {
                isWinHorizontal = true;
            }
        }
        return isWinHorizontal;
    }

    public boolean isWinPositionForVerticals(int[][] field, int playerToCheck) {
        boolean isWinVertical = false;
        int counter;
        for (int i = 0; i < field.length; i++) {
            counter = 0;
            for (int j = 0; j < field[i].length; j++) {
                if (field[j][i] == playerToCheck) {
                    counter++;
                }
            }
            if (counter == field.length) {
                isWinVertical = true;
            }
        }
        return isWinVertical;
    }

    public boolean isWinPositionForDiagonals(int[][] field, int playerToCheck) {
        boolean isWinDiagonal = false;
        int counter = 0;
        for (int i = 0; i < field.length; i++) {
            if (field[i][i] == playerToCheck) {
                counter++;
            }
        }
        if (counter == field.length) {
            isWinDiagonal = true;
        } else {
            counter = 0;
            for (int i = 0; i < field.length; i++) {
                if (field[i][field.length - 1 - i] == playerToCheck) {
                    counter++;
                }
                if (counter == field.length) {
                    isWinDiagonal = true;
                }
            }
        }
        return isWinDiagonal;
    }

    public boolean isWinPosition(int[][] field, int playerToCheck) {
        return isWinPositionForHorizontals(field, playerToCheck) || isWinPositionForVerticals(field, playerToCheck) || isWinPositionForDiagonals(field, playerToCheck);
    }

    public boolean isDrawPosition(int[][] field) {
        boolean isDraw = false;
        int firstPlayer = 0;
        int secondPlayer = 1;

        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                if (field[i][j] == -1) {
                    return isDraw;
                }
            }

        }
        if (!isWinPosition(field, firstPlayer) && !isWinPosition(field, secondPlayer)) {
            isDraw = true;
        }
        return isDraw;
    }


}
