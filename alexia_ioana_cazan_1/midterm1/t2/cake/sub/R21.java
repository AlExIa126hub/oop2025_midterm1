package alexia_ioana_cazan_1.midterm1.t2.cake.sub;
import alexia_ioana_cazan_1.midterm1.t2.cake.A21;
import alexia_ioana_cazan_1.midterm1.t2.oil.rehearsal.A22;


public class R21 {

  private static String getMonthName(int month) {
    switch (month) {
        case 1: return "January";
        case 2: return "February";
        case 3: return "March";
        case 4: return "April";
        case 5: return "May";
        case 6: return "June";
        case 7: return "July";
        case 8: return "August";
        case 9: return "September";
        case 10: return "October";
        case 11: return "November";
        case 12: return "December";
        default: return "Invalid month";
    }
}

  public static void main(String[] args) {

      // Print the area of the rectangle from the "R21". The area should be calculated according to the "A21" class variables. The hardcoded answer is not requested.
      A21 a21 = new A21();
      int area = a21.getWidth() * a21.getHeight();
      System.out.println("The area of the rectangle is: " + area);

      // Print the name of the month from the "R21". The name of the month should be determined according to the "A22" class variable. The hardcoded answer is not requested. Checking of invalid value is mandatory.
      A22 a22 = new A22();
      int month = a22.getMonth();
      System.out.println("The month is: " + getMonthName(month));

  }
  
}
