package dhirendra.february17;

import java.util.Scanner;
import java.util.TreeSet;

public class RemoveDuplicates {

}
class GFG {
  public static void main (String[] args) {
    TreeSet<Integer> set = new TreeSet<Integer>();
    Scanner sc = new Scanner(System.in);
    int test = sc.nextInt();sc.nextLine();
    for(int i=0;i<test;i++) {
      int length = sc.nextInt();
      //  int[] arr = new int[length];
      for(int j=0;j<length-1;j++) {
        //Integer arr = sc.nextInteger();
        set.add(sc.nextInt());
      }
      for(int num:set) {
        System.out.print(num+" ");
      }
    }
  }
}
