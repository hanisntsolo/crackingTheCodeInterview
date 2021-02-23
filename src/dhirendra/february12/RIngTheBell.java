package dhirendra.february12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//In a locality, there are 2 temples. Each of them has a bell which rings at an interval of a and b seconds respectively. You task is to find in what time L will all the bell ring together.
//
//
//
//    Input:
//
//    The first line of the input contains T denoting the number of test cases. The following T lines contains 2 integer value a and b each.
//    Output:
//
//    For each of the testcase print L in separate lines.
//    Constraints:
//
//    1 <= T <= 10^5
//
//    1<= a,b <= 10^6
//    Example:
//
//    Input:
//
//    2
//    6 8
//    4 6
//
//    Output:
//
//    24
//    12
//
//    Explanation:
//
//    Test case 1:The first bell rings at 6, 12, 18, 24, 30 seconds.
//    The second bell ring at 8, 16, 24, 32 seconds.
//    They ring together at 24 seconds.
//    TestCase 2: Both the bell ring together at 12 seconds.
public class RIngTheBell {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int times = sc.nextInt();sc.nextLine();
    for(int i=0;i<times;i++) {
      int first = sc.nextInt();
      int second = sc.nextInt();
      System.out.println(ringBells(first,second));
    }
  }
  public static int ringBells(int bell1, int bell2) {
    int finalBell = 0;
    List<Integer> bellList1 = new ArrayList<>();
    List<Integer> bellList2 = new ArrayList<>();
    for(int i =1; i<8;i++) {
      int b1 = bell1*i;
      int b2 = bell2*i;
      bellList1.add(b1);
      bellList2.add(b2);
    }
    for(int i=0;i<bellList1.size();i++) {
      for(int j=0;j<bellList2.size();j++) {
        if(bellList1.get(i) == bellList2.get(j)) {
          finalBell = bellList1.get(j);
          return finalBell;

        }
      }
    }
    return 0;
  }
}
