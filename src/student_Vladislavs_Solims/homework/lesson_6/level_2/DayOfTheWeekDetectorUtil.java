package student_Vladislavs_Solims.homework.lesson_6.level_2;

public class DayOfTheWeekDetectorUtil {


    public String getDetectDay(int dayNumber){
        String dayOfTheWeek = " " ;
      switch (dayNumber) {
          case 1 : dayOfTheWeek ="Monday";
          break;
          case 2 : dayOfTheWeek ="Tuesday";
          break;
          case 3 : dayOfTheWeek ="Wednesda";
          break;
          case 4 : dayOfTheWeek ="Thursday";
          break;
          case 5 : dayOfTheWeek ="Friday";
          break;
          case 6 : dayOfTheWeek ="Saturday";
          break;
          case 7 : dayOfTheWeek ="Sunday";
          break;
          default : dayOfTheWeek ="Not correct day number";
      }
      return dayOfTheWeek;
    }


}



