package guru.qa;

import guru.qa.Chocolate;

import java.util.HashMap;
import java.util.Map;

public class HashMapCollection {
  private Map<Integer, Chocolate> manufacturers = new HashMap<>();

  protected void searchChocolateByType(String name) {
    for (var manufacturer : manufacturers.entrySet()) {
      if (manufacturer.getValue().getType().equals(name)) {
        System.out.println("Шоколад " + manufacturer.getValue().getType() +
                " найден под индексом " + manufacturer.getKey());
        break;
      }
      System.out.println("Искомый вид шоколада не найден, попробуйте поискать другой!");
    }
  }

  protected void addChocolate(Chocolate manufacturer) {
    manufacturers.put(manufacturers.size(), manufacturer);
    System.out.println("Шоколад " + manufacturer.getType() + " добавлен в корзину!");
  }

  protected void deleteChocolate(Chocolate manufacturer) {
    manufacturers.entrySet().removeIf(entry -> entry.getValue().equals(manufacturer));
    System.out.println("Шоколад " + manufacturer.getType() + " удален из корзины!");
  }

  protected void printBasket() {
    System.out.print("Шоколад в корзине: ");
    for (var manufacturer : manufacturers.entrySet()) {
      System.out.print("\n" + manufacturer.getKey() + " - " + manufacturer.getValue().getType());
    }
    System.out.println();
  }
}