package student_Vladislavs_Solims.homework.lesson_4.level_4;

public class Calculator {
    public int sum(int firstNum, int secondNum) {
        return firstNum + secondNum;
    }

    public int subtraction(int firstNum, int secondNum) {
        return firstNum - secondNum;
    }

    public int multiplication(int firstNum, int secondNum) {
        return firstNum * secondNum;
    }

    public int devision(int firstNum, int secondNum) {
        return firstNum / secondNum;
    }

    public boolean isEven(int num) {
        if (num % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public int maxNum(int firstNum, int secondNum) {
        if (firstNum > secondNum) {
            return firstNum;
        } else {
            return secondNum;

        }
    }

    public boolean equalNum(int fistNum, int secondNum) {
        if (fistNum == secondNum) {
            return true;
        } else {
            return false;
        }
    }
    public int maxOfTrhreeNum(int firstNum , int secondNum , int thirdNum ){
        if(firstNum>secondNum && firstNum>thirdNum){
            return firstNum;
        } else if (secondNum > firstNum && secondNum > thirdNum) {
            return secondNum;
        } else if (thirdNum > firstNum && thirdNum > secondNum) {
            return thirdNum;
        } else if (firstNum == secondNum && thirdNum < secondNum) {
            return firstNum;
        } else if (firstNum < secondNum && secondNum == thirdNum) {
            return secondNum;
        } else if (firstNum == thirdNum && secondNum < firstNum) {
            return firstNum;
        }else if (firstNum == thirdNum && secondNum > firstNum) {
            return secondNum;
        }else if (firstNum == secondNum && secondNum < thirdNum) {
            return thirdNum;
        } else {
            return firstNum;
        }
    }
}

