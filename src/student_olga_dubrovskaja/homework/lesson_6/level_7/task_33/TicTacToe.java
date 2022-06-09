package student_olga_dubrovskaja.homework.lesson_6.level_7.task_33;

import teacher.codereview.CodeReview;

import java.util.Arrays;
import java.util.Scanner;

@CodeReview(approved = true)
class TicTacToe {

    public int[][] createField() {
        int[][] field = new int[3][3];
        for (int[] row : field) {
            Arrays.fill(row, -1);
        }
        return field;
    }

    public Move getNextMove() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter coordinate 1 to 3");
        System.out.println("Enter row: ");
        int x = scanner.nextInt() - 1;
        System.out.println("Enter column: ");
        int y = scanner.nextInt() - 1;
        while ((x < 0 || x > 3) && (y < 0 || y > 3)) {
            System.out.println("Invalid coordinates. Please enter 1, 2 or 3: ");
            System.out.println("Enter row: ");
            x = scanner.nextInt() - 1;
            System.out.println("Enter column: ");
            y = scanner.nextInt() - 1;

        }
        return new Move(x, y);
    }


    public void printFieldToConsole(int[][] field) {
        for (int[] row : field) {
            System.out.println(Arrays.toString(row));
        }
    }

    public void play() {
        int[][] field = createField();
        while (true) {
            System.out.println("------------");
            printFieldToConsole(field);
            Move move0 = getNextMove();
            if (field[move0.getX()][move0.getY()] == 1 || field[move0.getX()][move0.getY()] == 0) {
                System.out.println("Position taken.");
                continue;
            }
            field[move0.getX()][move0.getY()] = 0;
            //  printFieldToConsole(field);
            if (isWinPosition(field, 0)) {
                printFieldToConsole(field);
                System.out.println("Player 0 WIN!");
                break;
            }
            if (isDrawPosition(field)) {
                printFieldToConsole(field);
                System.out.println("DRAW!");
                break;
            }
            System.out.println("------------");
            printFieldToConsole(field);
            ComputerPlayer comp = new ComputerPlayer();
            Move move1 = comp.makeAMove(field, 1, 0);
            field[move1.getX()][move1.getY()] = 1;

            if (isWinPosition(field, 1)) {
                printFieldToConsole(field);
                System.out.println("Player 1 WIN!");
                break;
            }
            if (isDrawPosition(field)) {
                printFieldToConsole(field);
                System.out.println("DRAW!");
                break;
            }
        }
    }


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
