package guru.qa;

public class Chocolate {

  private String type;
  private int price;
  private int weight;
  private int percentageOfCocoa;

  protected Chocolate(String type, int price, int weight, int percentageOfCocoa) {
    this.type = type;
    this.price = price;
    this.weight = weight;
    this.percentageOfCocoa = percentageOfCocoa;
  }

  protected String getType() {
    return type;
  }
}
