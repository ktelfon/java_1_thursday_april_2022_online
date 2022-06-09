package student_Vladislavs_Solims.class_exersizes.lesson_6;

public class Arrays {


    public static void main(String[] args) {
        int[][] table = new int[5][5];
        int[][] tabletwo = {
                {1, 2, 3, 4, 5},
                {1, 2, 3, 4, 5},
                {1, 2, 3, 4, 5},
                {1, 2, 3, 4, 5},
                {1, 2, 3, 4, 5}
        };

        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                table[i][j] = j + 1;

            }
        }
        for (int i = 0; i < table[i].length; i++) {
            for (int j = 0; j < table.length; j++) {
                System.out.println("i:" + i);
                System.out.println("j:" + j);
                System.out.println("value:" + table[i][j]);
            }
        }
    }
}