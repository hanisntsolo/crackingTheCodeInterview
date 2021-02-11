package dhirendra.february11;

import java.util.Scanner;

public class TcsXploreQuestionFinal {

  public static void main(String[] args) {
    Sim[] cards = new Sim[5];
    Scanner sc = new Scanner(System.in);
    for(int i=0;i<5;i++) {
      int simId = sc.nextInt();sc.nextLine();
      String customerName = sc.nextLine();
      double balance = sc.nextDouble();sc.nextLine();
      double ratePerSecond = sc.nextDouble();sc.nextLine();
      String circle = sc.nextLine();
      cards[i] = new Sim(simId, customerName, balance, ratePerSecond, circle);
    }
    String circleOld = sc.nextLine();
    String circleNew = sc.nextLine();
    Sim[] result = transferCustomerCircle(cards, circleOld, circleNew);
    for(Sim sim: result) {
      System.out.println(sim.getSimId()+" "+sim.getCustomerName()+" "+sim.getCircle()+" "+sim.getRatePerSecond());
    }
  }

  static Sim[] transferCustomerCircle(Sim[] sims, String circleOld,String circleNew) {
    int counter=0;
    for(int i=0;i<sims.length;i++) {
      if(sims[i].getCircle().equals(circleOld)) {
        counter++;
      }
    }
    Sim[] newSims = new Sim[counter];
    int index=0;
    for(int i=0;i<sims.length;i++) {
      if(sims[i].getCircle().equals(circleOld)) {
        sims[i].setCircle(circleNew);
        newSims[index++] = sims[i];
      }
    }
    //Sort is mandatory
    for(int i=0;i< newSims.length;i++) {
      for(int j=0;j< i;j++) {
        if(newSims[i].getRatePerSecond()>newSims[j].getRatePerSecond()) {
          Sim temp = newSims[i];
          newSims[i] = newSims[j];
          newSims[j] = temp;
        }
      }
    }
    return newSims;
  }

  static class Sim{
    private int simId;
    private String customerName;
    private double balance;
    private double ratePerSecond;
    private String circle;
    Sim() {}
    public Sim(int simId, String customerName, double balance, double ratePerSecond, String circle) {
      this.simId = simId;
      this.customerName = customerName;
      this.balance = balance;
      this.ratePerSecond = ratePerSecond;
      this.circle = circle;
    }
    public int getSimId() {
      return simId;
    }
    public String getCustomerName() {
      return customerName;
    }
    public double getBalance() {
      return balance;
    }
    public double getRatePerSecond() {
      return ratePerSecond;
    }
    public String getCircle() {
      return circle;
    }
    public void setCircle(String circle) {
      this.circle = circle;
    }
  }

}

//1
//Raj
//100
//1.5
//KOL
//2
//Chetan
//200
//1.6
//AHD
//3
//Asha
//150
//1.7
//MUM
//4
//Kiran
//50
//2.2
//AHD
//5
//Vijay
//130
//1.8
//AHD
//AHD
//KOL