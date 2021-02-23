package dhirendra.february12;

public class NumberOfUniquePaths {
  public static int numberOfUniquePath(int a, int b) {
    if(a == 1 || b == 1)
      return 1;
    return numberOfUniquePath(a-1,b) + numberOfUniquePath(a,b-1);
//    +numberOfUniquePath(a-1,b-1); // if diagonal is also considered

  }

  public static void main(String[] args) {
    System.out.println(numberOfUniquePath(3,5));
  }
}
