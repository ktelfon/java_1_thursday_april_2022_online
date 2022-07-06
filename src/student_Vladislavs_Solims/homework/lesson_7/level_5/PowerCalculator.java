package student_Vladislavs_Solims.homework.lesson_7.level_5;

public class PowerCalculator {

   public double power(double number , double power ) {
      double result = 0;
      for (int i = 1; i < power; i++) {
         result = number * power;

      }
      return result;
   }
}
