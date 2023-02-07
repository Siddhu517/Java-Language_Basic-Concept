package bank;


class Account {

  //accesmodifier
  // 1} public
  public String name;

  // 2} default
  String id;

  // 3} protected
  protected String email;

  //4} private
  private String password;


  //getters & setters

  /* public String getPassword() {
    return this.password;
  }

  public void setPassword(String pass) {
    this.password = pass;
  } */

  public String getPassword() {
    setPassword("randomPass");
    return this.password;
  }

  private void setPassword(String pass) {
    this.password = pass;
  }

}

public class Bank {

  public static void main(String args[]) {
    Account account1 = new Account();
    account1.name = "Apna College";
    account1.email = "apnacollege@gmail.com";
   // account1.setPassword("asdf");
    System.out.println(account1.getPassword());
  }
}
