package dhirendra.february23;

public class SmallestMultiple {
  private static long gcd(long a,long b) {
    if(a == 0)
      return b;
    return gcd(b%a,a);
  }
  private static long findGCD(long arr[],long n)
  {
    long result = arr[0];
    for (int i = 1; i < n; i++)
    {
      result = gcd(arr[i], result);

      if(result == 1)
      {
        return 1;
      }
    }
    return result;
  }
  private static long smallestMultiple(long number) {
    long[] arr = new long[(int)number];
    long result=1;
    long product = 1;
    for(int i=0;i<number;i++) {
      arr[i] = i+1;
      product = product * arr[i];
    }
      result = findGCD(arr,arr.length);
    long smallest = product/result;
    return smallest;
  }

  public static void main(String[] args) {
    long result = smallestMultiple(10);
    System.out.println(result);
  }
}
