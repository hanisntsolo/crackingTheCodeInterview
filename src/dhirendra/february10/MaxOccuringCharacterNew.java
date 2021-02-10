package dhirendra.february10;
import java.util.Arrays;
public class MaxOccuringCharacterNew {
  public static void main(String[] args) {
    System.out.println(maxOccuringCharacter("dhirendra"));
  }
  static char maxOccuringCharacter(String line) {
    StringBuffer sb=new StringBuffer();
    char[] s=line.toCharArray();
    int[] arr=new int[26];
    int max=-1;
    char result='\u0000';
    // storing the count in array of each character in the string
    for(int i=0;i<s.length;i++)
    {
      char c=s[i];
      if(c!=' ')
      {
        arr[c-'a']++;
      }
    }
    // iterating through the arr[] to
    // find the char with max occurrence
    for(int i=0;i<arr.length;i++)
    {
      if(arr[i]>max)
      {
        max=arr[i];
        result=(char)(i+'a');
      }
    }
    return result;
  }
}
