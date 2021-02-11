package dhirendra.february11;
import java.util.Scanner;
import java.util.Arrays;

public class TcsXploreQuestion07 {

  public static void main(String[] args) {
    while(true) {
    Scanner sc = new Scanner(System.in);
    String string = sc.nextLine();
    String vowel = "";
    for(int i=0;i<string.length();i++) {
      switch(string.charAt(i)) {
        case 'a':
        case 'e':
        case 'i':
        case 'o':
        case 'u':
        case 'A':
        case 'E':
        case 'I':
        case 'O':
        case 'U':
          vowel+=string.charAt(i);
          break;
        default:
          break;
      }
    }
    char[] chars = vowel.toCharArray();
    Arrays.sort(chars);
    System.out.println("YOUR CHARACTER IS: "+chars[0]);
    }

  }
}
