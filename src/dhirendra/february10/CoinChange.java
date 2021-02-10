package dhirendra.february10;

import java.util.ArrayList;
import java.util.List;

public class CoinChange {

  public static void main(String[] args) {
    coinChange(new int[]{1,2,3},4,3);
  }
  public static void coinChange(int S[], int m, int n) {
    List<List> finalList = new ArrayList<>();
    for(int i=0;i<n;i++) {
    List<Integer> list = new ArrayList<>();
      int count = 0;
      if(m%S[i] == 0) {
        count = m / S[i];
        for(int j=0;j<count;j++) {
          list.add(S[i]);
          }
        finalList.add(list);
        } else if(m%S[i]!=0) {
        for(int k=0;k<n;k++) {
          for(int l=k+1;l<n;l++) {
            if(S[k]+S[l] == m) {
              list.add(S[k]);
              list.add(S[l]);
            }
          }
        }
        finalList.add(list);
      }
    }
    System.out.println(finalList);
  }
}
