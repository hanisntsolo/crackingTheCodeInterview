package dhirendra.february10;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class MaxOccuringCharacter {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    getMaxOccuringChar(str);
  }
  public static char getMaxOccuringChar(String line) {
    char[] chars = line.toCharArray();
    Arrays.sort(chars);
    Map<Character, Integer> map = new HashMap<>();
//    for(int i=0;i<chars.length-1;i++) {
//    int count=0;
//      for(int j=i;j<chars.length-1;j++) {
//        if(chars[j+1] == chars[j]) {
//          map.put(chars[j],count++);
//        }
//      }
//    }
    int i=1;
    while(i<chars.length) {
      int counter = 0;
        if(chars[i] == chars[i-1]) {
          ++counter;
        }
        map.put(chars[i],counter);
      i++;
    }
//    System.out.println(map.keySet());
//    System.out.println(map.values());
//    System.out.println(map.keySet()+" "+map.values());
    System.out.println(map);;
    return chars[0];
  }
}
