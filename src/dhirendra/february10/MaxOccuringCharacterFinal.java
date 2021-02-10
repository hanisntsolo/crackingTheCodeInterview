package dhirendra.february10;
//Difficult to understand only limited solution given
public class MaxOccuringCharacterFinal {
//Not working
  public static void main(String[] args) {
    System.out.println(maxCharacterCount("dhirendra"));
  }
  static final int size = 256;
  static char maxCharacterCount(String line) {
    char[] chars = line.toCharArray();
    int count[] =  new int[size];

    int len = chars.length;
    for(int i=0;i<len;i++) {
      count[line.charAt(i)]++;
    }
//    for(int i=0;i<len;i++) {
//      System.out.println(count[line.charAt(i)]);
//    }
    int max = -1;
    char result = ' ';
    for(int i=0;i<len;i++) {
      if(max<count[line.charAt(i)]) {
        max = count[line.charAt(i)];
        result = line.charAt(i);
      }
    }
    return result;
  }
}
