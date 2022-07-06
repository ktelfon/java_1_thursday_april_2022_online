package student_Vladislavs_Solims.class_exersizes.lesson_9;

import java.util.ArrayList;
import java.util.List;

public class Colection {
    public static void main(String[] args) {


        List<String> scaryStories = new ArrayList<>();
        scaryStories.add("Your browser history is public ");
        scaryStories.add("You didn't kill this spider");
        for(String story : scaryStories){
            System.out.println(story);
        }

    }
}
