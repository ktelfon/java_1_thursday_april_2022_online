package student_toomas_park.lesson_6.homework.level_4;

public class ForInfiniteLoop {
    public static void main(String[] args){
        int k = 1;
        for(int i = 0; i<k; k++){
            System.out.println("looool " + k);
            if(k ==  50000){
                break;
            }
        }
    }
}
