package dhirendra.february10;

import java.util.Scanner;
//First question implemented on your own !!
public class TCSXploreQuestion04 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Inventory[] inventory = new Inventory[4];
    for(int i=0;i<inventory.length;i++) {
      String inventoryId = sc.nextLine();
      int maximumQuantity=sc.nextInt();sc.nextLine();
      int currentQuantity = sc.nextInt();sc.nextLine();
      int threshold = sc.nextInt();sc.nextLine();
      inventory[i] = new Inventory(inventoryId, maximumQuantity, currentQuantity, threshold);
    }
    int limit = sc.nextInt();
    Inventory[] returnedInventory = replenish(limit,inventory);
    for(int i=0;i<returnedInventory.length;i++) {
      if(returnedInventory[i].threshold>=75) {
        System.out.println(returnedInventory[i].inventoryId+" Critical Filling");
      } else if(returnedInventory[i].threshold>=50 || returnedInventory[i].threshold<75) {
        System.out.println(returnedInventory[i].inventoryId+" Moderate Filling");
      } else {
        System.out.println("Non-Critical Filling");
      }
    }
  }

  public static Inventory[] replenish(int limit, Inventory[]  inventories) {
    int counter=0;
    for(int i=0;i<inventories.length;i++) {
      if(inventories[i].threshold<=limit) {
        counter++;
      }
    }
    int b=0;
    Inventory[] newInventories = new Inventory[counter];
    for(int i=0;i<inventories.length;i++) {
      if(inventories[i].threshold<=limit) {
        newInventories[b++] = inventories[i];
      }
    }
    return newInventories;
  }

  static class Inventory{
    private String inventoryId;
    private int maximumQuantity;
    private int currentQuantity;
    private int threshold;

    public Inventory() {
    }

    public Inventory(String inventoryId, int maximumQuantity, int currentQuantity, int threshold) {
      this.inventoryId = inventoryId;
      this.maximumQuantity = maximumQuantity;
      this.currentQuantity = currentQuantity;
      this.threshold = threshold;
    }
    public void setInventoryId(String inventoryId) {
      this.inventoryId = inventoryId;
    }
    public void setMaximumQuantity(int maximumQuantity) {
      this.maximumQuantity = maximumQuantity;
    }
    public void setCurrentQuantity(int currentQuantity) {
      this.currentQuantity = currentQuantity;
    }
    public void setThreshold(int threshold) {
      this.threshold = threshold;
    }
    public String getInventoryId() {
      return inventoryId;
    }
    public int getMaximumQuantity() {
      return maximumQuantity;
    }
    public int getCurrentQuantity() {
      return currentQuantity;
    }
    public int getThreshold() {
      return threshold;
    }
  }
}
