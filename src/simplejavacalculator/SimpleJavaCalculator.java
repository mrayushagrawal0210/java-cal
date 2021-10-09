

package simplejavacalculator;

public class SimpleJavaCalculator {
   
   public static void main(String[] args) {
      //add try catch block
      try {
         UI uiCal = new UI();
         uiCal.init();
      }
      catch (Exception e) {
         System.out.println(e.getMessage());   
      }
      
   }
}
