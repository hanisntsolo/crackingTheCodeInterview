package dhirendra.february04;

import java.util.Arrays;

public class CharacterFrequency {
    public static void main(String[] args) {
        String string = "malyalam";
        int freq = frequency(string, 'a');
        System.out.println("Total Number of Characters in : "+string+" is " +freq);
    }
    public static int frequency(String string, char a) {
        int i=0;
        int counter=0;
        while(i<string.length()) {
            if(string.charAt(i) == a) {
                counter++;
            }
            i++;
        }
        return counter;
    }
}
