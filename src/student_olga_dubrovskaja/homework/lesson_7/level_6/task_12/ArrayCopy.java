package student_olga_dubrovskaja.homework.lesson_7.level_6.task_12;

class ArrayCopy {
    int[] copyInRange(int[] in, int numberFrom, int numberTo) {
        int[] copyInRange = new int[countNumberOfElements(in, numberFrom, numberTo)];
        for (int i : in) {
            if (i >= numberFrom && i <= numberTo) {
                for (int j = 0; j < copyInRange.length; j++) {
                    if (copyInRange[j] == 0) {
                        copyInRange[j] = i;
                        break;
                    }
                }
            }
        }
        return copyInRange;
    }

    int countNumberOfElements(int[] in, int numberFrom, int numberTo) {
        int counter = 0;
        for (int i : in) {
            if (i >= numberFrom && i <= numberTo) {
                counter++;
            }
        }
        return counter;
    }

}
