package january23;

//#Given a maximum of four digit to the base 17 (10 – A, 11 – B, 12 – C, 13 – D … 16 – G} as input, output its decimal value.
//
//    #Test Cases
//    #Case 1
//    #Input – 1A
//    #Expected Output – 27
//    #Case 2
//    #Input – 23GF
//    #Expected Output – 10980

import java.util.HashMap;
import java.util.Scanner;

public class PrepInsta02 {
    public static void main(String[] args) {
        HashMap<Character,Integer> map = new HashMap<>();
        map.put('A',10);
        map.put('B',11);
        map.put('C',12);
        map.put('D',13);
        map.put('E',14);
        map.put('F',15);
        map.put('G',16);
        map.put('a',10);
        map.put('b',11);
        map.put('c',12);
        map.put('d',13);
        map.put('e',14);
        map.put('f',15);
        map.put('g',16);
        System.out.println("PLEASE ENTER A NUMBER IN BASE 17");
        Scanner cin = new Scanner(System.in);
        String s = cin.nextLine();
        long num = 0;
        int k = 0;
        for(int i = s.length() -1;i>=0;i--) {
            if((s.charAt(i)>'A'&&s.charAt(i)<'Z')||(s.charAt(i)>'a'&&s.charAt(i)<'z')) {
                num+=map.get(s.charAt(i))*(int)Math.pow(17,k++);
            } else {
                num+=((s.charAt(i)-'0')*(int)Math.pow(17,k++));
            }
        }
        System.out.println("BASE CONVERSION IS EQUAL TO"+num);
    }
}
