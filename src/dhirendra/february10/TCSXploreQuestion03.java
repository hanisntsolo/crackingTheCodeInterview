package dhirendra.february10;

import java.util.List;

public class TCSXploreQuestion03 {
  public static void lastCharactersAnotherApproach(String str) {
    str = str + " ";
    for(int i=0;i<str.length();i++) {
      if(str.charAt(i)== ' ') {
        System.out.print(str.charAt(i-1));
      }
    }
    System.out.println();
  }
  public static void lastCharacters(String str) {
//    StringBuilder stringBuffer = new StringBuilder();
    String[] array = str.split(" ");
    for(int i=0;i<array.length;i++) {
      System.out.print(array[i].charAt(array[i].length()-1));
    }
    System.out.println("");
  }

  public static void main(String[] args) {
    lastCharacters("Dhirendra Pratap SIngh");
    lastCharacters("Welcome Home Buddy");
    lastCharactersAnotherApproach("Welcome Home Buddy");
  }
}
