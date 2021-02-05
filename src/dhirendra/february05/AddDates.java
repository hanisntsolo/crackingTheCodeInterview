package dhirendra.february05;

import java.util.Calendar;

public class AddDates {

    public static void main(String[] args) {
        Calendar c1 = Calendar.getInstance();
        Calendar c2 = Calendar.getInstance();
        Calendar cFinal = (Calendar) c1.clone();
        cFinal.add(Calendar.YEAR, c2.get(Calendar.YEAR));
        cFinal.add(Calendar.MONTH, c2.get(Calendar.MONTH)+1);
        cFinal.add(Calendar.DATE, c2.get(Calendar.DATE));
        cFinal.add(Calendar.HOUR_OF_DAY, c2.get(Calendar.HOUR_OF_DAY));
        cFinal.add(Calendar.MINUTE, c2.get(Calendar.MINUTE));
        cFinal.add(Calendar.SECOND, c2.get(Calendar.SECOND));
        cFinal.add(Calendar.MILLISECOND, c2.get(Calendar.MILLISECOND));
        System.out.format("%s + %s = %s",c1.getTime(),c2.getTime(),cFinal.getTime());
    }
}
