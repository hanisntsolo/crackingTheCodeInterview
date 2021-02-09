package dhirendra.february10;
//Count number of spaces and and letters in a given string
public class TCSxploreQuestion01 {
  public static void countSpacesAndCharacters(String str) {
    char[] stringArray = str.toCharArray();
    int letters = 0;
    int spaces = 0;
    for(char ch:stringArray) {
      if(ch == ' ')
        spaces++;
      if(ch != ' ')
        letters++;
    }
    System.out.print(letters+" "+spaces);
    System.out.println("");
  }

  public static void main(String[] args) {
    countSpacesAndCharacters("Dhirendra Pratap Singh");
    countSpacesAndCharacters("Welcome Home Buddy");
  }
}
