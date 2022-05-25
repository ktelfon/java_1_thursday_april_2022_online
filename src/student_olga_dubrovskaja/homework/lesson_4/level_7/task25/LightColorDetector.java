package student_olga_dubrovskaja.homework.lesson_4.level_7.task25;
//Дан класс LightColorDetector и его тест LightColorDetectorTest.
//Найдите способ упростить тесты в LightColorDetectorTest.
//
//Тесты тоже должны быть написаны как можно лучше и качественнее!
//Дублирование кода - это почти всегда плохая идея в программировании.
//Поэтому от дублирования кода нужно избавляться.
//
//Подсказка: вынесите в отдельный метод проверку
//результата и замените её вызовом метода в каждом тесте.
//
//Инстанция класса LightColorDetector не имеет состояния,
//она stateless. Найдите в интернете, что такое stateless класс
//в программировании. Найдите способ использовать одну
//инстанцию класса LightColorDetector для всех тестов.

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class LightColorDetector {
    int wavelength;
    LightColorDetector(int wavelength){
        this.wavelength = wavelength;
    }

    public String detect() {
        if (wavelength >= 380 && wavelength <= 449) {
            return "Violet";
        } else if (wavelength >= 450 && wavelength <= 494) {
            return "Blue";
        } else if (wavelength >= 495 && wavelength <= 569) {
            return "Green";
        } else if (wavelength >= 570 && wavelength <= 589) {
            return "Yellow";
        } else if (wavelength >= 590 && wavelength <= 619) {
            return "Orange";
        } else if (wavelength >= 620 && wavelength <= 750) {
            return "Red";
        } else {
            return "Invisible Light";
        }
    }
}
