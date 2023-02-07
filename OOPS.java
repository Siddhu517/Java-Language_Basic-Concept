//package section1;

class Pen {

  String color;
  String type;

  public void write() {
    System.out.println("writing something");
  }

  public void read() {
    System.out.println("reading something");
  }

  public void printColor() {
    System.out.println(this.color);
  }
}

class Student {

  String name;
  int age;

  public void printInfo() {
    System.out.println(this.name);
    System.out.println(this.age);
  }

  // 1} non parameterise constructor
  /*  Student(){
    System.out.println("constructor");
  } */

  // 2} parameterise constructor
  /* Student(String name, int age) {
    this.name = name;
    this.age = age;
  } */

  // 3} copy constructor
  Student(Student s2) {
    this.name = s2.name;
    this.age = s2.age;
  }

  Student() {}
}

public class OOPS {

  public static void main(String[] args) {
    /* Pen pen1 = new Pen();
    pen1.color = "red";
    pen1.type = "gel";

    pen1.write();
    pen1.read();
    pen1.printColor();

    Pen pen2 = new Pen();
    pen2.color = "blue";
    pen2.type = "bollpoint";

    pen2.printColor(); */

    //****************** */
    // 1} non parameterise constructor **************

    /* Student student1 = new Student();

    student1.name = "aman";
    student1.age = 20; */

    // student1.printInfo();

    //**************** */
    /*  // 2} parameterise constructor *************
    Student student1 = new Student("aman",22);

    student1.printInfo(); */

    // copy constructor
    Student s1 = new Student();
    s1.name = "Aman";
    s1.age = 20;

    Student s2 = new Student(s1);

    s1.printInfo();
  }
}
