package dhirendra.february14;
//Roger is very fond of palindromes. He finds that his name is not a palindrome but it can be changed to palindrome if one letter of his name is replaced (Rogor or Reger). All the strings which are palindrome or can be changed to a palindrome with one replacement of any letter in the string are good to him.
//
//    Input:
//    The first line of the testcase contains an integer T denoting the number of testcases.
//    The following T lines contains a string S each.
//
//    Output:
//    For each of the test case print GOOD if the string is good to Roger else BAD.
//
//    Constraints:
//
//    1 <= T <= 100
//    1<= | S | <= 10^4
//    S consist of lowercase English alphabets.
//
//    Example:
//    Input:
//    2
//    roger
//    abcde
//    Output:
//    GOOD
//    BAD
//    Explanation:
//    TestCase 1: Roger can be changed to a palindrome by replacing o with e (reger) or replacing e with o (rogor)
import java.util.*;
import java.lang.*;
import java.io.*;

class GoodString {

  private static String palindrome(String str) {
    String newStr = "";
    for(int i=str.length()-1;i>0;i--) {
      newStr+=str.charAt(i);
    }
    return newStr;
  }
  private static void swap(char ch1, char ch2) {
    char temp = ch1;
    ch2 = temp;
  }

  private static void checkGoodBad(String str) {
    str.toLowerCase();
    for (int i = 0, j = str.length() - 1; i < str.length() - 1; i++, j--) {
      if (str.charAt(0) == (str.charAt(str.length() - 1))) {
        System.out.println("GOOD");
        break;
      }
      swap(str.charAt(i+1),str.charAt(j-1));
      String reverse = palindrome(str);
      if(reverse.equals(str)) {
        System.out.println("GOOD");
        break;
      }
      if(i == j) {
        System.out.println("BAD");
        break;
      }
    }

  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int tests = sc.nextInt();
    sc.nextLine();
    for (int i = 0; i < tests; i++) {
      String str = sc.nextLine();
      checkGoodBad(str);
    }

  }
}