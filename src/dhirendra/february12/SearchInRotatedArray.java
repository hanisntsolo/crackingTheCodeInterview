package dhirendra.february12;

import java.util.Scanner;
//Its correct but you have to use binarySearch for larger arrays;
public class SearchInRotatedArray {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    int trials = sc.nextInt();sc.nextLine();
    for(int i=0;i<trials;i++) {
      long length = sc.nextInt();
      long[] arr = new long[(int) length];
      for(int j=0;j<length;j++) {
        arr[j] = sc.nextInt();
      }
      sc.nextLine();
      long query = sc.nextInt();
      long k=0;
      long flag=0;
      while(k<length) {
        if(k==length-1) {
          flag = -1;
          break;
        }
        else if(k!=length-1) {
          if(query == arr[(int) k]) {
            flag=k;
            break;
          }
        }
        k++;
      }
      System.out.println(flag);
    }
  }
}
