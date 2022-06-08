package student_olga_dubrovskaja.homework.lesson_6.level_7.task_33;
// Много кода & не самый умный игрок, но я хотя бы попыталась >.<


class ComputerPlayer {

    public Move makeAMove(int[][] field, int player, int opponent) {
        int x;
        int y;
        Move nextMove = null;
        int[] coords;

        coords = checkForWin(field, player);
        if (coords[0] != -1) {
            nextMove = new Move(coords[0], coords[1]);
            return nextMove;
        }

        coords = checkForWin(field, opponent);
        if (coords[0] != -1) {
            nextMove = new Move(coords[0], coords[1]);
            return nextMove;
        }


        if (field[1][1] == -1) {
            x = 1;
            y = 1;
            nextMove = new Move(x, y);
            return nextMove;
        }


        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                if (field[i][j] == -1) {
                    x = i;
                    y = j;
                    nextMove = new Move(x, y);
                    return nextMove;
                }
            }
        }

        return nextMove;

    }

    public int[] checkForWinHorizontal(int[][] field, int player) {
        int countPlayer;
        int[] coords = {-1, -1};

        for (int i = 0; i < field.length; i++) {
            countPlayer = 0;
            for (int j = 0; j < field[i].length; j++) {
                if (field[i][j] == player) {
                    countPlayer++;
                }
            }
            if (countPlayer > 1) {
                for (int j = 0; j < field[i].length; j++) {
                    if (field[i][j] == -1) {
                        coords[0] = i;
                        coords[1] = j;
                    }
                }
            }
        }
        return coords;
    }

    public int[] checkForWinVertical(int[][] field, int player) {
        int countPlayer;
        int[] coords = {-1, -1};

        for (int i = 0; i < field.length; i++) {
            countPlayer = 0;
            for (int j = 0; j < field[i].length; j++) {
                if (field[j][i] == player) {
                    countPlayer++;
                }
            }
            if (countPlayer > 1) {
                for (int j = 0; j < field[i].length; j++) {
                    if (field[j][i] == -1) {
                        coords[0] = j;
                        coords[1] = i;
                    }
                }
            }
        }
        return coords;
    }

    public int[] checkForWinDiagonal1(int[][] field, int player) {
        int countPlayer = 0;
        int[] coords = {-1, -1};

        for (int i = 0; i < field.length; i++) {
            if (field[i][i] == player) {
                countPlayer++;
            }
        }

        if (countPlayer > 1) {
            for (int i = 0; i < field.length; i++) {
                if (field[i][i] == -1) {
                    coords[0] = i;
                    coords[1] = i;
                }
            }
        }
        return coords;
    }

    public int[] checkForWinDiagonal2(int[][] field, int player) {
        int countPlayer = 0;
        int[] coords = {-1, -1};
        for (int i = 0; i < field.length; i++) {
            if (field[i][field.length - 1 - i] == player) {
                countPlayer++;
            }
        }
        if (countPlayer > 1) {
            for (int i = 0; i < field.length; i++) {
                if (field[i][field.length - 1 - i] == -1) {
                    coords[0] = i;
                    coords[1] = field.length - 1 - i;
                }
            }
        }
        return coords;
    }

    public int[] checkForWin(int[][] field, int player) {
        int[] coords;
        coords = checkForWinHorizontal(field, player);
        if (coords[0] == -1) {
            coords = checkForWinVertical(field, player);
        } else {
            return coords;
        }
        if (coords[0] == -1) {
            coords = checkForWinDiagonal1(field, player);
        } else {
            return coords;
        }
        if (coords[0] == -1) {
            coords = checkForWinDiagonal2(field, player);
        } else {
            return coords;
        }
        return coords;
    }

}


