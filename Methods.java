package section1;

public class Methods {

  public static void printJava() {
    System.out.println("Hello Java");
  }

  public static void printName(String name) {
    System.out.println(name);
  }

  public static void printSum(int a, int b) {
    System.out.println(a + b);
  }

  public static void main(String[] args) {
    printJava();
    printJava();
    printName("Aman");
    printName("Akku");

    printSum(4, 2);
  }
}
