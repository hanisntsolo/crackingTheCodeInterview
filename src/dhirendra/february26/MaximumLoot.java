package dhirendra.february26;
import java.util.Arrays;
import java.util.Scanner;
//This program is not working
public class MaximumLoot {
  private static int[] unitWiseSort(int[] value, int[] weight) {
    int[] units = new int[value.length];
    int loots = value.length;
    while(loots>=0) {
      units[loots-1] = value[loots-1]/weight[loots-1];
    }
    Arrays.sort(units);
    return units;
  }
  private static int knapSack(int loots, int capacity, int[] value, int[] weight) {
    int netValue = 0;
    int[] unitValue = unitWiseSort(value, weight);
    int upperBound = unitValue.length-1;
    for(int i=0;i<loots;i++) {
      if(capacity == 0)
        return netValue;
      int a = Math.min(weight[i],capacity);
      netValue +=  a * unitValue[(int)upperBound-i];

      capacity = capacity - a;
    }
    return netValue;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int loots = sc.nextInt();
    int capacity = sc.nextInt();
    int[] value = new int[loots];
    int[] weight = new int[loots];
    for(int i=0;i<loots;i++) {
      value[i] = sc.nextInt();
      weight[i] = sc.nextInt();
    }
      int result = knapSack(loots, capacity, value, weight);
      System.out.println(result);
  }
}
