package dhirendra.february10;

import java.util.Vector;

public class AddingOneNew {
  public static void main(String[] args) {
    Vector<Integer> result = addOne(new int[]{9,9,9},3);
    System.out.println(result.toString());
  }
  static Vector<Integer> addOne(int[] a, int n) {
    int carry = 1;
    for (int i = n - 1; i >= 0; i--) {
      carry += a[i];
      a[i] = carry % 10;
      carry = carry / 10;
    }
    Vector<Integer> ans = new Vector<>();
    if (carry > 0) {
      ans.add(carry);
    }
    for (int i = 0; i < n; i++) {
      ans.add(a[i]);
    }
    return ans;
                                    }
}
