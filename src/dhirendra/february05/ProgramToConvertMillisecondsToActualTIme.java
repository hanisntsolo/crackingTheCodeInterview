package dhirendra.february05;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class ProgramToConvertMillisecondsToActualTIme {
    public static void main(String[] args) {
        while(true) {
            Scanner scan = new Scanner(System.in);
            System.out.println("ENTER THE TIME IN Millisecond : ");
            Integer milliSeconds = scan.nextInt();
            //for seconds divide by 1000
            //for minutes divide by 1000*60
            //for hours divide by 1000*60*60
            long seconds = milliSeconds/1000;
            long finalSeconds = seconds%60;
            long minutes = seconds/60;
            long hour = minutes/60;
            minutes = minutes%60;
            System.out.println("HH:"+hour+" MM:"+minutes+" SS:"+finalSeconds);
            long milliseconds = 1000000;

            // long minutes = (milliseconds / 1000) / 60;
            long minutes1 = TimeUnit.MILLISECONDS.toMinutes(milliseconds);

            // long seconds = (milliseconds / 1000);
            long seconds1 = TimeUnit.MILLISECONDS.toSeconds(milliseconds);
            // long hours = (milliseconds / 1000) / (60 * 60)
            long hour1 = TimeUnit.MILLISECONDS.toHours(milliSeconds);
            System.out.format("%d Milliseconds = %d hours\n", milliseconds, hour1);
            System.out.println("Or");
            System.out.format("%d Milliseconds = %d minutes\n", milliseconds, minutes1 );
            System.out.println("Or");
            System.out.format("%d Milliseconds = %d seconds", milliseconds, seconds1);

        }
    }
}
