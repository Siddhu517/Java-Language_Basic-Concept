package section1;

class Pen {
  String color;
  String type;

  public void write(){
    System.out.println("writing something");
  }
}

public class OOPS {

  public static void Main(String[] args) {
    Pen pen1 = new Pen();
    pen1.color="red";
    pen1.type="gel";
    
    pen1.write();
  }
}
