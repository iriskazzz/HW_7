package guru.qa;

import guru.qa.Chocolate;

import java.util.ArrayList;
import java.util.List;

public class ArrayListCollection {
  private List<Chocolate> manufacturers = new ArrayList<>();

  protected void searchChocolateByType(String name) {
    for (int i = 0; i < manufacturers.size(); i++) {
      if (manufacturers.get(i).getType().equals(name)) {
        System.out.println("Шоколад " + manufacturers.get(i).getType() + " найден в корзине");
        break;
      }
      System.out.println("Искомый вид шоколада не найден, попробуйте поискать другой!");
    }
  }

  protected void addChocolate(Chocolate manufacturer) {
    manufacturers.add(manufacturer);
    System.out.println("Шоколад " + manufacturer.getType() + " добавлен в корзину!");
  }

  protected void deleteChocolate(Chocolate manufacturer) {
    manufacturers.remove(manufacturer);
    System.out.println("Шоколад " + manufacturer.getType() + " удален из корзины!");
  }

  protected void printBasket() {
    System.out.print("Шоколад в корзине:");
    for (Chocolate manufacturer : manufacturers) {
      System.out.print("\n-" + manufacturer.getType());
    }
    System.out.println();
  }
}