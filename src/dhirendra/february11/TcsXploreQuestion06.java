package dhirendra.february11;

import java.util.Scanner;
import javax.print.DocFlavor.READER;

public class TcsXploreQuestion06 {

  public static void main(String[] args) {
    System.out.println("**WELCOME TO ICC CHAMPIONSHIP**");
    Scanner sc = new Scanner(System.in);
    Player[] players = new Player[4];
    for(int i=0;i<players.length;i++) {
      int playerId = sc.nextInt();sc.nextLine();
      String playerName = sc.nextLine();
      int iccRank = sc.nextInt();sc.nextLine();
      int noOfMatchesPlayed = sc.nextInt();sc.nextLine();
      int totalRunsScored = sc.nextInt();sc.nextLine();
      players[i] = new Player(playerId, playerName, iccRank, noOfMatchesPlayed, totalRunsScored);
    }
    int target = sc.nextInt();
    Double[] playersAverage = findAverageScoreOfPlayers(target, players);
    for(int i=0;i<playersAverage.length;i++) {
      if(playersAverage[i]>=80) {
        System.out.println("GRADE A PLAYER");
      } else if(playersAverage[i]>=50 || playersAverage[i]<=79) {
        System.out.println("GRADE B PLAYER");
      } else {
        System.out.println("GRADE C PLAYER");
      }
    }
  }

  static Double[] findAverageScoreOfPlayers(int target, Player[] players) {
    int counter = 0;
    for(int i=0;i<players.length;i++) {
      if(players[i].noOfMatchesPlayed>target) {
        counter++;
      }
    }
    Double[] averageRRate = new Double[counter];
    int index = 0;
    for(int i=0;i<players.length;i++) {
      double averageRunRate = players[i].totalRunsScored / players[i].noOfMatchesPlayed;
      if(players[i].noOfMatchesPlayed>target) {
        averageRRate[index++] = averageRunRate;
      }
    }
    return averageRRate;
  }

  static class Player {
    private int playerId;
    private String playerName;
    private int iccRank;
    private int noOfMatchesPlayed;
    private int totalRunsScored;

    Player() {}
    public Player(int playerId, String playerName, int iccRank, int noOfMatchesPlayed,int totalRunsScored) {
      this.playerId = playerId;
      this.playerName = playerName;
      this.iccRank = iccRank;
      this.noOfMatchesPlayed = noOfMatchesPlayed;
      this.totalRunsScored = totalRunsScored;
    }
    public int getPlayerId() {
      return playerId;
    }
    public String getPlayerName() {
      return playerName;
    }
    public int getIccRank() {
      return iccRank;
    }
    public int getNoOfMatchesPlayed() {
      return noOfMatchesPlayed;
    }
    public int getTotalRunsScored() {
      return totalRunsScored;
    }
  }
}
