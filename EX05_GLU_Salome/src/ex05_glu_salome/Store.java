package ex05_glu_salome;

//*Author: Charles Patrick Salome

import java.util.*;

public class Store {
  private String name;
  private double earnings;
  private ArrayList<Item> itemList;
  private static ArrayList<Store> storeList = new ArrayList();

  public Store(String name){
      // Initialize store name to parameter and earnings to zero
      this.name = name;
      earnings = 0.0;
      
      //Initialize itemList as a new ArrayList
      itemList = new ArrayList();
      
      //add 'this' store to storeList
      storeList.add(this);
  }

  public String getName(){
    return name;
  }
  public double getEarnings(){
    return earnings;
  }
  public void sellItem(int index){
      // check if index is within itemList and output different if not
      if (index <= itemList.size()) {
      earnings += itemList.get(index).getCost();
      System.out.println("The item: " + itemList.get(index).getName() + ", was sold for " + itemList.get(index).getCost() + " from " + this.name + ".");
      } else {
          System.out.println("There are only " + itemList.size() + " of items in " + this.name); }
      System.out.println();
  }
  public void sellItem(String name){
      //for loop to get the specific item
      for (int i=0; i < itemList.size(); i++) {
          Item item = itemList.get(i);
          
          //if else if invalid item / print statement cost and add to earnings
          if (item.getName().equals(name)){
              earnings += item.getCost();
              System.out.println(item.getName() + " from " + this.name + " was sold for " + item.getCost());
              //to skip else statement
              return;
          }
      }
      //doesn't work in for loop, else statement.
      System.out.println(this.name + " doesn't sell: " + name);
      // just to add spacing between functions
      System.out.println();
  }
  public void sellItem(Item i){
      //checking if 'i' is in the list
      if (itemList.contains(i)) {
          earnings += i.getCost();
          System.out.println("Item " + i.getName() + " from " + this.name + " was sold for " + i.getCost());
      } else
          System.out.println(this.name + " doesn't sell: " + i.getName());
      System.out.println();
  }
  public void addItem(Item i){
       itemList.add(i);
  }
  public void filterType(String type){
    // shortcut to check if item is within list
        for (Item item : itemList) {
            //filterType boolean and output
              if (item.getType().equals(type)) {
                  System.out.println("Items with the " + type + " type: \n" + item.getName() + "\n");
              }
    }
  }
  public void filterCheap(double maxCost){
      //same shortcut from ln 65
    for (Item item : itemList) {
            //cost check if else
              if (item.getCost() <= maxCost) {
                  System.out.println(item.getName() + " is within the budget.");
              }
    }
      System.out.println();
  }
  public void filterExpensive(double minCost){
    //same as filterCheap() but >= minCost
    for (Item item : itemList) {
            //cost check if else
              if (item.getCost() >= minCost) {
                  System.out.println(item.getName() + " is within the minimum cost threshold");
              }
    }
    System.out.println();
  }
  public static void printStats(){   
    //get store instead of item. Provide loop and new line for each store earning.
    for (Store store : storeList) {
        System.out.println(store.getName() + " earned: " + store.getEarnings());
    }
    System.out.println();
  }
}
