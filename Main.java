package section1;

import java.util.*;

public class Main {

  public static void main(String[] args) {
    //System.out.println("hello world");
    //variables

    //*************************** */
    // String
    //String name = "sid";
    //int age = 30;
    //System.out.println(age+" "+name);

    //byte - 1 [-128 to 127]
    //short - 2
    //int - 4
    //long - 8
    //float - 4 ,  3.1545
    //double - 8
    //char - 2 - a,b,c...
    //boolean - 1 true / false

    // byte age = 30;
    //  int phone = 6565496265622;  //error int is out of range
    //long phone2 = 4451632566654L;
    //float phone22 = 5.3232566654F;
    //double phone222 = 32325666515544554D;
    //System.out.println(phone);

    //**************************** */
    // Non-primitive types
    // String name = "Aman";
    // String name = new String("Aman");
    //  System.out.println(name.length());

    /**************************** */
    //Strings

    //concatinate
    // String name1 = "Aman";
    //String name2 = "Akku";

    // String name3 = name1+" and "+name2;
    // System.out.println(name3);

    //**************** */
    // charAt

    //String name = "Aman";
    //System.out.println(name.charAt(2));

    //********************* */
    //length
    //String name = "Aman";
    //System.out.println(name.length());

    //********************** */
    //replace

    // String name = "Aman";
    // String name2 = name.replace("a","g");
    // System.out.println(name2)4

    //***************** */
    //substring
    //String name = "Aman and Akku";
    //System.out.println(name.substring(5, 8)); //and

    ///********************** */
    //Arrays
    // int[] marks = new int[3];

    /* marks[0] = 97;
    marks[1] = 87;
    marks[2] = 77; */

    // System.out.println(marks.length); //3

    //sort /******************** */
    //System.out.println(marks[0]);

    //Arrays.sort(marks); //4
    //System.out.println(marks[0]);

    // 2d array //******************* */
    // int[] marks = {97,98,95};

    // int[][] finalMarks = {{45,96,56},{98,97,91}};

    // System.out.println(finalMarks[0][2]); //56

    //************************ */
    //casting
    //Explicit casting

    /* double price = 100.00;
    double finalPrice = price + 18;
    System.out.println(finalPrice);

    int p = 100;
    int fp = p + (int)18.0;
    System.out.println(fp); */

    //*********** */
    //constants

    // final float PI = 3.14F; // not change value constant data

    //System.out.println(PI);

    //**************** */
    //Operators

    //  + - * / %

    /* int a = 1;
    int b = 2;
    int div = a / b;
    System.out.println(div); */// 0

    /* double a = 1;
    double b = 2;
    double div = a % b;
    System.out.println(div);    // 1.0 */

    // int nub = 1;
    /* System.out.println(nub++); // 1
    System.out.println(++nub); // 3

    System.out.println(++nub); // 4
    System.out.println(nub++); // 4 */

    /*  System.out.println(nub--); // 1
    System.out.println(--nub); // -1

    System.out.println(--nub); // -2
    System.out.println(nub--); // -2 */

    //Math class
    //************** */
    //Maths
    //max value
    //System.out.println(Math.max(5,6));
    //min
    //System.out.println(Math.min(5,6));

    //random
    //System.out.println(Math.random()); // 0.6610284176227633

    // System.out.println((int)(Math.random()*100)); //94 random

    //*********************** */
    //Input to take
    // Scanner sc = new Scanner(System.in);
    //int age = sc.nextInt();
    //float age = sc.nextFloat();
    //double age = sc.nextDouble();

    // String name = sc.next(); // accept single word
    //  String name = sc.nextLine(); // accept single word

    // System.out.println(name);

    //***************** */
    //Comparison Operators
    // a == b
    // a !== b
    // a < b
    // a > b
    // a <= b
    // a >= b

    //***************** */
    //Conditional Statements
    /*  boolean isSunUp = true;

    if(isSunUp == true){
      System.out.println("day");
    }else{
      System.out.println("night");
    }
 */

    ///***************** */
    //logical Operators

    // &&

    /*  int a = 30;
    int b = 40;
    if (a < 50 && b < 50) System.out.println(
      "both less than 50"
    ); else System.out.println("greater");
 */
    // ||
    /*  int a = 30;
    int b = 40;
    if (a > 50 || b < 50) System.out.println(
      "at least one less than 50"
    ); else System.out.println("greater"); */

    // !

    /* boolean isAdult = true;
    if(!isAdult){
      System.out.println("is adult");
    }else{
      System.out.println("not Adult");
    }
 */

    //************ */
    //switch

    /*  int day = 1; // 1- Monday , 2 - tuesday

    switch (day) {
      case 1:
        System.out.println("Monday");
        break;
      case 2:
        System.out.println("Tuesday");
        break;
      default:
        System.out.println("Wed - sun");
    } */

    //*************** */
    //Loops

    //**************** */
    //For loop

    // 1 - 10
    /*  for (int i = 1; i <= 10; i++) {
      System.out.println(i);
    } */

    // 10 - 1
    /*  for (int i = 10; i >= 1; i--) {
      System.out.println(i);
    } */

    //************ */
    //While loop

    /*  int i = 1;
    while (i <= 10) {
      System.out.println(i);
      i++;
    } */

    //*********** */
    // do while

    // repetedly use code do while first print then check condition
    /*  int i = 1;
    do {
      System.out.println(i);
      i++;
    } while (i <= 10); */

    /*
    int num = 1;
    Scanner sc = new Scanner(System.in);
    do{
      System.out.println("Enter value");
      num = sc.nextInt();
    }while(num >= 0);

    System.out.println("End code"); */

    //**************** */
    //Break & Continue
    /*     int i = 0;
    while (true) {
      if (i == 3) {
        i++;
        continue; // 3 skip
      }

      System.out.println(i);

      i++;

      if (i > 5) {
        break;   // stop code
      }
    } */

    //************* */
    //Try - Catch in exception Handling
    /* int[] marks = { 97, 98, 95 };

    try {
      System.out.println(marks[5]);
    } catch (Exception exception) {
      // do things after catching
      System.out.println(exception);
    }
    System.out.println("This student name is Aman"); */



    //****************** */
    //Methods / Functions
    
    //System.out.println("Hello Java ");

  }
}
