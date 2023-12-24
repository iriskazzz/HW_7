package guru.qa;

public class Main {
  public static void main(String[] args) {
    Chocolate bitter = new Chocolate("горький", 530, 90, 90);
    Chocolate milk = new Chocolate("молочный", 510, 350, 40);
    Chocolate white = new Chocolate("белый", 440, 350, 10);

    ArrayListCollection arrayListCollection = new ArrayListCollection();
    arrayListCollection.addChocolate(bitter);
    arrayListCollection.addChocolate(milk);
    arrayListCollection.addChocolate(white);
    arrayListCollection.printBasket();
    arrayListCollection.searchChocolateByType("горький");
    arrayListCollection.deleteChocolate(milk);
    arrayListCollection.printBasket();

    System.out.println("\n");

    HashMapCollection hashMapCollection = new HashMapCollection();
    hashMapCollection.addChocolate(milk);
    hashMapCollection.addChocolate(white);
    hashMapCollection.addChocolate(bitter);
    hashMapCollection.printBasket();
    hashMapCollection.searchChocolateByType("молочный");
    hashMapCollection.deleteChocolate(white);
    hashMapCollection.printBasket();

    System.out.println("\n");

    HashSetCollection hashSetCollection = new HashSetCollection();
    hashSetCollection.addChocolate(milk);
    hashSetCollection.addChocolate(white);
    hashSetCollection.addChocolate(bitter);
    hashSetCollection.printBasket();
    hashSetCollection.searchChocolate(bitter);
    hashSetCollection.deleteChocolate(bitter);
    hashSetCollection.printBasket();

    System.out.println("\n");

    LinkedListCollection linkedListCollection = new LinkedListCollection();
    linkedListCollection.addChocolate(bitter);
    linkedListCollection.addChocolate(white);
    linkedListCollection.printBasket();
    linkedListCollection.searchChocolate(bitter);
    linkedListCollection.deleteChocolate(white);
    linkedListCollection.printBasket();

    System.out.println("\n");
  }
}
