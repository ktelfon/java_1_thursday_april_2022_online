package student_toomas_park.lesson_6.homework.level_4;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class TwoDimensionalArray {
    public static void main(String[] args){
        int[][] numbers = new int[2][10];
        int sumnumbers = 0;
        System.out.println(" Two demension array : ");
        for (int i = 0; i<numbers.length; i++){
            for(int k = 0; k<numbers[i].length; k++) {
                numbers[i][k] = k;
                sumnumbers = sumnumbers + numbers[i][k];
                System.out.print(" " + numbers[i][k] + " ");
            }
        }
        System.out.println("Summary all numbers of two demension array : " + sumnumbers);
    }
}
