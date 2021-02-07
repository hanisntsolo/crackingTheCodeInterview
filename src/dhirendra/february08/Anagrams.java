package dhirendra.february08;

import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {
    private static void sort(char[] array) {
        int length = array.length;
        for(int i=0;i<length-1;i++) {
            for(int j=0;j<length-i-1;j++) {
                if(array[j]>array[j+1]) {
                    char temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }
    static boolean isAnagram(String a, String b) {
        // Complete the function
        boolean ana =false;
        a = a.toUpperCase();
        b = b.toUpperCase();
        System.out.println(a);
        char[] first = a.toCharArray();
        char[] second = b.toCharArray();
        sort(first);
        sort(second);
        int i=0;
        while(i<first.length){
            if(first[i]!=second[i]) {
                ana = true;
                return ana;
            }
            i++;
        }
        return ana;
    }

    public static boolean Hackerrank(String a, String b){
        char aa[] = a.toLowerCase().toCharArray();
        char bb[] = b.toLowerCase().toCharArray();
        if (a.length() != b.length()) {
            return false;
        } else {
            java.util.Arrays.sort(aa);
            java.util.Arrays.sort(bb);
            return java.util.Arrays.equals(aa, bb);
        }
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (!ret) ? "Anagrams" : "Not Anagrams" );
    }
}
