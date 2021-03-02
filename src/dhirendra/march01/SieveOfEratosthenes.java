package dhirendra.march01;

public class SieveOfEratosthenes {
  private static void sieveOfEratosthenes(long num) {
    boolean[] prime = new boolean[(int) num + 1];
    for (int i = 0; i <= num; i++)
      prime[i] = true;
    for (int j = 2; j <= Math.sqrt(num); j++) {
      if (prime[j] == true)
        for (int k = j * j; k <= num; k += j) {
          prime[k] = false;
        }
    }
    for (int l = 2; l <= num; l++) {
      if(prime[l] == true)
        System.out.print(l + " ");
    }
  }

  public static void main(String[] args) {
    sieveOfEratosthenes(10);
  }
}
