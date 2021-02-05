package dhirendra.february05;

import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;
public class ArrayToSet {
    public static void main(String[] args) {
        String[] str = {"Dhirendra", "Pratap", "Singh"};
        Set<String> set = new HashSet<>(Arrays.asList(str));
        System.out.println("NEW SET: "+set);
    }
}
