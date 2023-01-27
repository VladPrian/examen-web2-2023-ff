package main;

public class Train {
  public String routeName;
  protected Integer maxPassengers;
  private String color;

  public Train(String routeName) {
    this.routeName = routeName;
  }

  public Train(String routeName, Integer maxPassengers) {
    this.routeName = routeName;
    this.maxPassengers = maxPassengers;
  }

  public Train(String routeName, Integer maxPassengers, String color) {
    this.routeName = routeName;
    this.maxPassengers = maxPassengers;
    this.color = color;
  }

  public String getRouteName() {
    return routeName;
  }

  public void setRouteName(String routeName) {
    this.routeName = routeName;
  }

  public Integer getMaxPassengers() {
    return maxPassengers;
  }

  public void setMaxPassengers(Integer maxPassengers) {
    this.maxPassengers = maxPassengers;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }
}
