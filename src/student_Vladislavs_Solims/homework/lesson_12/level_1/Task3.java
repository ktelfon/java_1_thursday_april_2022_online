package student_Vladislavs_Solims.homework.lesson_12.level_1;

import java.util.ArrayList;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(0 , 10);
        numbers.add(3);
        numbers.add(4);
        numbers.add(4 ,20);
        numbers.remove(2);
        numbers.remove(Integer.valueOf(4));
        numbers.isEmpty();

        if(numbers.isEmpty() == true){
            System.out.println("Empty list");
        }else{
            System.out.println("This is your list");
        }

        for(int number : numbers) {
            System.out.println(number);
        }
    }
}
