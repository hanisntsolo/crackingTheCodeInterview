package dhirendra.february10;
//Failed at once
//Incorrect code
import java.util.Vector;
  public class AddingOne {
    public static void main(String[] args) {
      Vector<Integer> result = addOne(new int[]{5,6,7,8},4);
      System.out.println(result.toString());
    }
    // function for adding one to number
    public static Vector<Integer> addOne(int[] a, int n) {
      Vector<Integer> finalResult = new Vector<>();
      int result=a[0];
      for(int i=0;i<n;i++) {
        if(i!=n-1)
          finalResult.add(a[i]);
//        result = result*10 + a[i+1];
        if(i == n-1)
          finalResult.add(a[i]+1);
      }
//      finalResult.add(result+1);
      return finalResult;
    }
  }

