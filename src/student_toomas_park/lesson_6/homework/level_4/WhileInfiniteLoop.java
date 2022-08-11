package student_toomas_park.lesson_6.homework.level_4;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class WhileInfiniteLoop {
    public static void main(String[] args){
    int k = 1;
    int n = 2;
    while(n>k) {
        n++;
        k++;
        System.out.println("looool " + n + " + " + k + " + " + n*k);
        if(n ==  50000){
            break;
        }
    }
    }
}
