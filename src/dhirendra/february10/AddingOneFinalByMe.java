package dhirendra.february10;
//Very good question
import java.util.Vector;

public class AddingOneFinalByMe {
  public static void main(String[] args) {
    Vector<Integer> vector = addCarry(new int[]{9,9,9},3);
    System.out.println(vector.toString());
  }
  static Vector<Integer> addCarry(int[] a, int n) {
    int carry = 1;
    for(int i=n-1;i>=0;i--) {
        carry = carry+a[i]; // first pass 10 // second pass 10 //third pass 10
        a[i] = carry % 10;  //first pass 0 // second pass 0 // third pass 0
        carry = carry / 10; //first pass 1 //second pass 1 // third pass 1
      }
    Vector<Integer> finalAnswer = new Vector<>();
    if(carry > 0)
      finalAnswer.add(carry);
    for(int i=0;i<n;i++) {
      finalAnswer.add(a[i]);
    }
    return finalAnswer;
  }
}
