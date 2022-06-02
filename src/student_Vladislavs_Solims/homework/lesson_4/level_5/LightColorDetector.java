package student_Vladislavs_Solims.homework.lesson_4.level_5;

public class LightColorDetector {


    public String detect(int waveLength) {
        if(waveLength > 379 && waveLength < 450){
            return "Violet";
        } else if (waveLength > 449 && waveLength < 495) {
            return "Blue";
        } else if (waveLength > 494 && waveLength < 570) {
            return "Green";
        } else if (waveLength > 569 && waveLength < 590) {
            return "Yellow";
        } else if (waveLength > 589 && waveLength < 620) {
            return "Orange";
        } else if (waveLength > 619 && waveLength < 751) {
            return "Red";
        }else{
            return "Invisible light";
        }

    }


}
