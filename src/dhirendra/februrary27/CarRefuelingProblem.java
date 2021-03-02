package dhirendra.februrary27;

import java.util.Scanner;

public class CarRefuelingProblem {
  private static long refuel(long finalDistance,long pumps, long[] pumpStations, long milesOnFullTank) {
    if(finalDistance<=milesOnFullTank)
      return 0;
    long numRefill = 0;
    long currentRefill = 0;
    while(currentRefill<pumps-1) {
      long lastRefill = currentRefill;
      while (currentRefill<pumps && (pumpStations[(int)currentRefill+1] - pumpStations[(int)lastRefill]) <= finalDistance) {
        currentRefill = currentRefill + 1;
      }
      if( currentRefill == lastRefill) {
        return -1;
      }
      if(currentRefill<=pumps) {
        numRefill+=1;
      }
    }
      return numRefill;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long finalDistance = sc.nextLong();sc.nextLine();
    long milesOnFullTank = sc.nextLong();sc.nextLine();
    long pumps = sc.nextLong();sc.nextLine();
    long[] pumpStations = new long[(int)pumps];
    for(int i=0;i<pumps;i++) {
//      if(i<=pumps-1)
      pumpStations[i] = sc.nextLong();
//      if(i == pumps)
//      pumpStations[i] = finalDistance;
    }
    long refills = refuel(finalDistance,pumps, pumpStations, milesOnFullTank);
    System.out.println(refills);
  }
}
