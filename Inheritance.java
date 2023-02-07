//Inheritance

//1} Single Level Inheritance
//2} Multi Level Inheritance
//3} Hierarchial Inheritance
//4} Hybrid Inheritance

import java.util.*;
//import bank;

class Shape {

  public void area() {
    System.out.println("display");
  }
}

class Triangle extends Shape {

  public void area(int l, int h) {
    System.out.println(1 / 2 * l * h);
  }
}

class EquilateralTriangle extends Triangle {

  public void area(int l, int h) {
    System.out.println(1 / 2 * l * h);
  }
}

class Circle extends Shape {

  public void area(int r) {
    System.out.println((3.14) * r * r);
  }
}


public class Inheritance {

  public static void main(String[] args) {
  /* bank.account1 = new bank.Account();
  account1.name = "customer1"; */
  }
}
