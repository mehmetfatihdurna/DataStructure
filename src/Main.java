// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
      //ARRAY LIST OPERATIONS
      MyArrayList array = new MyArrayList();
      array.add(3);
      array.print();
      array.add(2);
      array.add(6);
      array.add(9);
      array.print();
      array.remove(1);
      array.print();
      System.out.println(array.get(0));
      array.set(2,10);
      array.print();
      System.out.println(array.last());
      System.out.println(array.first());
      System.out.println(array.indexOf(6));
      System.out.println(array.size());
      array.add(2,11);
      array.print();



    }
}