package guru.qa;

import guru.qa.Chocolate;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class LinkedListCollection {
  private Queue<Chocolate> manufacturers = new LinkedList<>();

  protected void searchChocolate(Chocolate manufacturer) {
    if (manufacturers.contains(manufacturer)) {
      System.out.println("Шоколад " + manufacturer.getType() + " найден");
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
    System.out.print("Шоколад в корзине:  ");
    Iterator<Chocolate> i = manufacturers.iterator();
    if(i.hasNext()){
      do{
        System.out.print("\n-" + i.next().getType());
      }
      while (i.hasNext());
    }
    System.out.println();
  }
}
