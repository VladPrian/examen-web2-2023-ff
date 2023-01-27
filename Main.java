package main;

public class Main {
  public static void main(String[] args) {
    Train train1 = new Train("Route1");
    Train train2 = new Train("Route2");
    String trainRoute1 = train1.getRouteName();
    String trainRoute2 = train2.getRouteName();
    
    if (trainRoute1 == trainRoute2) {
      System.out.println("Train route 1: " + trainRoute1);
      System.out.println("Train route 2: " + trainRoute2);
      System.out.println("DANGER! Trains will intersect");
    } else {
      System.out.println("Train route 1: " + trainRoute1);
      System.out.println("Train route 2: " + trainRoute2);
      System.out.println("Trains will not intersect");
    }
    
    train2.setRouteName("Route1");
    trainRoute2 = train2.getRouteName();
    if (trainRoute1 == trainRoute2) {
      System.out.println("Train route 1: " + trainRoute1);
      System.out.println("Train route 2: " + trainRoute2);
      System.out.println("DANGER! Trains will intersect");
    }
    
    train1.setMaxPassengers(500);
    train2.setMaxPassengers(1500);
    if (train1.getMaxPassengers() > train2.getMaxPassengers()) {
      train1.setRouteName("Route3 (low traffic)");
      System.out.println("Train1 will go to the low traffic for faster passenger arrival");
    } else {
      train2.setRouteName("Route3 (low traffic)");
      System.out.println("Train2 will go to the low traffic for faster passenger arrival");
    }
  }
}
