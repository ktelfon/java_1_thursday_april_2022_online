package student_Vladislavs_Solims.homework.lesson_6.level_2;

import teacher.codereview.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
public class DayOfTheWeekDetectorDemo {


    public static void main(String[] args) {
        DayOfTheWeekDetectorUtil dayOfTheWeekDetectorUtil = new DayOfTheWeekDetectorUtil();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input day number between 1 and 7 : ");
        int userNum = scanner.nextInt();
        dayOfTheWeekDetectorUtil.getDetectDay(userNum);
        System.out.println("Day - " +  dayOfTheWeekDetectorUtil.getDetectDay(userNum));

}

}
