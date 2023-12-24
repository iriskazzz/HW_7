package guru.qa;

import guru.qa.Chocolate;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetCollection {
  private Set<Chocolate> manufacturers = new HashSet<>();

  protected void searchChocolate(Chocolate manufacturer) {
    if (manufacturers.contains(manufacturer)) {
      System.out.println("Шоколад " + manufacturer.getType() + " найден в корзине!");
    } else {
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
    System.out.print("Шоколад в корзине: ");
    Iterator<Chocolate> i = manufacturers.iterator();
    while (i.hasNext()) {
      System.out.print("\n-" + i.next().getType());
    }
    System.out.println();
  }
}