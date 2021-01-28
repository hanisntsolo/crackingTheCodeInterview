package dhirendra.january26;

public class LeapYear {
    public static void leapYearCalculator(int year) {
        //// leap year if perfectly visible by 400
        String LEAP_YEAR = "The entered year is leap year";
        String NOT_LEAP_YEAR = "The entered year not is leap year";
        if(year%400 == 0) {
            System.out.println(LEAP_YEAR);
        }
        //// not a leap year if dvisible by 100
        //// but not divisible by 400
        else if(year%100 == 0 && year%400 != 0) {
            System.out.println(NOT_LEAP_YEAR);
        }
        // leap year if not divisible by 100
        // but divisible by 4
        else if(year%100 != 0 && year%4 == 0) {
            System.out.println(LEAP_YEAR);
        }
        // all other years are not leap year
        else {
            System.out.println(NOT_LEAP_YEAR);
        }
    }

    public static void main(String[] args) {
        leapYearCalculator(1999);
        leapYearCalculator(2000);
        leapYearCalculator(2004);
    }
}
