package student_Vladislavs_Solims.homework.lesson_6.level_3;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class ArrayService {


    public boolean contains(int[] arr, int numberToSearch) {
        boolean contains = false;
        for (int i : arr) {
            if (i == numberToSearch) {
                contains = true;
                break;
            }
        }

        return contains;
    }
public int howMuchContains(int[] arr , int numberToSearch){
        int howMuchContains = 0;
        for(int i : arr){
            if(i==numberToSearch){
                howMuchContains++;
            }
        }
        return howMuchContains ;
}

public boolean replaceFirstNumber(int[] arr , int numberToReplace,  int newNumber){
        boolean replaced = false;
    for (int i = 0; i < arr.length; i++) {
        if(arr[i]==numberToReplace){
            arr[i]=newNumber;
            replaced=true;
           break;
        }
    }
    return replaced;
    }
    public boolean replaceAnyNumber(int[] arr , int numberToReplase , int newNumber){
        boolean replased = false ;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==numberToReplase){
                arr[i]=newNumber;
                replased=true;
                break;
            }
        }
        return replased;
    }
    public void turnAroundArray(int[] arr){
        System.out.println("/n2. Turned Array :");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[5]);
            i--;
        }
    }
    public void revertArray(int[] array) {
        int m = 0;
        for (int i = 0; i < array.length / 2; i++) {
            m = array[i];
            array[i] = array[(array.length - 1) - i];
            array[(array.length - 1) - i] = m;
        }
    }

    public void sortArray(int[] array) {
        int m;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    m = array[i];
                    array[i] = array[j];
                    array[j] = m;
                }
            }
        }
    }




}
