package dhirendra.february04;

import java.sql.Time;

public class TimeDifference {
    int second;
    int minutes;
    int hours;
    TimeDifference(){
    }
    TimeDifference(int second, int minutes, int hours){
        this.second = second;
        this.minutes = minutes;
        this.hours = hours;
    }

    @Override
    public String toString() {
        return "Time [" +
            "second=" + second +
            ", minutes=" + minutes +
            ", hours=" + hours+']';
    }

    public static void calculateDifference(TimeDifference start, TimeDifference stop){
        TimeDifference timeDifference = calculate(start, stop);
        System.out.println("START TIME :"+start.toString());
        System.out.println("STOP TIME :"+stop.toString());
        System.out.println("Time Difference :"+timeDifference.toString());
    }
    public static TimeDifference calculate(TimeDifference t1, TimeDifference t2) {
//        12:34:55 - 8:12:15 = 4:22:40
        TimeDifference difference = new TimeDifference();
            if(t1.second>t2.second){
                --t2.minutes;
                t2.second+=60;
            }
            difference.second = t2.second - t1.second;
            if(t1.minutes>t2.minutes) {
                --t2.hours;
                t2.minutes+=60;
            }
            difference.minutes = t2.minutes - t1.minutes;
            difference.hours = t2.hours - t1.hours;
            return difference;
    }

    public static void main(String[] args) {
        TimeDifference t1 = new TimeDifference(12,34,11);
        TimeDifference t2 = new TimeDifference(2,45,12);
        TimeDifference start = new TimeDifference(8, 12, 15);
        TimeDifference stop = new TimeDifference(12, 34, 55);
        calculateDifference(t1,t2);
        calculateDifference(start,stop);
    }
}
